package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductConfirmAction extends ActionSupport implements SessionAware {

	private int id;

	public Map<String, Object> session;

	public String execute() {

		ProductInfoDAO dao = new ProductInfoDAO();
		ProductInfoDTO dto = dao.selectById(id);
		// 削除ボタンを押した商品のidをsessionに格納
		session.put("deleteProductDTO", dto);

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
