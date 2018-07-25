package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.CommonUtility;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class AdminProductAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private List<ProductInfoDTO> productList = new ArrayList<ProductInfoDTO>();

	public String execute() throws Exception{
		CommonUtility.checkLoginAdmin(session);
		/* result= ERROR; */

		ProductInfoDAO dao = new ProductInfoDAO();
		productList = dao.getProductInfoList();

		session.remove("addProductDTO");


		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return SUCCESS;
	}

	public List<ProductInfoDTO> getProductList() {
		return productList;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
