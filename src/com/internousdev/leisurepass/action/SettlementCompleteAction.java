package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.CartInfoDAO;
import com.internousdev.leisurepass.dao.PurchaseHistoryInfoDAO;
import com.internousdev.leisurepass.dto.CartInfoDTO;
import com.internousdev.leisurepass.dto.DestinationInfoDTO;
import com.internousdev.leisurepass.dto.PurchaseHistoryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SettlementCompleteAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;                                                                              //デフォルト ERROR

		@SuppressWarnings("unchecked")   //警告を抑制
		ArrayList<PurchaseHistoryInfoDTO> purchaseHistoryInfoDtoList = (ArrayList<PurchaseHistoryInfoDTO>)session.get("purchaseHistoryInfoDtoList");   // 購入履歴の取得

		@SuppressWarnings("unchecked")   //警告を抑制
		ArrayList<DestinationInfoDTO> destinationInfoDtoList = (ArrayList<DestinationInfoDTO>)session.get("destinationInfoDtoList");                   // 宛先の取得

		for(int i=0;i<purchaseHistoryInfoDtoList.size();i++) {
			purchaseHistoryInfoDtoList.get(i).setDestinationId(destinationInfoDtoList.get(0).getId());      // 行(i)の宛先のIDを変える（宛先のリストの0番のIDに変える）
		}

		PurchaseHistoryInfoDAO purchaseHistoryInfoDAO = new PurchaseHistoryInfoDAO();
		int count = 0;

		for(int i=0; i<purchaseHistoryInfoDtoList.size();i++) {
			count += purchaseHistoryInfoDAO.regist(                                                         // カウントはsqlが失敗したら0になる
					String.valueOf(session.get("loginId")),
					purchaseHistoryInfoDtoList.get(i).getProductId(),
					purchaseHistoryInfoDtoList.get(i).getProductCount(),
					purchaseHistoryInfoDtoList.get(i).getDestinationId(),
					purchaseHistoryInfoDtoList.get(i).getSubtotal()
					);
		}
		if(count > 0) {                                                                                     // 成功した場合1
			CartInfoDAO cartInfoDAO = new CartInfoDAO();
			count = cartInfoDAO.deleteAll(String.valueOf(session.get("loginId")));                          // カートの中身を削除
			if(count > 0) {                                                                                 // 削除できたら0以上になり
				List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();                           // 削除した後のカートの中身を取得
				cartInfoDtoList = cartInfoDAO.getCartInfoDtoList(String.valueOf(session.get("loginId")));
				Iterator<CartInfoDTO> iterator = cartInfoDtoList.iterator();                                // iterator  リストの配列を一つづつ出力する変数を作成
				if(!(iterator.hasNext())) {                                                                 // もうなければ
					cartInfoDtoList = null;                                                                 //  nullにする
				}
				session.put("cartInfoDtoList", cartInfoDtoList);                                            //nullにしたものをセッションに入れる

				// オブジェクト型をintに変換
				int totalPrice = Integer.parseInt(String.valueOf(cartInfoDAO.getTotalPrice(String.valueOf(session.get("loginId")))));
				session.put("totalPrice", totalPrice);  //セッションに入れる
				result = SUCCESS;
			}
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