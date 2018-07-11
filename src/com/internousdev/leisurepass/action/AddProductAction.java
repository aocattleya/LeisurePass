package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AddProductAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() {
		System.out.println(session.containsKey("addProductDTO"));
		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
