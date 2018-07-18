package com.internousdev.leisurepass.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.InputChecker;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class AddProductConfirmAction extends ActionSupport implements SessionAware {

	private int id;
	private int productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int categoryId;
	private int placeId;
	private int price;
	private String imageFilePath;
	private String imageFileName;
	private Date releaseDate;
	private String releaseCompany;
	private String location;
	private String access;
	private String url;
	private int status;
	private Date startDate;
	private Date endDate;
	private Date registDate;
	private Date updateDate;
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

	public String execute() {

		// フォーム入力制限のチェック
		InputChecker inputChecker = new InputChecker();
		// 商品ID:1～11文字, 半角数字のみ入力可能
		// productIdErrorMessageList = inputChecker.doCheck("商品ID", productId,
		// 1, 11, true, false, false, true, false,
		// false, false, false);
		// 商品名:1～100文字, 全角の日本語のみ入力可能
		productNameErrorMessageList = inputChecker.doCheck("商品名", productName, 1, 100, false, true, true, false, false,
				true, false, false);
		// 商品名かな:1～100文字, ひらがなのみ入力可能
		productNameKanaErrorMessageList = inputChecker.doCheck("商品名かな", productNameKana, 1, 100, false, false, true,
				false, false, false, false, false);
		// 商品詳細:1～500文字, スペース以外入力可能
		productDescriptionErrorMessageList = inputChecker.doCheck("商品詳細", productDescription, 1, 500, true, true, true,
				true, true, true, true, false);
		// 価格:1～11文字, 半角英数字のみ入力可能
		// priceErrorMessageList = inputChecker.doCheck("価格", price, 1, 11,
		// false, false, false, false, true, false, false,
		// false);
		// // 発売年月:1～16文字, 半角英数字と記号でyyyy-mm-ddの形式のみ入力可能
		// releaseDateErrorMessageList = inputChecker.doCheck("発売年月",
		// releaseDate, 10, 10, false, false, false, true, true,
		// false, false, false);
		// 発売会社:1～100文字, 全角の日本語のみ入力可能
		releaseCompanyErrorMessageList = inputChecker.doCheck("発売会社", releaseCompany, 1, 100, false, true, true, false,
				false, true, false, false);
		// 所在地:1～255文字, 全角の日本語と記号、半角英数字のみ入力可能
		locationErrorMessageList = inputChecker.doCheck("所在地", location, 1, 255, false, true, true, true, true, true,
				true, false);
		// アクセス:1～255文字, 全角の日本語と記号、半角英数字のみ入力可能
		accessErrorMessageList = inputChecker.doCheck("アクセス", access, 1, 255, false, true, true, true, true, true, true,
				false);
		// url:1～255文字, 半角英数字と記号のみ入力可能
		urlErrorMessageList = inputChecker.doCheck("URL", url, 1, 255, true, false, false, true, true, false, false,
				false);
		// 開始日:1～16文字, 半角英数字と記号でyyyy-mm-ddの形式のみ入力可能
		// startDateErrorMessageList = inputChecker.doCheck("開始日", startDate,
		// 10, 10, false, false, false, true, true,
		// false, false, false);
		// // 終了日:1～16文字, 半角英数字と記号でyyyy-mm-ddの形式のみ入力可能
		// endDateErrorMessageList = inputChecker.doCheck("終了日", endDate, 10,
		// 10, false, false, false, true, true, false,
		// false, false);

		if (!(productIdErrorMessageList.size() == 0 && productNameErrorMessageList.size() == 0
				&& productNameKanaErrorMessageList.size() == 0 && productDescriptionErrorMessageList.size() == 0
				&& priceErrorMessageList.size() == 0 && releaseDateErrorMessageList.size() == 0
				&& releaseCompanyErrorMessageList.size() == 0 && locationErrorMessageList.size() == 0
				&& accessErrorMessageList.size() == 0 && urlErrorMessageList.size() == 0
				&& startDateErrorMessageList.size() == 0 && endDateErrorMessageList.size() == 0)) {

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
			// return ERROR;
		}

		// フォーム入力内容をsessionに格納（修正用）
		System.out.println(productImage);
		System.out.println(productImageContentType);
		System.out.println(productImageFileName);
		System.out.println(12345);

		ProductInfoDTO dto = new ProductInfoDTO();
		dto.setId(id);
		dto.setProductId(productId);
		dto.setProductName(productName);
		dto.setProductNameKana(productNameKana);
		dto.setProductDescription(productDescription);
		dto.setCategoryId(categoryId);
		dto.setPlaceId(placeId);
		dto.setPrice(price);
		dto.setImageFilePath(imageFilePath);
		dto.setImageFileName(imageFileName);
		dto.setReleaseDate(releaseDate);
		dto.setReleaseCompany(releaseCompany);
		dto.setLocation(location);
		dto.setAccess(access);
		dto.setUrl(url);
		dto.setStatus(status);
		dto.setStartDate(startDate);
		dto.setEndDate(endDate);
		dto.setRegistDate(registDate);
		dto.setUpdateDate(updateDate);

		session.put("addProductDTO", dto);
		session.put("productImage", productImage);
		session.put("productImageContentType", productImageContentType);
		session.put("productImageFileName", productImageFileName);

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

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
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

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
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

	public void productProductImage(File productImage) {
		this.productImage = productImage;
	}

}
