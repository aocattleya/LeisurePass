package com.internousdev.leisurepass.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.CartInfoDAO;
import com.internousdev.leisurepass.dao.DestinationInfoDAO;
import com.internousdev.leisurepass.dao.UserInfoDAO;
import com.internousdev.leisurepass.dto.DestinationInfoDTO;
import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.dto.UserInfoDTO;
import com.internousdev.leisurepass.util.InputChecker;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	private boolean savedLoginId;
	private String loginId = null;
	private String password = null;
	private List<MCategoryDTO> mCategoryDtoList = new ArrayList<MCategoryDTO>();
	private List<String> loginIdErrorMessageList = new ArrayList<String>();
	private List<String> passwordErrorMessageList = new ArrayList<String>();
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		/*
		System.out.println(loginId.indexOf(" "));
		System.out.println(password.indexOf(" "));
		System.out.println(loginId);
		System.out.println(password);
		*/

		// ログイン画面以外で実行されたとき、処理を行わずホーム(管理者ログイン時はadmin.jsp)に遷移させます
		// elseの場合は136行目へ飛びます
		if (!(loginId == null && password == null)) {

			// ログインID保持にチェックが入っているか判定します true→ログイン保持する false→ログイン保持しない
			if (savedLoginId == true) {
				session.put("savedLoginId", true);
				session.put("keepLoginId", loginId);
			} else {
				session.put("savedLoginId", false);
				session.remove("keepLoginId");
			}

			session.remove("loginIdErrorMessageList");
			session.remove("passwordErrorMessageList");
			session.remove("loginFailedMessage");

			// フォームに入力できる文字を指定します
			InputChecker inputChecker = new InputChecker();
			// ユーザーID:1～8文字, 半角英数字のみ入力可能
			loginIdErrorMessageList = inputChecker.doCheck("ログインID", loginId, 1, 8, true, false, false, true, false,
					false, false, false);
			// パスワード:1～16文字, 半角英数字のみ入力可能
			passwordErrorMessageList = inputChecker.doCheck("パスワード", password, 1, 16, true, false, false, true, false,
					false, false, false);

			// 入力できない文字が入力された時のメッセージを準備します
			if (loginIdErrorMessageList.size() != 0 || passwordErrorMessageList.size() != 0) {
				session.put("loginIdErrorMessageList", loginIdErrorMessageList);
				session.put("passwordErrorMessageList", passwordErrorMessageList);
				session.put("logined", 0);
			}

			UserInfoDAO userInfoDao = new UserInfoDAO();
			// エラーメッセージがある場合は、ログイン処理を行わないようにします
			if (loginIdErrorMessageList.size() == 0 && passwordErrorMessageList.size() == 0) {
				/*System.out.println("trueが返されました");*/
				// 入力したID・PASSWORDが登録されているか確認します
				if (userInfoDao.isExistsUserInfo(loginId, password)) {
					// 当該ユーザーをログイン状態にします
					if (userInfoDao.login(loginId, password) > 0) {
						// ログインユーザー情報を取得します
						UserInfoDTO userInfoDTO = userInfoDao.getUserInfo(loginId, password);
						session.put("userInfo", userInfoDTO);
						session.put("loginId", loginId);
						session.put("status", userInfoDTO.getStatus());
						int count = 0;
						CartInfoDAO cartInfoDao = new CartInfoDAO();
						// 未ログイン状態でカートの商品を決済しようとしたとき、 仮ログインIDを入力したログインIDに差し替えます。
						count = cartInfoDao.linkToLoginId(loginId, String.valueOf(session.get("tempUserId")));
						System.out.println(count);
						if (count > 0) {
							DestinationInfoDAO destinationInfoDao = new DestinationInfoDAO();
							try {
								// ログインユーザーの宛先情報を取得します。
								List<DestinationInfoDTO> destinationInfoDtoList = new ArrayList<DestinationInfoDTO>();
								destinationInfoDtoList = destinationInfoDao.getDestinationInfo(loginId);
								Iterator<DestinationInfoDTO> iterator = destinationInfoDtoList.iterator();
								// 宛先情報がひとつもなければ、nullを格納します。
								if (!(iterator.hasNext())) {
									destinationInfoDtoList = null;
								}
								session.put("destinationInfoDtoList", destinationInfoDtoList);
							} catch (SQLException e) {
								e.printStackTrace();
							}
							// カート画面の決済ボタンから遷移してきた場合は、ログイン成功後決済確認画面へ遷移させます
							if (session.containsKey("goSettlement")) {
								result = "settlement";
							} else {
								result = SUCCESS;
							}
						} else {
							result = SUCCESS;
						}
					}
					// ヘッダーにログアウトとマイページを表示させるようにします。
					session.put("logined", 1);

					// 管理者用ユーザーIDとパスワードを入力した場合、管理者用のページに遷移します。
					UserInfoDTO d = (UserInfoDTO) session.get("userInfo");
					if (d.getStatus().equals("1")) {
						result = "admin";
					}
				} else {
					// ログインIDとパスワードのエラーメッセージは無いが、データベースに登録されてなかった場合の処理
					if (loginId.length() >= 1 && password.length() >= 1) {
						session.put("loginFailedMessage", "ログインIDまたはパスワードが異なります。");
					}
				}
			}

		} else {
			//System.out.println("別ページからのアクセス");
			result = SUCCESS;
			if (session.containsKey("userInfo")) {
				UserInfoDTO d = (UserInfoDTO) session.get("userInfo");
				if (d.getStatus().equals("1")) {
					result = "admin";
				}
			}
		}
		return result;
	}

	public boolean isSavedLoginId() {
		return savedLoginId;
	}

	public void setSavedLoginId(boolean savedLoginId) {
		this.savedLoginId = savedLoginId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<MCategoryDTO> getMCategoryDtoList() {
		return mCategoryDtoList;
	}

	public void setMCategoryDtoList(List<MCategoryDTO> mCategoryDtoList) {
		this.mCategoryDtoList = mCategoryDtoList;
	}

	public List<String> getLoginIdErrorMessageList() {
		return loginIdErrorMessageList;
	}

	public void setLoginIdErrorMessageList(List<String> loginIdErrorMessageList) {
		this.loginIdErrorMessageList = loginIdErrorMessageList;
	}

	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}

	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
