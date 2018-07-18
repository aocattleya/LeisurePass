package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class GoLoginAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	public String execute() {
		session.remove("goSettlement");
		session.remove("loginIdErrorMessageList");
		session.remove("passwordErrorMessageList");
		session.remove("loginFailedMessage");
		String result = SUCCESS;
		return result;
	}
	public Map<String, Object> getSession(){
		return session;
	}
	public void setSession(Map<String, Object> session){
		this.session = session;
	}
}