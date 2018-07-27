package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.AdminItemDAO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.CommonUtility;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteProductCompleteAction extends ActionSupport implements SessionAware {

	private int id;
	public Map<String, Object> session;

	public String execute() throws Exception{
		CommonUtility.checkLoginAdmin(session);

		//System.out.println(session.get("deleteProductDTO"));
		ProductInfoDTO dto = (ProductInfoDTO) session.get("deleteProductDTO");

		if (dto != null){
			AdminItemDAO dao = new AdminItemDAO();
			System.out.println(dto.getId());
			System.out.println(dto.getProductId());
			dao.deleteCart(dto.getProductId());
			dao.invalidProduct(dto.getId());
		}

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