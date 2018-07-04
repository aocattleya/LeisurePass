package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

//import org.apache.struts2.intercepter.SessionAware;
//import com.internousdev.sampleweb.dao.UserInfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private Map<String, Object> session;
	public String execute() {
		String result = ERROR;
		UserInfoDAO userInfoDAO = new UserInfoDAO();
		String loginId = String.valueof(session.get("loginId"));
		//ログイン保持
		boolean savedLogiId = Boolean.valueOf(String.valueOf(session.get("savedLoginId")));
		int count  = userInfoDao.logout(loginId);
		if(count > 0) {
			session.clear();
			session.put("savedLoginId", savedLoginId);
			session.put("loginId", loginId);
			result = SUCCESS;
		}
		return result;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Oblect> session) {
		this.session = session;
	}
}
