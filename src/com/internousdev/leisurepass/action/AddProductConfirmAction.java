package com.internousdev.leisurepass.action;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.AddProductDAO;
import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.dto.MPlaceDTO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.CommonUtility;
import com.internousdev.leisurepass.util.InputChecker;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class AddProductConfirmAction extends ActionSupport implements SessionAware {

	private int id;
	private String productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private String categoryId;
	private String placeId;
	private String price;
	private String imageFilePath;
	private String imageFileName;
	private String releaseDate;
	private String releaseCompany;
	private String location;
	private String access;
	private String url;
	private String startDate;
	private String endDate;
	private Map<String, Object> session;

	// 画像ファイル受け渡し用
	private File productImage;
	private String productImageContentType;
	private String productImageFileName;

	// inputchecker用
	private List<String> productIdErrorMessageList = new ArrayList<String>();
	private List<String> productNameErrorMessageList = new ArrayList<String>();
	private List<String> productNameKanaErrorMessageList = new ArrayList<String>();
	private List<String> productDescriptionErrorMessageList = new ArrayList<String>();
	private List<String> priceErrorMessageList = new ArrayList<String>();
	private List<String> releaseDateErrorMessageList = new ArrayList<String>();
	private List<String> releaseCompanyErrorMessageList = new ArrayList<String>();
	private List<String> locationErrorMessageList = new ArrayList<String>();
	private List<String> accessErrorMessageList = new ArrayList<String>();
	private List<String> urlErrorMessageList = new ArrayList<String>();
	private List<String> startDateErrorMessageList = new ArrayList<String>();
	private List<String> endDateErrorMessageList = new ArrayList<String>();
	private List<String> productImageErrorMessageList = new ArrayList<String>();

	public String execute() throws Exception {
		session.remove("productIdErrorMessageList");
		session.remove("productNameErrorMessageList");
		session.remove("productNameKanaErrorMessageList");
		session.remove("productDescriptionErrorMessageList");
		session.remove("priceErrorMessageList");
		session.remove("releaseDateErrorMessageList");
		session.remove("releaseCompanyErrorMessageList");
		session.remove("locationErrorMessageList");
		session.remove("accessErrorMessageList");
		session.remove("urlErrorMessageList");
		session.remove("startDateErrorMessageList");
		session.remove("endDateErrorMessageList");
		session.remove("productImageErrorMessageList");

		CommonUtility.checkLoginAdmin(session);

		String result = ERROR;

		// フォーム入力制限のチェック
		InputChecker inputChecker = new InputChecker();
		// 商品ID:1～9文字, 半角数字のみ入力可能
		productIdErrorMessageList = inputChecker.doCheck("商品ID", productId, 1, 9, false, false, false, true, false,
				false, false, false, false);
		// 商品名:1～20文字, 全角の日本語のみ入力可能
		productNameErrorMessageList = inputChecker.doCheck("商品名", productName, 1, 20, true, true, true, false, false,
				true, false, false, false);
		// 商品名かな:1～100文字, ひらがなのみ入力可能
		productNameKanaErrorMessageList = inputChecker.doCheck("商品名かな", productNameKana, 1, 20, false, false, true,
				false, false, false, false, false, false);
		// 商品詳細:1～500文字, スペース以外入力可能
		productDescriptionErrorMessageList = inputChecker.doCheck("商品詳細", productDescription, 1, 200, true, true, true,
				true, true, true, true, false, true);
		// 価格:1～5文字, 半角英数字のみ入力可能
		priceErrorMessageList = inputChecker.doCheck("価格", price, 1, 5, false, false, false, true, false, false, false,
				false, false);
		// // 発売年月:1～16文字, 半角英数字と記号でyyyy-mm-ddの形式のみ入力可能
		// releaseDateErrorMessageList = inputChecker.doCheck("発売年月",
		// releaseDate, 10, 10, false, false, false, true, true, false, false,
		// false);
		releaseDateErrorMessageList = checkDate("発売年月", releaseDate);
		// 発売会社:1～100文字, 全角の日本語のみ入力可能
		releaseCompanyErrorMessageList = inputChecker.doCheck("発売会社", releaseCompany, 1, 20, true, true, true, false,
				false, true, false, false, false);
		// 所在地:1～255文字, 全角の日本語と記号、半角英数字、全角英数字のみ入力可能
		locationErrorMessageList = inputChecker.doCheck("所在地", location, 1, 20, false, true, true, true, true, true,
				true, false, true);
		// アクセス:1～255文字, 全角の日本語と記号、半角英数字、全角英数字のみ入力可能
		accessErrorMessageList = inputChecker.doCheck("アクセス", access, 1, 20, false, true, true, true, true, true, true,
				false, true);
		// url:1～255文字, 半角英数字と記号のみ入力可能
		urlErrorMessageList = inputChecker.doCheck("URL", url, 1, 100, true, false, false, true, true, false, false,
				false, false);
		// 開始日:1～16文字, 半角英数字と記号でyyyy-mm-ddの形式のみ入力可能
		// startDateErrorMessageList = checkDate("開始日", startDate);
		startDateErrorMessageList = checkDate("開始日", startDate);
		// // 終了日:1～16文字, 半角英数字と記号でyyyy-mm-ddの形式のみ入力可能
		// endDateErrorMessageList = inputChecker.doCheck("終了日", endDate, 10,
		// 10, false, false, false, true, true, false, false, false);
		endDateErrorMessageList = checkDate("終了日", endDate);

		if (productImage == null) {
			productImageErrorMessageList.add("画像ファイルを選択してください");
		}

		if(productImageContentType != null){
			if (!productImageContentType.equals("image/jpeg")) {
				productImageErrorMessageList.add("jpegを選択してください");
			}
		}

		ProductInfoDTO dto = new ProductInfoDTO();
		dto.setId(id);
		dto.setProductId(parseInt(productId));
		dto.setProductName(productName);
		dto.setProductNameKana(productNameKana);
		dto.setProductDescription(productDescription);
		dto.setCategoryId(parseInt(categoryId));
		dto.setPlaceId(parseInt(placeId));
		dto.setPrice(parseInt(price));
		dto.setImageFilePath("./images");
		dto.setImageFileName(productImageFileName);
		dto.setReleaseDate(parseDate(releaseDate));
		dto.setReleaseCompany(releaseCompany);
		dto.setLocation(location);
		dto.setAccess(access);
		dto.setUrl(url);
		// dto.setStatus(status);
		dto.setStartDate(parseDate(startDate));
		dto.setEndDate(parseDate(endDate));

		session.put("addProductDTO", dto);
		session.put("productImage", productImage);
		session.put("productImageContentType", productImageContentType);
		session.put("productImageFileName", productImageFileName);

		if (productIdErrorMessageList.size() == 0 && productNameErrorMessageList.size() == 0
				&& productNameKanaErrorMessageList.size() == 0 && productDescriptionErrorMessageList.size() == 0
				&& priceErrorMessageList.size() == 0 && releaseDateErrorMessageList.size() == 0
				&& releaseCompanyErrorMessageList.size() == 0 && locationErrorMessageList.size() == 0
				&& accessErrorMessageList.size() == 0 && urlErrorMessageList.size() == 0
				&& startDateErrorMessageList.size() == 0 && endDateErrorMessageList.size() == 0
				&& productImageErrorMessageList.size() == 0) {

			result = SUCCESS;

			System.out.println("imageFilePath:" + imageFilePath);
			System.out.println("imageFileName:" + imageFileName);

			// デフォルトの画像を挿入
			if (!(session.containsKey("image_flg"))) {
				session.put("image_file_name", "画像を選択してください");
				session.put("image_file_path", ".images/dummy");
			}
			// ファイルアップロードの処理(productImageFileNameが空でない場合)
			if (productImageFileName != null) {
				String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("images");
				System.out.println("Image Location:" + filePath);
				File fileToCreate = new File(filePath, productImageFileName);

				try {
					FileUtils.copyFile(productImage, fileToCreate);
					session.put("image_file_name", productImageFileName);
					session.put("image_file_path", "images/");
					session.put("image_flg", productImageFileName);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		} else {

			System.out.println(productIdErrorMessageList.toString());
			session.put("productIdErrorMessageList", productIdErrorMessageList);
			session.put("productNameErrorMessageList", productNameErrorMessageList);
			session.put("productNameKanaErrorMessageList", productNameKanaErrorMessageList);
			session.put("productDescriptionErrorMessageList", productDescriptionErrorMessageList);
			session.put("priceErrorMessageList", priceErrorMessageList);
			session.put("releaseDateErrorMessageList", releaseDateErrorMessageList);
			session.put("releaseCompanyErrorMessageList", releaseCompanyErrorMessageList);
			session.put("locationErrorMessageList", locationErrorMessageList);
			session.put("accessErrorMessageList", accessErrorMessageList);
			session.put("urlErrorMessageList", urlErrorMessageList);
			session.put("startDateErrorMessageList", startDateErrorMessageList);
			session.put("endDateErrorMessageList", endDateErrorMessageList);
			session.put("productImageErrorMessageList", productImageErrorMessageList);
			// return ERROR;
		}

		AddProductDAO addProductDAO = new AddProductDAO();

		if (productIdErrorMessageList.isEmpty()) {
			if (Integer.parseInt(productId) >= 1000000000) {
				productIdErrorMessageList.add("IDは9桁以下に設定してください");
				session.put("productIdErrorMessageList", productIdErrorMessageList);
				result = ERROR;

			}

			if (Integer.parseInt(productId) <= 0) {
				productIdErrorMessageList.add("IDは1以上に設定してください");
				session.put("productIdErrorMessageList", productIdErrorMessageList);
				result = ERROR;
			}

		}
		if (!(price.isEmpty())) {
			if (Integer.parseInt(price) >= 20000) {
				priceErrorMessageList.add("金額は20000未満に設定してください");
				session.put("priceErrorMessageList", priceErrorMessageList);
				System.out.println(session.get("priceErrorMessageList"));
				result = ERROR;
			}

			if (Integer.parseInt(price) <= 0) {
				priceErrorMessageList.add("金額は1以上に設定してください");
				session.put("priceErrorMessageList", priceErrorMessageList);
				System.out.println(session.get("priceErrorMessageList"));
				result = ERROR;
			}

		}
		if (productIdErrorMessageList.isEmpty()) {
			if (addProductDAO.productIdDuplication(Integer.parseInt(productId))) {
				productIdErrorMessageList.add("すでに同IDの商品があります。別のIDをお試しください");
				session.put("productIdErrorMessageList", productIdErrorMessageList);
				result = ERROR;
			}

		}

		if (addProductDAO.productnameDuplication(productName)) {
			productNameErrorMessageList.add("すでに同名の商品があります。別の名前をお試しください");
			session.put("productNameErrorMessageList", productNameErrorMessageList);
			result = ERROR;
		}

		if (addProductDAO.productnamekanaDuplication(productNameKana)) {
			productNameKanaErrorMessageList.add("すでに同ふりがなの商品があります。別のふりがなをお試しください");
			session.put("productNameKanaErrorMessageList", productNameKanaErrorMessageList);
			result = ERROR;
		}

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);
		loader.executeAdmin(session);

		// カテゴリIDが一致しているものを探す
		MCategoryDTO category = null;
		@SuppressWarnings("unchecked")
		List<MCategoryDTO> categoryList = (List<MCategoryDTO>) session.get("mAdminCategoryDtoList");
		for (int i = 0; i < categoryList.size(); i++) {
			MCategoryDTO m = categoryList.get(i);
			if (dto.getCategoryId() == m.getCategoryId()) {
				category = m;
				break;
			}
		}
		session.put("addProductDTOCategory", category.getCategoryName());

		// 場所IDが一致しているものを探す
		MPlaceDTO place = null;
		@SuppressWarnings("unchecked")
		List<MPlaceDTO> placeList = (List<MPlaceDTO>) session.get("mAdminPlaceDtoList");
		for (int i = 0; i < placeList.size(); i++) {
			MPlaceDTO m = placeList.get(i);
			if (dto.getPlaceId() == m.getPlaceId()) {
				place = m;
				break;
			}
		}
		session.put("addProductDTOPlace", place.getPlaceName());

		// フォーム入力内容をsessionに格納（修正用）
		System.out.println(productImage);
		System.out.println(productImageContentType);
		System.out.println(productImageFileName);
		System.out.println(12345);

		System.out.println(productDescription);

		return result;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameKana() {
		return productNameKana;
	}

	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public File getProductImage() {
		return productImage;
	}

	public void setProductImage(File productImage) {
		this.productImage = productImage;
	}

	public String getProductImageContentType() {
		return productImageContentType;
	}

	public void setProductImageContentType(String productImageContentType) {
		this.productImageContentType = productImageContentType;
	}

	public String getProductImageFileName() {
		return productImageFileName;
	}

	public void setProductImageFileName(String productImageFileName) {
		this.productImageFileName = productImageFileName;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	private int parseInt(String value) {
		int result = 0;
		try {
			result = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return result;
	}

	private Date parseDate(String value) {
		Date result = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			result = sdf.parse(value);
			return result;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
			result = sdf.parse(value);
			return result;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	private List<String> checkDate(String propertyName, String value) {
		List<String> errorList = new ArrayList<String>();

		if (StringUtils.isEmpty(value)) {
			errorList.add(propertyName + "を入力してください。");
		} else {
			try {
				DateUtils.parseDateStrictly(value, new String[] { "yyyy-MM-dd", "yyyy年MM月dd日" });
			} catch (ParseException e) {
				e.printStackTrace();
				errorList.add("yyyy-MM-dd か yyyy年MM月dd日 で入力してください");
			}
		}

		return errorList;
	}
}
