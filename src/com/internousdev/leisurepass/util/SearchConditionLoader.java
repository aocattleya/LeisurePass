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

		if(!session.containsKey("mCategoryList")) {
			MCategoryDAO mCategoryDao = new MCategoryDAO();
			mCategoryDtoList = mCategoryDao.getMCategoryList();
			session.put("mCategoryDtoList", mCategoryDtoList);
		}

		if(!session.containsKey("mPlaceList")) {
			MPlaceDAO mPlaceDao = new MPlaceDAO();
			mPlaceDtoList = mPlaceDao.getMPlaceList();
			session.put("mPlaceDtoList", mPlaceDtoList);
		}
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}

	public List<MPlaceDTO> getmPlaceDtoList() {
		return mPlaceDtoList;
	}
}
