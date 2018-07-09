package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.internousdev.leisurepass.dao.CartInfoDAO;
import com.internousdev.leisurepass.dto.CartInfoDTO;

public class CartAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {
		String userId = null;
		List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
		String result = ERROR;

		// loginId か tempUserIdがあればuserIdに変換しとりあえずユーザー確認
		if (session.containsKey("loginId")) {
			userId = String.valueOf(session.get("loginId"));
		} else if (session.containsKey("tempUserId")) {
			userId = String.valueOf(session.get("tempUserId"));
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
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
