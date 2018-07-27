package com.internousdev.leisurepass.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dto.UserInfoDTO;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class CreateDestinationAction extends ActionSupport implements SessionAware {
	private String categoryId;
	private static final String MALE = "男性";
	private static final String FEMALE = "女性";
	private String defaultSexValue = MALE;
	private String sex = MALE;
	private List<String> sexList = new ArrayList<String>();
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

		sexList.add(MALE);
		sexList.add(FEMALE);

		session.remove("familyNameErrorMessageList");
		session.remove("firstNameErrorMessageList");
		session.remove("familyNameKanaErrorMessageList");
		session.remove("firstNameKanaErrorMessageList");
		session.remove("emailErrorMessageList");
		session.remove("telNumberErrorMessageList");
		session.remove("userAddressErrorMessageList");
		result = SUCCESS;

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return result;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getDefaultSexValue() {
		return defaultSexValue;
	}

	public void setDefaultSexValue(String defaultSexValue) {
		this.defaultSexValue = defaultSexValue;
	}

	public List<String> getSexList() {
		return sexList;
	}

	public void setSexList(List<String> sexList) {
		this.sexList = sexList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}