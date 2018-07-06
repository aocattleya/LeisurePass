package com.internousdev.leisurepass.action;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.PurchaseHistoryInfoDAO;
import com.internousdev.leisurepass.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeletePurchaseHistoryAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		// ログイン中のユーザーの購入履歴を全て削除します
		int count = purchaseHistoryInfoDAO.deleteAll(String.valueOf(session.get("loginId")));
		// もし1件以上削除していれば
		if (count > 0) {
			// 再度ログイン中のユーザーの購入履歴を取得する
			List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDtoList = purchaseHistoryInfoDAO
					.getPurchaseHistoryList(String.valueOf(session.get("loginId")));
			// 購入履歴の反復変数を作成
			Iterator<PurchaseHistoryInfoDTO> iterator = purchaseHistoryInfoDtoList.iterator();
			// もし要素が無い場合は
			if (!(iterator.hasNext())) {
				// 購入履歴のリストをnullにします
				purchaseHistoryInfoDtoList = null;
			}
			session.put("purchaseHistoryInfoDtoList", purchaseHistoryInfoDtoList);
			result = SUCCESS;
		}
		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
