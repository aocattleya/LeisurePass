
package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.CartInfoDAO;
import com.internousdev.leisurepass.dao.UserInfoDAO;
import com.internousdev.leisurepass.dto.UserInfoDTO;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserCompleteAction extends ActionSupport implements SessionAware {

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String email;
	private String loginId;
	private String password;
	private String categoryId;
	private Map<String, Object> session;

	public String execute() {
		String result = ERROR;
		UserInfoDAO userInfoDao = new UserInfoDAO();

		userInfoDao.createUser(familyName, firstName, familyNameKana, firstNameKana, sex, email, loginId, password);

		UserInfoDTO dto = userInfoDao.getUserInfo(loginId, password);
		if (dto != null) {
			session.put("userInfo", dto);
			session.put("logined", 1);
			result = SUCCESS;
		}

		// （仮）ユーザーでカートに入れた情報をログインした時にそのまま入れたカート情報を引き継ぐ処理
		int countNum = 0;
		CartInfoDAO cartInfoDAO = new CartInfoDAO();

		countNum = cartInfoDAO.linkToLoginId(loginId, String.valueOf(session.get("tempUserId")));

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return result;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
