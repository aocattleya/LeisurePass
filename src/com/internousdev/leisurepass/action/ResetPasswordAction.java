package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;


public class ResetPasswordAction extends ActionSupport implements SessionAware{

	private String categoryId;
	private Map<String, Object> session;
	public String execute(){
		String result = ERROR;

		session.remove("passwordIncorrectErrorMessageList");

		session.remove("loginIdErrorMessageList");
		session.remove("passwordErrorMessageList");
		session.remove("newPasswordErrorMessageList");
		session.remove("reConfirmationNewPasswordErrorMessageList");
		session.remove("newPasswordIncorrectErrorMessageList");

		result = SUCCESS;

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return result;
	}

	public String getCategoryId(){
		return categoryId;
	}
	public void setCategoryId(String categoryId){
		this.categoryId = categoryId;
	}
	public Map<String,Object>getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}

}


