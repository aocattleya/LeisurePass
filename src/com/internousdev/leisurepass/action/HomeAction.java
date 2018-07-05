package com.internousdev.leisurepass.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.MCategoryDAO;
import com.internousdev.leisurepass.dao.MPlaceDAO;
import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.dto.MPlaceDTO;
import com.internousdev.leisurepass.util.CommonUtility;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{

	private String placeId;
	private String categoryId;
	private String placeName;
	private String categoryName;

	private Map<String, Object> session;

	public String execute() {

		if (!(session.containsKey("loginId")) && !(session.containsKey("tempUserId"))) {
			// ログインしていない場合は一時的にユーザーIDをランダムで設定
			 CommonUtility commonUtility = new CommonUtility();
			 session.put("tempUserId", commonUtility.RandomValue());
		}

		if(!session.containsKey("logined")) {
			// 未ログイン
			session.put("logined", 0);
		}

		if(!session.containsKey("mPlaceList")) {
			// 場所リストを取得
			MPlaceDAO mPlaceDao = new MPlaceDAO();
			List<MPlaceDTO> mPlaceDtoList = mPlaceDao.getMPlaceList();
			session.put("mPlaceDtoList", mPlaceDtoList);
		}

		if(!session.containsKey("mCategoryList")) {
			// カテゴリーを取得
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			List<MCategoryDTO> mCategoryDtoList = mCategoryDao.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}

		return SUCCESS;
	}

	public String getCategoryId() {
		System.out.println("getCategoryId: " + categoryId);
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		System.out.println("setCategoryId: " + categoryId);
		this.categoryId = categoryId;
	}

	public String getPlaceId() {
		System.out.println("getPlaceId: " + placeId);
		return placeId;
	}

	public void setPlaceId(String placeId) {
		System.out.println("setPlaceId: " + placeId);
		this.placeId = placeId;
	}

	public String getPlaceName() {
		System.out.println("getPlaceName: " + placeName);
		return placeName;
	}

	public void setPlaceName(String placeName) {
		System.out.println("setPlaceName: " + placeName);
		this.placeName = placeName;
	}

	public String getCategoryName() {
		System.out.println("getCategoryName: " + categoryName);
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		System.out.println("setCategoryName: " + categoryName);
		this.categoryName = categoryName;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}