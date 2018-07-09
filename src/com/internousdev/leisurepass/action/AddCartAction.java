package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Date;
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
	private Date releaseDate;
	private String productDescription;
	private String categoryId;
	private Map<String, Object> session;
	private String overErrorMessage;
	private String shortageErrorMessage;
	private String noCountErrorMessage;
	private String errorMessage;

	public String execute() {
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
		cartInfoDao.regist(userId, tempUserId, productId, productCount, price);
		if (Integer.parseInt(productCount) > 0 && Integer.parseInt(productCount) < 6) {
			result = SUCCESS;
		} else if (Integer.parseInt(productCount) > 6) {
			result = ERROR;
			setOverErrorMessage("在庫を超える数値が投入されたため、カートに商品が投入されませんでした");
		} else if (Integer.parseInt(productCount) == 0) {
			result = ERROR;
			setNoCountErrorMessage("投入数が0のため、カートに商品が投入されませんでした");
		} else if (Integer.parseInt(productCount) < -1) {
			result = ERROR;
			setShortageErrorMessage("投入数が不足しているため、カートに商品が投入されませんでした");
		} else {
			result = ERROR;
			setErrorMessage("カート投入数が不正です。");
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

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
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

	public String getOverErrorMessage() {
		return overErrorMessage;
	}

	public void setOverErrorMessage(String overErrorMessage) {
		this.overErrorMessage = overErrorMessage;
	}

	public String getShortageErrorMessage() {
		return shortageErrorMessage;
	}

	public void setShortageErrorMessage(String shortageErrorMessage) {
		this.shortageErrorMessage = shortageErrorMessage;
	}

	public String getNoCountErrorMessage() {
		return noCountErrorMessage;
	}

	public void setNoCountErrorMessage(String noCountErrorMessage) {
		this.noCountErrorMessage = noCountErrorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
