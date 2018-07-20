package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.AdminItemDAO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductConfirmAction extends ActionSupport implements SessionAware {

	private int id;

	public Map<String, Object> session;

	public String execute() {

		// 削除ボタンを押した商品のidをsessionに格納（削除確認画面で表示するため）
		AdminItemDAO dao = new AdminItemDAO();
		ProductInfoDTO dto = dao.selectById(id);
		session.put("deleteProductDTO", dto);

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

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
