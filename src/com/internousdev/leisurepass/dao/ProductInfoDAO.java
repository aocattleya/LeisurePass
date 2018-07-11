package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.leisurepass.dto.ProductInfoDTO;
import com.internousdev.leisurepass.util.DBConnector;

public class ProductInfoDAO {

	public List<ProductInfoDTO> getProductInfoList() {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
		String sql = "SELECT * FROM product_info";

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
		String sql = "SELECT * FROM product_info WHERE product_id=?";

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

	// public List<ProductInfoDTO>
	// getProductInfoListByKeywordsAndCategoryId(String[] keywordsList, String
	// categoryId) {
	// DBConnector dbConnector = new DBConnector();
	// Connection connection = dbConnector.getConnection();
	// List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
	// String sql = "select * from product_info where";
	// boolean initializeFlag = true;
	// for (String keyword : keywordsList) {
	// if (initializeFlag) {
	// sql += " category_id=" + categoryId + " and (product_name like '%" +
	// keyword + "%' or product_name_kana like '%" + keyword + "%')";
	// initializeFlag = false;
	// } else {
	// sql += " and (product_name like '%" + keyword + "%' or product_name_kana
	// like '%" + keyword + "%')";
	// }
	// }
	// try {
	// PreparedStatement preparedStatement = connection.prepareStatement(sql);
	// ResultSet resultSet = preparedStatement.executeQuery();
	// while (resultSet.next()) {
	// ProductInfoDTO dto = toDto(resultSet);
	// list.add(dto);
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// try {
	// connection.close();
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// return list;
	// }
	//
	// public List<ProductInfoDTO>
	// getProductInfoListByKeywordsAndPlaceId(String[] keywordsList, String
	// placeId) {
	// DBConnector dbConnector = new DBConnector();
	// Connection connection = dbConnector.getConnection();
	// List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
	// String sql = "select * from product_info where";
	// boolean initializeFlag = true;
	// for (String keyword : keywordsList) {
	// if (initializeFlag) {
	// sql += " place_id=" + placeId + " and (product_name like '%" + keyword +
	// "%' or product_name_kana like '%" + keyword + "%')";
	// initializeFlag = false;
	// } else {
	// sql += " and (product_name like '%" + keyword + "%' or product_name_kana
	// like '%" + keyword + "%')";
	// }
	// }
	// try {
	// PreparedStatement preparedStatement = connection.prepareStatement(sql);
	// ResultSet resultSet = preparedStatement.executeQuery();
	// while (resultSet.next()) {
	// ProductInfoDTO dto = toDto(resultSet);
	// list.add(dto);
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// try {
	// connection.close();
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// return list;
	// }
	//
	// public List<ProductInfoDTO>
	// getProductInfoListByKeywordsAndCategoryIdAndPlaceId(String[]
	// keywordsList, String categoryId, String placeId) {
	// DBConnector dbConnector = new DBConnector();
	// Connection connection = dbConnector.getConnection();
	// List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
	// String sql = "select * from product_info where";
	// boolean initializeFlag = true;
	// for (String keyword : keywordsList) {
	// if (initializeFlag) {
	// sql += " (category_id=" + categoryId + " and place_id=" + placeId + ")
	// and (product_name like '%" + keyword + "%' or product_name_kana like '%"
	// + keyword + "%')";
	// initializeFlag = false;
	// } else {
	// sql += " and (product_name like '%" + keyword + "%' or product_name_kana
	// like '%" + keyword + "%')";
	// }
	// }
	// try {
	// PreparedStatement preparedStatement = connection.prepareStatement(sql);
	// ResultSet resultSet = preparedStatement.executeQuery();
	// while (resultSet.next()) {
	// ProductInfoDTO dto = toDto(resultSet);
	// list.add(dto);
	// }
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// try {
	// connection.close();
	// } catch (SQLException e) {
	// e.printStackTrace();
	// }
	// return list;
	// }

	public List<ProductInfoDTO> getProductInfoList(String[] keywordsList, String categoryId, String placeId,
			String targetDate) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<ProductInfoDTO> list = new ArrayList<ProductInfoDTO>();
		String sql = "select * from product_info";
		boolean initializeFlag = true;

		if (categoryId != null && !categoryId.equals("1")) {
			if (initializeFlag) {
				sql += " where category_id=" + categoryId;
				initializeFlag = false;
			} else {
				sql += " and category_id=" + categoryId;
			}
		}

		if (placeId != null && !placeId.equals("1")) {
			if (initializeFlag) {
				sql += " where place_id=" + placeId;
				initializeFlag = false;
			} else {
				sql += " and place_id=" + placeId;
			}
		}

		if (targetDate != null && !targetDate.equals("")) {
			System.out.println(targetDate);
			if (initializeFlag) {
				sql += " where ('" + targetDate + "' >= start_date and '" + targetDate + "' < end_date)";
				initializeFlag = false;
			} else {
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

	// IDで検索
	public ProductInfoDTO selectById(int id) {

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		String sql = "SLECT id FROM product_info WHERE id=?";

		ProductInfoDTO result = null;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				result = new ProductInfoDTO();
				result.setId(resultSet.getInt("id"));
				result.setProductId(resultSet.getInt("product_Id"));
				result.setProductName(resultSet.getString("product_name"));
				result.setProductNameKana(resultSet.getString("product_name_kana"));
				result.setProductDescription(resultSet.getString("product_description"));
				result.setCategoryId(resultSet.getInt("category_id"));
				result.setPlaceId(resultSet.getInt("place_id"));
				result.setPrice(resultSet.getInt("price"));
				result.setImageFilePath(resultSet.getString("image_file_path"));
				result.setImageFileName(resultSet.getString("image_file_name"));
				result.setReleaseDate(resultSet.getDate("release_date"));
				result.setReleaseCompany(resultSet.getString("release_company"));
				result.setLocation(resultSet.getString("location"));
				result.setAccess(resultSet.getString("access"));
				result.setUrl(resultSet.getString("url"));
				result.setStatus(resultSet.getInt("status"));
				result.setStartDate(resultSet.getDate("start_date"));
				result.setEndDate(resultSet.getDate("end_date"));
				result.setRegistDate(resultSet.getDate("regist_date"));
				result.setUpdateDate(resultSet.getDate("update_date"));
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

		String sql = "INSERT INTO product_info(product_id,product_name,product_name_kana,product_description,category_id,place_id,price,image_file_path,image_file_name,release_date,release_company,location,access,url,status,start_date,end_date,regist_date,update_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
			preparedStatement.setString(10, "now()"); // releaseDate
			preparedStatement.setString(11, releaseCompany);
			preparedStatement.setString(12, location);
			preparedStatement.setString(13, access);
			preparedStatement.setString(14, url);
			preparedStatement.setInt(15, status);
			preparedStatement.setDate(16, startDate);
			preparedStatement.setDate(17, endDate);
			preparedStatement.setDate(18, registDate);
			preparedStatement.setString(19, "now()"); // updateDate
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
}