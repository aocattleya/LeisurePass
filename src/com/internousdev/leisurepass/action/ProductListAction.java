package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.dto.PaginationDTO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.Pagination;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class ProductListAction extends ActionSupport implements SessionAware{
	private String productName;
	private String productNameKana;
	private String imageFilePath;
	private String imageFileName;
	private int price;

	private String categoryId;
	private String keywords;
	private List<MCategoryDTO> mCategoryList = new ArrayList<MCategoryDTO>();
	private List<ProductInfoDTO> productList = new ArrayList<ProductInfoDTO>();

	private Map<String, Object> session;
	public String execute() {
		String result = ERROR;

		ProductInfoDAO productDAO = new ProductInfoDAO();
		productList = productDAO.getProductInfoList();
		Pagination pagination = new Pagination();
		PaginationDTO pageDTO = pagination.initialize(productList, 9);
		session.put("totalPageSize", pageDTO.getTotalPageSize());
		session.put("currentPageNo", pageDTO.getCurrentPageNo());
		session.put("totalRecordSize", pageDTO.getTotalPageSize());
		session.put("startRecordNo", pageDTO.getStartRecordNo());
		session.put("endRecordNo", pageDTO.getEndRecordNo());
		session.put("pageNumberList", pageDTO.getPageNumberList());
		session.put("productInfoDtoList", pageDTO.getCurrentProductInfoPage());
		session.put("hasNextPage", pageDTO.hasNextPage());
		session.put("hasPreviousPage", pageDTO.hasPreviousPage());
		session.put("nextPageNo", pageDTO.getNextPageNo());
		session.put("previousPageNo", pageDTO.getPreviousPageNo());

		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		result = SUCCESS;
		return result;
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryList;
	}

	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryList = mCategoryDtoList;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductNameKana() {
		return productNameKana;
	}
	public void setProductNameKana(String productNameKana) {
		this.productNameKana = productNameKana;
	}
	public String getImageFilePath() {
		return imageFilePath;
	}
	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
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
