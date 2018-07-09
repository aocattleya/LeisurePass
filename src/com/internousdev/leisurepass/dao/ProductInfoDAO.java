package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.DBConnector;

public class ProductInfoDAO {

	public List<ProductInfoDTO> getProductInfoList(){
		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
		List<ProductInfoDTO> list=new ArrayList<ProductInfoDTO>();
		String sql="SELECT * FROM product_info";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				ProductInfoDTO dto = toDto(resultSet);
				list.add(dto);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		if(list.size()==0){
			list=null;
		}
		return list;
	}


	public ProductInfoDTO getProductInfo(int productId){

		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();

		ProductInfoDTO dto=new ProductInfoDTO();
		String sql="SELECT * FROM product_info WHERE product_id=?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				dto = toDto(resultSet);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return dto;
	}


	public List<ProductInfoDTO> getProductInfoListByCategoryId(int categoryId, int productId, int limitOffset,
			int limitRowCount) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();

//		全てのフィールド／product_infoテーブルから／条件：カテゴリIDとプロダクトID　　　　昇順で並び替える　
		String sql = "select * from product_info where category_id=? and product_id not in(?) order by rand() limit ?,?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, categoryId);
			preparedStatement.setInt(2, productId);
			preparedStatement.setInt(3, limitOffset);
			preparedStatement.setInt(4, limitRowCount);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				ProductInfoDTO dto = toDto(resultSet);
				list.add(dto);
				}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}


	public List<ProductInfoDTO> getProductInfoListAll(String[] keywordsList) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info where";
		boolean initializeFlag = true;
		for (String keyword : keywordsList) {
			if (initializeFlag) {
				sql += " (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
				initializeFlag = false;
			} else {
				sql += " and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
			}
		}
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				ProductInfoDTO dto = toDto(resultSet);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}


//	public List<ProductInfoDTO> getProductInfoListByKeywordsAndCategoryId(String[] keywordsList, String categoryId) {
//		DBConnector dbConnector = new DBConnector();
//		Connection connection = dbConnector.getConnection();
//		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
//		String sql = "select * from product_info where";
//		boolean initializeFlag = true;
//		for (String keyword : keywordsList) {
//			if (initializeFlag) {
//				sql += " category_id=" + categoryId + " and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
//				initializeFlag = false;
//			} else {
//				sql += " and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
//			}
//		}
//		try {
//			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			while (resultSet.next()) {
//				ProductInfoDTO dto = toDto(resultSet);
//				list.add(dto);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//	public List<ProductInfoDTO> getProductInfoListByKeywordsAndPlaceId(String[] keywordsList, String placeId) {
//		DBConnector dbConnector = new DBConnector();
//		Connection connection = dbConnector.getConnection();
//		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
//		String sql = "select * from product_info where";
//		boolean initializeFlag = true;
//		for (String keyword : keywordsList) {
//			if (initializeFlag) {
//				sql += " place_id=" + placeId + " and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
//				initializeFlag = false;
//			} else {
//				sql += " and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
//			}
//		}
//		try {
//			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			while (resultSet.next()) {
//				ProductInfoDTO dto = toDto(resultSet);
//				list.add(dto);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
//	}
//
//	public List<ProductInfoDTO> getProductInfoListByKeywordsAndCategoryIdAndPlaceId(String[] keywordsList, String categoryId, String placeId) {
//		DBConnector dbConnector = new DBConnector();
//		Connection connection = dbConnector.getConnection();
//		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
//		String sql = "select * from product_info where";
//		boolean initializeFlag = true;
//		for (String keyword : keywordsList) {
//			if (initializeFlag) {
//				sql += " (category_id=" + categoryId + " and place_id=" + placeId + ") and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
//				initializeFlag = false;
//			} else {
//				sql += " and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
//			}
//		}
//		try {
//			PreparedStatement preparedStatement = connection.prepareStatement(sql);
//			ResultSet resultSet = preparedStatement.executeQuery();
//			while (resultSet.next()) {
//				ProductInfoDTO dto = toDto(resultSet);
//				list.add(dto);
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		try {
//			connection.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return list;
//	}


	public List<ProductInfoDTO> getProductInfoList(String[] keywordsList, String categoryId, String placeId, String targetDate) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info";
		boolean initializeFlag = true;

		if (categoryId != null && !categoryId.equals("1")) {
			if (initializeFlag) {
				sql += " where category_id=" + categoryId;
				initializeFlag = false;
			}else {
				sql += " and category_id=" + categoryId;
			}
		}

		if (placeId != null && !placeId.equals("1")) {
			if (initializeFlag) {
				sql += " where place_id=" + placeId;
				initializeFlag = false;
			}else {
				sql += " and place_id=" + placeId;
			}
		}

		if (targetDate != null && !targetDate.equals("")) {
			System.out.println(targetDate);
			if (initializeFlag) {
				sql += " where ('" + targetDate + "' >= start_date and '" + targetDate + "' < end_date)";
				initializeFlag = false;
			}else {
				sql += " and ('" + targetDate + "' >= start_date and '" + targetDate + "' < end_date)";
			}
		}

		for (String keyword : keywordsList) {
			if (keyword.equals("")) {
				System.out.println("continue");
				continue;
			}
			if (initializeFlag) {
				sql += " where (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
				initializeFlag = false;
			} else {
				sql += " and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
			}
		}

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			System.out.println(preparedStatement.toString());
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				ProductInfoDTO dto = toDto(resultSet);
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	private ProductInfoDTO toDto(ResultSet resultSet) throws SQLException {
		ProductInfoDTO dto=new ProductInfoDTO();
		dto.setId(resultSet.getInt("id"));
		dto.setProductId(resultSet.getInt("product_Id"));
		dto.setProductName(resultSet.getString("product_name"));
		dto.setProductNameKana(resultSet.getString("product_name_kana"));
		dto.setProductDescription(resultSet.getString("product_description"));
		dto.setCategoryId(resultSet.getInt("category_id"));
		dto.setPlaceId(resultSet.getInt("place_id"));
		dto.setPrice(resultSet.getInt("price"));
		dto.setImageFilePath(resultSet.getString("image_file_path"));
		dto.setImageFileName(resultSet.getString("image_file_name"));
		dto.setReleaseDate(resultSet.getDate("release_date"));
		dto.setReleaseCompany(resultSet.getString("release_company"));
		dto.setStatus(resultSet.getInt("status"));
		dto.setStartDate(resultSet.getDate("start_date"));
		dto.setEndDate(resultSet.getDate("end_date"));
		dto.setRegistDate(resultSet.getDate("regist_date"));
		dto.setUpdateDate(resultSet.getDate("update_date"));
		return dto;
	}

}
