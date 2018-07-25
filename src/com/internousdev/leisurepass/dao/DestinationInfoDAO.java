package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.leisurepass.dto.DestinationInfoDTO;
import com.internousdev.leisurepass.util.DBConnector;

public class DestinationInfoDAO {

	public int insert(String userId, String familyName, String firstName, String familyNameKana, String firstNameKana,
		String email, String telNumber, String userAddress) {
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		int count = 0;
		String sql = "insert into destination_info(user_id, family_name, first_name, family_name_kana, first_name_kana, email, tel_number, user_address, regist_date, update_date)"
				+ " values (?, ?, ?, ?, ?, ?, ?, ?, now(), '0000-01-01')";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, familyName);
			preparedStatement.setString(3, firstName);
			preparedStatement.setString(4, familyNameKana);
			preparedStatement.setString(5, firstNameKana);
			preparedStatement.setString(6, email);
			preparedStatement.setString(7, telNumber);
			preparedStatement.setString(8, userAddress);
			count = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	public List<DestinationInfoDTO> getDestinationInfo(String loginId) throws SQLException{
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		List<DestinationInfoDTO> destinationInfoDtoList = new ArrayList<DestinationInfoDTO>();

		String sql = "SELECT id, family_name, first_name, family_name_kana, first_name_kana, user_address, tel_number, email FROM destination_info WHERE user_id = binary ?";

		try {
			connection = dbConnector.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1, loginId);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				DestinationInfoDTO destinationInfoDTO = new DestinationInfoDTO();
				destinationInfoDTO.setId(rs.getInt("id"));
				destinationInfoDTO.setFamilyName(rs.getString("family_name"));
				destinationInfoDTO.setFirstName(rs.getString("first_name"));
				destinationInfoDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				destinationInfoDTO.setFirstNameKana(rs.getString("first_name_kana"));
				destinationInfoDTO.setUserAddress(rs.getString("user_address"));
				destinationInfoDTO.setEmail(rs.getString("email"));
				destinationInfoDTO.setTelNumber(rs.getString("tel_number"));
				destinationInfoDtoList.add(destinationInfoDTO);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return destinationInfoDtoList;
	}
}
