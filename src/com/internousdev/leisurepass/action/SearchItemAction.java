package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.dto.MPlaceDTO;
import com.internousdev.leisurepass.dto.PaginationDTO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.InputChecker;
import com.internousdev.leisurepass.util.Pagination;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class SearchItemAction extends ActionSupport implements SessionAware {
	private String categoryId;
	private String placeId;
	private String targetDate;
	private String keywords;
	private String pageNo;
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private List<MPlaceDTO> mPlaceDtoList = new ArrayList<MPlaceDTO>();
	private List<String> keywordsErrorMessageList = new ArrayList<String>();
	private List<ProductInfoDTO> productInfoDtoList = new ArrayList<ProductInfoDTO>();
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;

		InputChecker inputChecker = new InputChecker();
		if (keywords == null) {
			keywords = "";
		}
		if (categoryId == null) {
			categoryId = "1";
		}
		if (placeId == null) {
			placeId = "1";
		}
		if (targetDate != null && targetDate.equals("いつでも")){
			targetDate = "";
		}
		keywordsErrorMessageList = inputChecker.doCheck("検索ワード", keywords, 0, 16, true, true, true, true, false, false, false ,true, true);

		if (keywordsErrorMessageList.isEmpty()){
			ProductInfoDAO productInfoDAO = new ProductInfoDAO();
			productInfoDtoList = productInfoDAO.getProductInfoList(keywords.replaceAll("　", " ").split(" "), categoryId, placeId, targetDate);
			result = SUCCESS;
		}

		Iterator<ProductInfoDTO> iterator = productInfoDtoList.iterator();
		if (!(iterator.hasNext())) {
			productInfoDtoList = null;
		}
		session.put("keywordsErrorMessageList", keywordsErrorMessageList);

		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);
		mCategoryDtoList = loader.getmCategoryDtoList();
		mPlaceDtoList = loader.getmPlaceDtoList();

		session.put("targetDate", targetDate);

		if (!(productInfoDtoList == null)) {
			Pagination pagination = new Pagination();
			PaginationDTO paginationDTO = new PaginationDTO();
			if (pageNo == null) {
				paginationDTO = pagination.initialize(productInfoDtoList, 9);
			} else {
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
		} else {
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

	public List<MPlaceDTO> getmPlaceDtoList() {
		return mPlaceDtoList;
	}

	public void setmPlaceDtoList(List<MPlaceDTO> mPlaceDtoList) {
		this.mPlaceDtoList = mPlaceDtoList;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getPlaceId() {
		return placeId;
	}

	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

	public String getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
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