package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AddProductCompleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() {

		ProductInfoDTO dto = (ProductInfoDTO) session.get("addProductDTO");

		ProductInfoDAO dao = new ProductInfoDAO();
		dao.insert(dto.getProductId(), dto.getProductName(), dto.getProductNameKana(), dto.getProductDescription(),
				dto.getCategoryId(), dto.getPlaceId(), dto.getPrice(), dto.getImageFilePath(), dto.getImageFileName(),
				dto.getReleaseDate(), dto.getReleaseCompany(), dto.getLocation(), dto.getAccess(), dto.getUrl(),
				dto.getStatus(), dto.getStartDate(), dto.getEndDate(), dto.getRegistDate(), dto.getUpdateDate());

		// System.out.println(dto.getReleaseDate());
		// System.out.println(dto.getStartDate());
		// System.out.println(dto.getEndDate());
		// System.out.println(dto.getRegistDate());
		// System.out.println(dto.getUpdateDate());
		String result = SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}