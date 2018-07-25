package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.PurchaseHistoryInfoDAO;
import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.dto.PurchaseHistoryInfoDTO;
import com.internousdev.leisurepass.dto.UserInfoDTO;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;

		if ((int) session.get("logined") == 0) {
			return result;
		}

		UserInfoDTO d = (UserInfoDTO) session.get("userInfo");
		if ((d.getStatus().equals("1"))) {
			result = "admin";
			return result;
		}

		PurchaseHistoryInfoDAO purchaseHistoryInfoDao = new PurchaseHistoryInfoDAO();
		List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDtoList = new ArrayList<PurchaseHistoryInfoDTO>();
		// 購入履歴のリストを取得(nullだった場合例外を返します)
		purchaseHistoryInfoDtoList = purchaseHistoryInfoDao
				.getPurchaseHistoryList(String.valueOf(session.get("loginId")));
		// 反復処理を実行
		Iterator<PurchaseHistoryInfoDTO> iterator = purchaseHistoryInfoDtoList.iterator();
		// 反復処理で要素がない場合
		if (!(iterator.hasNext())) {
			// 購入履歴のリストの要素をnullにします
			purchaseHistoryInfoDtoList = null;
		}
		session.put("purchaseHistoryInfoDtoList", purchaseHistoryInfoDtoList);

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return SUCCESS;
	}

	public List<MCategoryDTO> getmCategoryDtoList() {
		return mCategoryDtoList;
	}

	public void setmCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
