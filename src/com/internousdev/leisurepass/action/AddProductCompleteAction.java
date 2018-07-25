package com.internousdev.leisurepass.action;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.leisurepass.dao.ProductInfoDAO;
import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.CommonUtility;
import com.internousdev.leisurepass.util.SearchConditionLoader;
import com.opensymphony.xwork2.ActionSupport;

public class AddProductCompleteAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;

	public String execute() throws Exception{
		CommonUtility.checkLoginAdmin(session);

		ProductInfoDTO dto = (ProductInfoDTO) session.get("addProductDTO");

		File productImage = (File) session.get("productImage");
		String productImageContentType = (String) session.get("productImageContentType");
		String productImageFileName = (String) session.get("productImageFileName");

		System.out.println(productImage);
		System.out.println(productImageContentType);
		System.out.println(productImageFileName);

		dto.setImageFilePath("./images");
		dto.setImageFileName(productImageFileName);

		if (productImageFileName != null) {
			String filePath = ServletActionContext.getServletContext().getRealPath("/").concat("images");
			System.out.println("Image Location" + filePath);
			File fileToCreate = new File(filePath, productImageFileName);

			try {
				FileUtils.copyFile(productImage, fileToCreate);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		ProductInfoDAO dao = new ProductInfoDAO();
		dao.insert(dto.getProductId(), dto.getProductName(), dto.getProductNameKana(), dto.getProductDescription(),
				dto.getCategoryId(), dto.getPlaceId(), dto.getPrice(), dto.getImageFilePath(), dto.getImageFileName(),
				dto.getReleaseDate(), dto.getReleaseCompany(), dto.getLocation(), dto.getAccess(), dto.getUrl(),
				dto.getStatus(), dto.getStartDate(), dto.getEndDate(), dto.getRegistDate(), dto.getUpdateDate());

		session.remove("addProductDTO");

		String result = SUCCESS;

		// navigation情報を取得
		SearchConditionLoader loader = new SearchConditionLoader();
		loader.execute(session);

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}