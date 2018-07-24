package com.internousdev.leisurepass.util;

import java.util.List;
import java.util.Map;

import com.internousdev.leisurepass.dao.MCategoryDAO;
import com.internousdev.leisurepass.dao.MPlaceDAO;
import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.dto.MPlaceDTO;

public class SearchConditionLoader {

	private List<MCategoryDTO> mCategoryDtoList;
	private List<MPlaceDTO> mPlaceDtoList;

	public void execute(Map<String, Object> session) {

		if(!session.containsKey("mCategoryDtoList")) {
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryDtoList = mCategoryDao.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}

		if(!session.containsKey("mPlaceDtoList")) {
			MPlaceDAO mPlaceDao = new MPlaceDAO();
			mPlaceDtoList = mPlaceDao.getMPlaceList();
			session.put("mPlaceDtoList", mPlaceDtoList);
		}

		if(!session.containsKey("targetDate")) {
			session.put("targetDate", "");
		}
	}

	public void executeAdmin(Map<String, Object> session) {
		if(!session.containsKey("mAdminCategoryDtoList")) {
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryDtoList = mCategoryDao.getAdminMCategoryList();
			session.put("mAdminCategoryDtoList", mCategoryDtoList);
		}

		if(!session.containsKey("mAdminPlaceDtoList")) {
			MPlaceDAO mPlaceDao = new MPlaceDAO();
			mPlaceDtoList = mPlaceDao.getAdminMPlaceList();
			session.put("mAdminPlaceDtoList", mPlaceDtoList);
		}
	}


	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}

	public List<MPlaceDTO> getmPlaceDtoList() {
		return mPlaceDtoList;
	}
}
