package com.internousdev.leisurepass.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.CartInfoDAO;
import com.internousdev.leisurepass.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class AddCartAction extends ActionSupport implements SessionAware{
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

public String execute(){
	CommonUtility commonUtility=new CommonUtility();
	String tempUserId=null;
	String userId=null;
	String result=ERROR;
	//ログインしてないときにカートに商品を入れた場合、仮ＩＤを生成して
	//ひとまず仮のユーザーのカートに商品が入るようになる
	if(!(session.containsKey("loginId") && session.containsKey("tempUserId"))){
		session.put("tempUserId", commonUtility.RandomValue());
	}
	//loginIdがsessionに入っていればsessionのloginIdをStringに変換代入することで
	//テーブルにはloginIdはないのでここでuserIdとloginIdをヒモ付ける
	if(session.containsKey("loginId")){
		userId = String.valueOf(session.get("loginId"));
	}
	//仮ＩＤのみ入ってる場合、仮ＩＤをuserIdに代入し
	//「session」のtempUserIdを「変数」のtempUserIdに代入
	if(!(session.containsKey("loginId")) && session.containsKey("tempUserId")){
		userId = String.valueOf(session.get("tempUserId"));
		tempUserId = String.valueOf(session.get("tempUserId"));
	}

	productCount = String.valueOf((productCount.split(" ,",0))[0]);//勉強中

	//商品画面からカートに何かしら商品等の情報が入ればSUCCESS→画面遷移
	CartInfoDAO cartInfoDAO =new CartInfoDAO();
	int count = cartInfoDAO.

	return result;
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

}
