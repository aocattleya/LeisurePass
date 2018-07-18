package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.CartInfoDAO;
import com.internousdev.leisurepass.dao.PurchaseHistoryInfoDAO;
import com.internousdev.leisurepass.dto.CartInfoDTO;
import com.internousdev.leisurepass.dto.PurchaseHistoryInfoDTO;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private String noDestinationMassage;
	private int id;

	public String execute() {

		// デフォルト ERROR
		String result = ERROR;

		// 宛先が無い場合の機能
		if (session.get("destinationInfoDtoList") == null) {
			setNoDestinationMassage(" 新規登録をしてください");
			return result;
		}

		// 警告を抑制
		@SuppressWarnings("unchecked")
		// 購入履歴の取得
		ArrayList<PurchaseHistoryInfoDTO> purchaseHistoryInfoDtoList = (ArrayList<PurchaseHistoryInfoDTO>) session.get("purchaseHistoryInfoDtoList");

		for (int i = 0; i < purchaseHistoryInfoDtoList.size(); i++) {

			// 行(i)の宛先のIDを変える  修正箇所：idに変更
			purchaseHistoryInfoDtoList.get(i).setDestinationId(id);
		}

		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		int count = 0;

		for (int i = 0; i < purchaseHistoryInfoDtoList.size(); i++) {

			// カウントはsqlが失敗したら0になる
			count += purchaseHistoryInfoDAO.regist(String.valueOf(session.get("loginId")),
					purchaseHistoryInfoDtoList.get(i).getProductId(),
					purchaseHistoryInfoDtoList.get(i).getProductCount(),
					purchaseHistoryInfoDtoList.get(i).getDestinationId(),
					purchaseHistoryInfoDtoList.get(i).getSubtotal());
		}

		// 成功した場合1
		if (count > 0) {
			CartInfoDAO cartInfoDAO = new CartInfoDAO();

			// カートの中身を削除
			count = cartInfoDAO.deleteAll(String.valueOf(session.get("loginId")));

			// 削除できたら0以上になり
			if (count > 0) {

				// 削除した後のカートの中身を取得
				List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
				cartInfoDtoList = cartInfoDAO.getCartInfoDtoList(String.valueOf(session.get("loginId")));

				// iterator リストの配列を一つづつ出力する変数を作成
				Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();

				// もうなければnullにする
				if (!(iterator.hasNext())) {
					cartInfoDtoList = null;
				}

				// nullにしたものをセッションに入れる
				session.put("cartInfoDtoList", cartInfoDtoList);

				// オブジェクト型をintに変換
				int totalPrice = Integer
						.parseInt(String.valueOf(cartInfoDAO.getTotalPrice(String.valueOf(session.get("loginId")))));

				// セッションput
				session.put("totalPrice", totalPrice);
				result = SUCCESS;
			}
		}

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return result;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getNoDestinationMassage() {
		return noDestinationMassage;
	}

	public void setNoDestinationMassage(String noDestinationMassage) {
		this.noDestinationMassage = noDestinationMassage;
	}
}