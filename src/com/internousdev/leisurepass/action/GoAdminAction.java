package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class GoAdminAction extends ActionSupport implements SessionAware {
	private Map<String, Object> session;

	public String execute() {

		/* sessionにstatusが入っているか確認。 */
		if (session.containsKey("status")) {

			/* ステータスが管理者でなければERROR */
			if (!((String) session.get("status")).equals("1")) {
				return ERROR;
			}
			/* statusがなくてもERROR */
		} else {
			return ERROR;
		}

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public Map<String, Object> getSession() {
		return session;
	}

}