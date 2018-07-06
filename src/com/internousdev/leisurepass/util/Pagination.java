package com.internousdev.leisurepass.util;

import java.util.ArrayList;
import java.util.List;

import com.internousdev.leisurepass.dto.PaginationDTO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;

public class Pagination {

	public PaginationDTO initialize(List<ProductInfoDTO> list, int pageSize) {

		PaginationDTO pageDTO = new PaginationDTO();
		pageDTO.setTotalPageSize((int) (Math.ceil(list.size() / pageSize)));	// 全ページ数
		pageDTO.setCurrentPageNo(1);											// 現在のページ番号
		pageDTO.setTotalRecordSize(list.size() - 1);							// 全レコード数
		pageDTO.setStartRecordNo(pageSize * (pageDTO.getCurrentPageNo() - 1));	// 現在のページ番号に対する開始レコード番号(オフセット)
		pageDTO.setEndRecordNo(pageDTO.getStartRecordNo() + (pageSize - 1));	// 現在のページ番号に対する終了レコード番号

		List<Integer> pageNumberList = new ArrayList<Integer>();
		for (int pageNumber = 1; pageNumber <= pageDTO.getTotalPageSize(); pageNumber++) {
			pageNumberList.add(pageNumber);
		}

		List<ProductInfoDTO> productPages = new ArrayList<ProductInfoDTO>();
		for (int pageNumberOffset = pageDTO.getStartRecordNo(); pageNumberOffset <= pageDTO
				.getEndRecordNo(); pageNumberOffset++) {
			productPages.add(list.get(pageNumberOffset));
		}
		pageDTO.setCurrentProductPage(productPages);

		if ((pageDTO.getStartRecordNo() - 1) <= 0) {
			pageDTO.setPreviousPage(false);
		} else {
			pageDTO.setPreviousPage(true);
			pageDTO.setPreviousPageNo(pageDTO.getCurrentPageNo() - 1);
		}

		if (pageDTO.getEndRecordNo() + pageSize > pageDTO.getTotalRecordSize()) {
			pageDTO.setNextPage(false);
		} else {
			pageDTO.setNextPage(true);
			pageDTO.setNextPageNo(pageDTO.getCurrentPageNo() + 1);
		}
		return pageDTO;
	}

	public PaginationDTO getPage(List<ProductInfoDTO> list, int pageSize, String pageNo) {

		PaginationDTO paginationDTO = new PaginationDTO();										// 全ページ数
		paginationDTO.setTotalPageSize((int) (Math.ceil(list.size() / pageSize)));				// 現在のページ番号
		paginationDTO.setCurrentPageNo(Integer.parseInt(pageNo));								// 全レコード数
		paginationDTO.setTotalRecordSize(list.size() - 1);										// 現在のページ番号に対する開始レコード番号（オフセット）
		paginationDTO.setStartRecordNo(pageSize * (paginationDTO.getCurrentPageNo() - 1));		// 現在のページ番号に対する開始レコード番号
		// paginationDTO.setStartRecordNo((pageSize * paginationDTO.getCurrentPageNo()) + 1);	// 現在のページ番号に対する終了レコード番号
		paginationDTO.setEndRecordNo(paginationDTO.getStartRecordNo() + (pageSize - 1));

		List<Integer> pageNumberList = new ArrayList<Integer>();
		for (int pageNumber = 1; pageNumber <= paginationDTO.getTotalPageSize(); pageNumber++) {
			pageNumberList.add(pageNumber);
		}

		List<ProductInfoDTO> productInfoPages = new ArrayList<ProductInfoDTO>();
		for (int pageNumberOffset = paginationDTO.getStartRecordNo(); pageNumberOffset <= paginationDTO
				.getEndRecordNo(); pageNumberOffset++) {
			productInfoPages.add(list.get(pageNumberOffset));
		}
		paginationDTO.setCurrentProductPage(productInfoPages);

		if ((paginationDTO.getStartRecordNo() - 1) <= 0) {
			paginationDTO.setPreviousPage(false);
		} else {
			paginationDTO.setPreviousPage(true);
			paginationDTO.setPreviousPageNo(paginationDTO.getCurrentPageNo() - 1);
		}

		if (paginationDTO.getEndRecordNo() + pageSize > paginationDTO.getTotalRecordSize()) {
			paginationDTO.setNextPage(false);
		} else {
			paginationDTO.setNextPage(true);
			paginationDTO.setNextPageNo(paginationDTO.getCurrentPageNo() + 1);
		}

		return paginationDTO;

	}
}