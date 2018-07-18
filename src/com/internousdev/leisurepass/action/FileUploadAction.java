package com.internousdev.leisurepass.action;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport implements SessionAware {
	private File image;
	private String imageContentType;
	private String imageFileName;
	public Map<String, Object> session;

	public String execute() throws SQLException {
		// デフォルトの画像を挿入
		if (!(session.containsKey("image_flg"))) {
			session.put("image_file_name", "画像を選択してください");
			session.put("image_file_path", "./images/coming_soon.jpg");
		}

		// 画像ファイルアップロード
		if (!(imageFileName == null)) {
			String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("images");
			System.out.println("Image Location:" + filePath);
			File fileToCreate = new File(filePath, imageFileName);

			try {
				FileUtils.copyFile(image, fileToCreate);
				session.put("image_file_name", imageFileName);
				session.put("image_file_path", "images/" + imageFileName);
				session.put("image_flg", imageFileName);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		String result = SUCCESS;

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return result;
	}

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getImageContentType() {
		return imageContentType;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
