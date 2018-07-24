package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.leisurepass.dto.MPlaceDTO;
import com.internousdev.leisurepass.util.DBConnector;

public class MPlaceDAO {

	public List<MPlaceDTO> getMPlaceList(){

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		List<MPlaceDTO> list = new ArrayList<MPlaceDTO>();

		String sql = "SELECT * FROM m_place";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				MPlaceDTO dto = new MPlaceDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setPlaceId(resultSet.getInt("place_id"));
				dto.setPlaceName(resultSet.getString("place_name"));
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

	public List<MPlaceDTO> getAdminMPlaceList(){

		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		List<MPlaceDTO> list = new ArrayList<MPlaceDTO>();

		String sql = "SELECT * FROM m_place WHERE id NOT IN (1)";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				MPlaceDTO dto = new MPlaceDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setPlaceId(resultSet.getInt("place_id"));
				dto.setPlaceName(resultSet.getString("place_name"));
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
