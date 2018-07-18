package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.CartInfoDAO;
import com.internousdev.leisurepass.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
//import com.internousdev.leisurepass.dao.MCategoryDAO;
//import com.internousdev.leisurepass.dto.MCategoryDTO;

public class CartAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;
//	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private String categoryId;
	private String keywords;

	public String execute() {
		String userId = null;
		List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
		String result = ERROR;
		session.remove("checkListErrorMessageList");

		// loginId か tempUserIdがあればuserIdに変換しとりあえずユーザー確認
		if (session.containsKey("loginId")) {
			userId = String.valueOf(session.get("loginId"));
			session.put("userId", userId);
		} else if (session.containsKey("tempUserId")) {
			userId = String.valueOf(session.get("tempUserId"));
			session.put("userId", userId);
		}

		CartInfoDAO cartInfoDao = new CartInfoDAO();
		cartInfoDtoList = cartInfoDao.getCartInfoDtoList(userId);
		Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();

		// jspで商品情報なしのメッセージを表示するためにリストにnullを代入
		if (!(iterator.hasNext())) {
			cartInfoDtoList = null;
		}
		session.put("cartInfoDtoList", cartInfoDtoList);

		// カート内合計金額の表示
		int totalPrice = Integer.parseInt(String.valueOf(cartInfoDao.getTotalPrice(userId)));
		session.put("totalPrice", totalPrice);

		result = SUCCESS;

//		if (!session.containsKey("mCategoryList")) {
//			MCategoryDAO mCategoryDao = new MCategoryDAO();
//			mCategoryDtoList = mCategoryDao.getMCategoryList();
//			session.put("mCategoryDtoList", mCategoryDtoList);
//		}

		return result;
	}

	//////////getter,setter//////////
	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
}
