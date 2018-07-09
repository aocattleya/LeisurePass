package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AdminProductAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;

	private List<ProductInfoDTO> productList = new ArrayList<ProductInfoDTO>();

	public String execute() {

		ProductInfoDAO dao = new ProductInfoDAO();
		productList = dao.getProductInfoList();

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
