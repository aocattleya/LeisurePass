package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.leisurepass.dto.MCategoryDTO;
import com.internousdev.leisurepass.util.DBConnector;

public class MCategoryDAO {

	public List<MCategoryDTO> getMCategoryList(){

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		List<MCategoryDTO> list = new ArrayList<MCategoryDTO>();

		String sql = "SELECT * FROM m_category";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				MCategoryDTO dto = new MCategoryDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setCategoryId(resultSet.getInt("category_id"));
				dto.setCategoryName(resultSet.getString("category_name"));
				dto.setCategoryDescription(resultSet.getString("category_description"));
				dto.setInsertDate(resultSet.getDate("insert_date"));
				dto.setUpdateDate(resultSet.getDate("update_date"));
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

	public List<MCategoryDTO> getAdminMCategoryList(){

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		List<MCategoryDTO> list = new ArrayList<MCategoryDTO>();

		String sql = "SELECT * FROM m_category WHERE id NOT IN (1)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				MCategoryDTO dto = new MCategoryDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setCategoryId(resultSet.getInt("category_id"));
				dto.setCategoryName(resultSet.getString("category_name"));
				dto.setCategoryDescription(resultSet.getString("category_description"));
				dto.setInsertDate(resultSet.getDate("insert_date"));
				dto.setUpdateDate(resultSet.getDate("update_date"));
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
}
