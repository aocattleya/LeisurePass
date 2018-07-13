package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductConfirmAction extends ActionSupport implements SessionAware {

	private int id;

	public Map<String, Object> session;

	public String execute() {

		// 削除ボタンを押した商品のidをsessionに格納
		session.put("deleteId", id);
		System.out.println(id);

		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
