
package com.internousdev.leisurepass.action;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.leisurepass.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUserConfirmAction extends ActionSupport implements SessionAware{

	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String sex;
	private String email;
	private String loginId;
	private String password;

	private List<String> loginIdErrorMessageList = new ArrayList<String>();
	private List<String> passwordErrorMessageList = new ArrayList<String>();
	private List<String> emailErrorMessqgeList = new ArrayList<String>();
	private List<String> familyNameErrorMessage = new ArrayList<String>();
	private List<String> firstNameErrorMessage = new ArrayList<String>();
	private List<String> familyNameKanaErrorMessage = new ArrayList<String>();
	private List<String> firstNameKanaErrorMessage = new ArrayList<String>();

	private String categoryId;
	private List<String> sexList = new ArrayList<String>();
	private Map<String,Object> session;

	public String execute() {
		String result = ERROR;
		InputChecker inputCheckser = new InputChecker();

		session.put("familyName",familyName);
		session.put("familyNameKana",familyNameKana);
		session.put("firstName",firstName);
		session.put("firstNameKana",firstNameKana);
		session.put("sex",sex);
		session.put("email",email);
		session.put("loginId",loginId);

		familyNameErrorMessageList = inputChecker.doCheck(”姓”,seiName,1,16,true,true,true,false,false,true,false)


	}

}
