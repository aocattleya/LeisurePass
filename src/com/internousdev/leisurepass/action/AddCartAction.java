package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.CartInfoDAO;
import com.internousdev.leisurepass.dto.CartInfoDTO;
import com.internousdev.leisurepass.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware {
	private int productId;
	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String imageFileName;
	private int price;
	private String productCount;
	private String releaseCompany;
	private String productDescription;
	private String categoryId;
	private Map<String, Object> session;


	public String execute() {
		List<String> overErrorMessage = new ArrayList<String>();
		List<String> shortageErrorMessage = new ArrayList<String>();
		List<String> noCountErrorMessage = new ArrayList<String>();
		List<String> errorMessage = new ArrayList<String>();
		CommonUtility commonUtility = new CommonUtility();
		String tempUserId = null;
		String userId = null;
		String result = ERROR;
		// ログインしてないときにカートに商品を入れた場合、仮ＩＤを生成して
		// ひとまず仮のユーザーのカートに商品が入るようになる
		if (!(session.containsKey("loginId")) && !(session.containsKey("tempUserId"))) {
			session.put("tempUserId", commonUtility.randomValue());
		}

		// loginIdがsessionに入っていればsessionのloginIdをStringに変換代入することで
		// テーブルにはloginIdはないのでここでuserIdとloginIdをヒモ付ける
		if (session.containsKey("loginId")) {
			userId = String.valueOf(session.get("loginId"));
		}

		if (!(session.containsKey("loginId")) && session.containsKey("tempUserId")) {
			userId = String.valueOf(session.get("tempUserId"));
		}

		// 仮ＩＤのみ入ってる場合、仮ＩＤをuserIdに代入し
		// 「session」のtempUserIdを「変数」のtempUserIdに代入
		if (!(session.containsKey("loginId")) && session.containsKey("tempUserId")) {
			userId = String.valueOf(session.get("tempUserId"));
			tempUserId = String.valueOf(session.get("tempUserId"));
		}

		// 商品画面からカート(cart_infoテーブル)に何かしら情報が入ればSUCCESS→画面遷移
		CartInfoDAO cartInfoDao = new CartInfoDAO();

		//商品をカートに追加後、ページを更新した際に商品が再度追加されてしまうのを防ぐ
		if(!session.containsKey("addProductFlag")){

		if(cartInfoDao.existProductId(userId, productId)){
			cartInfoDao.productUpDate(userId, tempUserId, productId, productCount, price);
		}else{
			cartInfoDao.regist(userId, tempUserId, productId, productCount, price);
		}


		if (Integer.parseInt(productCount) > 0 && Integer.parseInt(productCount) < 6) {
			result = SUCCESS;
		} else if (Integer.parseInt(productCount) > 6) {
			overErrorMessage.add("在庫を超える数値が投入されたため、カートに商品が投入されませんでした");
			session.put("overErrorMessage",overErrorMessage);
			result = ERROR;
		} else if (Integer.parseInt(productCount) == 0) {
			noCountErrorMessage.add("投入数が0のため、カートに商品が投入されませんでしたた");
			session.put("noCountErrorMessage",noCountErrorMessage);
			result = ERROR;
		} else if (Integer.parseInt(productCount) < -1) {
			shortageErrorMessage.add("投入数が不足しているため、カートに商品が投入されませんでした");
			session.put("shortageErrorMessage",shortageErrorMessage);
			result = ERROR;
		} else {
			errorMessage.add("カート投入数が不正です。");
			session.put("errorMessage",errorMessage);
			result = ERROR;
		}

		session.put("addProductFlag", true);
		}else{
			result=SUCCESS;
		}

		// リストの中身取り出し
		List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
		cartInfoDtoList = cartInfoDao.getCartInfoDtoList(userId);
		Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();

		// リストに何も入っていなければsessionにnullを入れ、
		// JSPにて「カート情報はありません」の表示を出させる
		if (!(iterator.hasNext())) {
			cartInfoDtoList = null;
		}

		// sessionにデータを入れて次の画面に持っていく
		session.put("cartInfoDtoList", cartInfoDtoList);

		// 合計金額の表示
		int totalPrice = Integer.parseInt(String.valueOf(cartInfoDao.getTotalPrice(userId)));
		session.put("totalPrice", totalPrice);
		return result;


	}

	///////////////// getter/setter//////////////
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}

	public String getReleaseCompany() {
		return releaseCompany;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
