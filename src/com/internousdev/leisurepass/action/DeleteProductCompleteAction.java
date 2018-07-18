package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductCompleteAction extends ActionSupport implements SessionAware {

	private int id;
	public Map<String, Object> session;

	public String execute() {

		System.out.println(session.get("deleteId"));
		id = (int) session.get("deleteId");
		ProductInfoDAO dao = new ProductInfoDAO();
		dao.delete(id);

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}