package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.MCategoryDAO;
import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.dto.PaginationDTO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.InputChecker;
import com.internousdev.leisurepass.util.Pagination;
import com.opensymphony.xwork2.ActionSupport;


public class SearchItemAction extends ActionSupport implements SessionAware{
	private String categoryId;
	private String keywords;
	private String pageNo;
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private List<String> keywordsErrorMessageList = new ArrayList<String>();
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
	private Map<String, Object> session;
	public String execute() {
		String result = ERROR;

		InputChecker inputChecker = new InputChecker();
		if(keywords==null) {
			keywords="";
		}
		keywordsErrorMessageList = inputChecker.doCheck("検索ワード", keywords, 0, 16, true, true, true, true, false,true,true);

		ProductInfoDAO productInfoDAO = new ProductInfoDAO();
		switch (categoryId) {
			case "1":
				productInfoDtoList = productInfoDAO.getProductInfoListAll(keywords.replaceAll("　", " ").split(" "));
				result = SUCCESS;
				break;

			default:
				productInfoDtoList = productInfoDAO.getProductInfoListByKeywords(keywords.replaceAll("　", " ").split(" "), categoryId);
				result = SUCCESS;
				break;
		}
		Iterator<ProductInfoDTO> iterator = productInfoDtoList.iterator();
		if(!(iterator.hasNext())) {
			productInfoDtoList = null;
		}
		session.put("keywordsErrorMessageList", keywordsErrorMessageList);

	if(!session.containsKey("mCategoryList")) {
		MCategoryDAO mCategoryDao = new MCategoryDAO();
		mCategoryDtoList = mCategoryDao.getMCategoryList();
		session.put("mCategoryDtoList", mCategoryDtoList);
	}

	if(!(productInfoDtoList==null)) {
		Pagination pagination = new Pagination();
		PaginationDTO paginationDTO = new PaginationDTO();
		if(pageNo==null) {
			paginationDTO = pagination.initialize(productInfoDtoList, 9);
		}else {
			paginationDTO = pagination.getPage(productInfoDtoList, 9, pageNo);
		}

		session.put("productInfoDtoList", paginationDTO.getCurrentProductInfoPage());
		session.put("totalPageSize", paginationDTO.getTotalPageSize());
		session.put("currentPageNo", paginationDTO.getCurrentPageNo());
		session.put("totalRecordSize", paginationDTO.getTotalRecordSize());
		session.put("startRecordNo", paginationDTO.getStartRecordNo());
		session.put("endRecordNo", paginationDTO.getEndRecordNo());
		session.put("previousPage", paginationDTO.hasPreviousPage());
		session.put("previousPageNo", paginationDTO.getPreviousPageNo());
		session.put("nextPage", paginationDTO.hasNextPage());
		session.put("nextPageNo", paginationDTO.getNextPageNo());
		}else {
			session.put("productInfoDtoList", null);
		}
		return result;
	}

	public String getPageNo() {
		return pageNo;
	}


	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}


	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}

	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
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
	public List<String> getKeywordsErrorMessageList() {
		return keywordsErrorMessageList;
	}
	public void setKeywordsErrorMessageList(List<String> keywordsErrorMessageList) {
		this.keywordsErrorMessageList = keywordsErrorMessageList;
	}
	public List<ProductInfoDTO> getProductInfoDtoList() {
		return productInfoDtoList;
	}
	public void setProductInfoDtoList(List<ProductInfoDTO> productInfoDtoList) {
		this.productInfoDtoList = productInfoDtoList;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
