package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductDetailsAction extends ActionSupport implements SessionAware{
	private int productId;
	private List<MCategoryDTO> mCategoryList = new ArrayList<MCategoryDTO>();
	private List<ProductInfoDTO> productList = new ArrayList<ProductInfoDTO>();
	private String categoryId;
	private Map<String, Object> session;
	public String execute() {
		String result = ERROR;
		session.remove("addProductFlag");
		ProductInfoDAO productDAO = new ProductInfoDAO();
		ProductInfoDTO productDTO = new ProductInfoDTO();
		productDTO = productDAO.getProductInfo(productId);
		session.put("id", productDTO.getId());
		session.put("productId", productDTO.getProductId());
		session.put("productName", productDTO.getProductName());
		session.put("productNameKana", productDTO.getProductNameKana());
		session.put("imageFilePath", productDTO.getImageFilePath());
		session.put("imageFileName", productDTO.getImageFileName());
		session.put("price", productDTO.getPrice());

		session.put("releaseCompany", productDTO.getReleaseCompany());
		session.put("releaseDate", productDTO.getReleaseDate());
		session.put("productDescription", productDTO.getProductDescription());

		session.put("location",productDTO.getLocation());
		session.put("access", productDTO.getAccess());
		session.put("url", productDTO.getUrl());
		List<Integer> productCountList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		session.put("productCountList", productCountList);
		productList = productDAO.getProductInfoListByCategoryId(productDTO.getCategoryId(), productDTO.getProductId(),0,3);
		Iterator<ProductInfoDTO> iterator = productList.iterator();
		if(!(iterator.hasNext())) {
			productCountList = null;
		}
		if(!productList.isEmpty() || productCountList==null) {
			session.put("productInfoDtoList", productList);
			result = SUCCESS;
		}
		return result;
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryList;
	}

	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryList = mCategoryDtoList;
	}

	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public List<ProductInfoDTO> getProductInfoDtoList() {
		return productList;
	}
	public void setProductInfoDtoList(List<ProductInfoDTO> productInfoDtoList) {
		this.productList = productInfoDtoList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
