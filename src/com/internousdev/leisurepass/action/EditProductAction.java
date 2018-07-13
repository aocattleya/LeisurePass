package com.internousdev.leisurepass.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class EditProductAction extends ActionSupport implements SessionAware {

	private int id;
	private int productId;
	private String productName;
	private String productNameKana;
	private String productDescription;
	private int categoryId;
	private int placeId;
	private int price;
	private String imageFilePath;
	private String imageFileName;
	private Date releaseDate;
	private String releaseCompany;
	private String location;
	private String access;
	private String url;
	private int status;
	private Date startDate;
	private Date endDate;
	private Date registDate;
	private Date updateDate;
	private Map<String, Object> session;

	public String execute() {

		ProductInfoDAO dao = new ProductInfoDAO();
		ProductInfoDTO dto = dao.selectById(id);

		System.out.println(id);
		System.out.println(dto);
		// ProductInfoDTO dto = new ProductInfoDTO();
		dto.setId(id);
		dto.setProductId(productId);
		dto.setProductName(productName);
		dto.setProductNameKana(productNameKana);
		dto.setProductDescription(productDescription);
		dto.setCategoryId(categoryId);
		dto.setPlaceId(placeId);
		dto.setPrice(price);
		dto.setImageFilePath(imageFilePath);
		dto.setImageFileName(imageFileName);
		dto.setReleaseDate(releaseDate);
		dto.setReleaseCompany(releaseCompany);
		dto.setLocation(location);
		dto.setAccess(access);
		dto.setUrl(url);
		dto.setStatus(status);
		dto.setStartDate(startDate);
		dto.setEndDate(endDate);
		dto.setRegistDate(registDate);
		dto.setUpdateDate(updateDate);

		System.out.println(dto.getReleaseDate());
		System.out.println(dto.getStartDate());
		System.out.println(dto.getEndDate());
		System.out.println(dto.getRegistDate());
		System.out.println(dto.getUpdateDate());

		session.put("EditProductDTO", dto);

		return SUCCESS;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public void setReleaseCompany(String releaseCompany) {
		this.releaseCompany = releaseCompany;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAccess() {
		return access;
	}

	public void setAccess(String access) {
		this.access = access;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
