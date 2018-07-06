package com.internousdev.leisurepass.dto;

import java.util.ArrayList;
import java.util.List;

public class PaginationDTO {

	private int totalPageSize;										// 全ページ数
	private int currentPageNo;										// 現在のページ数
	private int totalRecordSize;									// 全レコード数
	private int startRecordNo;										// 開始レコード番号
	private int endRecordNo;										// 終了レコード番号
	private List<Integer> pageNuberList = new ArrayList<Integer>();	// ページャーに表示するページ番号一覧
	private List<ProductInfoDTO> currentProductPage;				// 1ページ文のリストページ情報(商品情報)
	private boolean hasNextPage;									// 次ページが存在するか
	private boolean hasPreviousPage;								// 前ページが存在するか
	private int nextPageNo;											// 次ページ番号
	private int previousPageNo;										// 前ページ番号

// get/setの設定
	public int getTotalPageSize() {
		return totalPageSize;
	}

	public void setTotalPageSize(int totalPageSize) {
		this.totalPageSize = totalPageSize;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}

	public int getTotalRecordSize() {
		return totalRecordSize;
	}

	public void setTotalRecordSize(int totalRecordSize) {
		this.totalRecordSize = totalRecordSize;
	}

	public int getStartRecordNo() {
		return startRecordNo;
	}

	public void setStartRecordNo(int startrecordNo) {
		this.startRecordNo = startrecordNo;
	}

	public int getEndRecordNo() {
		return endRecordNo;
	}

	public void setEndRecordNo(int endRecordNo) {
		this.endRecordNo = endRecordNo;
	}

	public List<Integer> getPageNumberList() {
		return pageNuberList;
	}

	public void setPageNuberList(List<Integer> pageNuberList) {
		this.pageNuberList = pageNuberList;
	}

	public List<ProductInfoDTO> getCurrentProductPage() {
		return currentProductPage;
	}

	public void setCurrentProductPage(List<ProductInfoDTO> currentProductPage) {
		this.currentProductPage = currentProductPage;
	}

	public boolean hasNextPage() {
		return hasNextPage;
	}

	public void setNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public boolean hasPreviousPage() {
		return hasPreviousPage;
	}

	public void setPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}

	public int getNextPageNo() {
		return nextPageNo;
	}

	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}

	public int getPreviousPageNo() {
		return previousPageNo;
	}

	public void setPreviousPageNo(int previousPageNo) {
		this.previousPageNo = previousPageNo;
	}

}
