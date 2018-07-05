//○○管理確認画面に遷移するAction
package com.internousdev.leisurepass.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class AdminCategoryConfirmAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	// カテゴリID,登録日もいる？？？
	private String name; // カテゴリ名：DBのcategory_nameに対応
	private String description; // カテゴリ詳細：DBのcategory_descriptionに対応

	public String execute() {

		// session.put("okAction", "AdminCategoryCompleteAction");
		// session.put("cancelAction", "AdminCategoryAction");
		// session.put("name", name);
		// session.put("description", description);

		AdminConfirmInfo info = new AdminConfirmInfo();
		info.okAction = "AdminCategoryCompleteAction"; // OKボタン押下：Categoryを編集するActionなので、CategoryCompleteを呼ぶ
		info.cancelAction = "AdminCategoryAction"; // キャンセルボタン押下：同上
		AdminCategory category = new AdminCategory();
		info.admin = category;

		session.put("adminActionInfo", info);

		return SUCCESS;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

public class AdminConfirmInfo {

	public String okAction;
	public String cancelAction;

	public Admin admin;
}

public class Admin {
	// 重複するものはAdminクラスにまとめて、継承する。
	//
}

public class AdminCategory extends Admin {
	public String name;
	public String description;
}

public class AdminItem extends Admin {
	public String name;
	public int price;
	public int stock;
}
// AdminPlace,AdminUserが続く？？？