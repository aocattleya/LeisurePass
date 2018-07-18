package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class EditProductAction extends ActionSupport implements SessionAware {

	private int id;

	private Map<String, Object> session;

	public String execute() {

		ProductInfoDAO dao = new ProductInfoDAO();
		ProductInfoDTO dto = dao.selectById(id);

		System.out.println(id);

		// 編集ボタンを押した商品のidをsessionに格納
		session.put("editProductDTO", dto);

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return SUCCESS;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
