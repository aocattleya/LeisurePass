package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.DBConnector;

public class ProductInfoDAO {

	public List<ProductInfoDTO> getProductInfoList() {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
		String sql = "SELECT * FROM product_info WHERE status=0";

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

		if (list.size() == 0) {
			list = null;
		}
		return list;
	}

	public ProductInfoDTO getProductInfo(int productId) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		ProductInfoDTO dto = new ProductInfoDTO();
		String sql = "SELECT * FROM product_info WHERE product_id=? AND status=0";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				dto = toDto(resultSet);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

	public List<ProductInfoDTO> getProductInfoListByCategoryId(int categoryId, int productId, int limitOffset,
			int limitRowCount) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();

		// 全てのフィールド／product_infoテーブルから／条件：カテゴリIDとプロダクトID 昇順で並び替える
		String sql = "select * from product_info where status=0 and category_id=? and product_id not in(?) order by rand() limit ?,?";
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

	public List<ProductInfoDTO> getProductInfoListAll(String[] keywordsList) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info where status=0";
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

	public List<ProductInfoDTO> getProductInfoList(String[] keywordsList, String categoryId, String placeId,
			String targetDate) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info WHERE status=0";

		if (categoryId != null && !categoryId.equals("1")) {
			sql += " and category_id=" + categoryId;
		}

		if (placeId != null && !placeId.equals("1")) {
			sql += " and place_id=" + placeId;
		}

		if (targetDate != null && !targetDate.equals("")) {
			sql += " and ('" + targetDate + "' >= start_date and '" + targetDate + "' < end_date)";
		}

		for (int i = 0; i < keywordsList.length; i++){
			String keyword = keywordsList[i];
			if (keyword.equals("")) {
				continue;
			}

			if (i == 0){
				if (keywordsList.length == 1){
					sql += " and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
				}else{
					sql += " and ((product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
				}
			} else if(i == keywordsList.length - 1){
				sql += " or (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%'))";
			}else {
				sql += " or (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
			}
		}
//		for (String keyword : keywordsList) {
//			if (keyword.equals("")) {
//				System.out.println("continue");
//				continue;
//			}
//			if (initializeFlag) {
//				sql += " where (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
//				initializeFlag = false;
//			} else {
//				sql += " and (product_name like '%" + keyword + "%' or product_name_kana like '%" + keyword + "%')";
//			}
//		}

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
		ProductInfoDTO dto = new ProductInfoDTO();
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
		dto.setLocation(resultSet.getString("location"));
		dto.setAccess(resultSet.getString("access"));
		dto.setUrl(resultSet.getString("url"));
		dto.setStatus(resultSet.getInt("status"));
		dto.setStartDate(resultSet.getDate("start_date"));
		dto.setEndDate(resultSet.getDate("end_date"));
		dto.setRegistDate(resultSet.getDate("regist_date"));
		dto.setUpdateDate(resultSet.getDate("update_date"));
		return dto;
	}

	// ここから下、久保田の追記
	// 商品IDで検索
	public ProductInfoDTO selectById(int id) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SELECT * FROM product_info WHERE id = ? AND status=0";

		ProductInfoDTO result = null;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				result = toDto(resultSet);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	// 商品追加 商品idが被ったら、try-catchでcathcに入る
	public boolean insert(int productId, String productName, String productNameKana, String productDescription,
			int categoryId, int placeId, int price, String imageFilePath, String imageFileName, Date releaseDate,
			String releaseCompany, String location, String access, String url, int status, Date startDate, Date endDate,
			Date registDate, Date updateDate) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		String sql = "INSERT INTO product_info(product_id,product_name,product_name_kana,product_description,category_id,place_id,price,image_file_path,image_file_name,release_date,release_company,location,access,url,status,start_date,end_date,regist_date,update_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,now(),now())";

		int result = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, productId);
			preparedStatement.setString(2, productName);
			preparedStatement.setString(3, productNameKana);
			preparedStatement.setString(4, productDescription);
			preparedStatement.setInt(5, categoryId);
			preparedStatement.setInt(6, placeId);
			preparedStatement.setInt(7, price);
			preparedStatement.setString(8, imageFilePath);
			preparedStatement.setString(9, imageFileName);
			preparedStatement.setString(10, simpleDateFormat.format(releaseDate));
			preparedStatement.setString(11, releaseCompany);
			preparedStatement.setString(12, location);
			preparedStatement.setString(13, access);
			preparedStatement.setString(14, url);
			preparedStatement.setInt(15, status);
			preparedStatement.setString(16, simpleDateFormat.format(startDate));
			preparedStatement.setString(17, simpleDateFormat.format(endDate));
			// preparedStatement.setString(18, "cast(now() as date)"); //
			// registDate
			// preparedStatement.setString(19, "cast(now() as date)"); //
			// updateDate
			// System.out.println(preparedStatement.toString());
			System.out.println(simpleDateFormat.format(startDate));
			System.out.println(preparedStatement.toString());

			result = preparedStatement.executeUpdate();
			System.out.println(result + "件更新");
			System.out.println(preparedStatement.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result > 0;
	}

	// 商品編集

	// 商品削除
	public boolean delete(int id) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "DELETE FROM product_info WHERE id = ?";

		int result = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result > 0;
	}

	public List<ProductInfoDTO> selectRecommends(int limit){

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();

		// ランダム
		String sql = "SELECT * FROM product_info WHERE status=0 ORDER BY rand() LIMIT ?";
		//String sql = "select * from product_info where status=0 and category_id=? and product_id not in(?) order by rand() limit ?,?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, limit);
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
}