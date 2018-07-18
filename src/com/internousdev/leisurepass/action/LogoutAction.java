package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private String categoryId;
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		String loginId = String.valueOf(session.get("loginId"));
		// ログイン保持
		boolean savedLoginId = Boolean.valueOf(String.valueOf(session.get("savedLoginId")));
		int count = userInfoDAO.logout(loginId);
			if (count > 0) {
				session.clear();
				if(savedLoginId){
					session.put("savedLoginId",savedLoginId);
					session.put("keepLoginId", loginId);
					result = SUCCESS;
				}else{
					session.put("savedLoginId", savedLoginId);
					result = SUCCESS;
				}
		}
		return result;
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
