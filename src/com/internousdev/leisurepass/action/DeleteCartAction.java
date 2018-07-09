package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.leisurepass.dao.CartInfoDAO;
import com.internousdev.leisurepass.dto.CartInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteCartAction extends ActionSupport implements SessionAware {
	private Collection<String> checkList;
	private Map<String, Object> session;


	public String execute() {
		String result = ERROR;
		int count = 0;
		CartInfoDAO cartInfoDAO = new CartInfoDAO();
		List<String>checkListErrorMessageList=new ArrayList<String>();

		// jspでチェックされなかった場合に出るエラー文
		if (checkList == null) {
			checkListErrorMessageList.add("チェックされていません。");
			session.put("checkListErrorMessageList", checkListErrorMessageList);
			return ERROR;
		}
		// カート内削除文、処理内容はcartInfoDAO.delete
		for (String id : checkList) {
			count += cartInfoDAO.delete(id);
		}
		// チェックしたもののIdが上手く[id]に入ってない場合に出るエラー文
		if (count <= 0) {
			checkListErrorMessageList.add("チェックされていません。");
			session.put("checkListErrorMessageList", checkListErrorMessageList);
			return ERROR;
		} else {
			String userId = null;

			List<CartInfoDTO> cartInfoDtoList=new ArrayList<CartInfoDTO>();
			if (session.containsKey("loginId")) {
				userId = String.valueOf(session.get("loginId"));
			}
			else if (session.containsKey("tempUserId")) {
				userId = String.valueOf(session.get("tempUserId"));
			}
			// 削除後の結果をsessionに入れて遷移できるようにする

			cartInfoDtoList = cartInfoDAO.getCartInfoDtoList(userId);
			Iterator<CartInfoDTO> Iterator = cartInfoDtoList.iterator();
			if (!(Iterator.hasNext())) {
				cartInfoDtoList = null;
			}
			session.put("cartInfoDtoList", cartInfoDtoList);

			 int totalPrice =
					 Integer.parseInt(String.valueOf(cartInfoDAO.getTotalPrice(userId)));
					 session.put("totalPrice", totalPrice);
			result = SUCCESS;
		}

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public void setCheckList(Collection<String> checkList) {
		this.checkList = checkList;
	}

}
