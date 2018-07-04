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
				ProductInfoDTO dto=new ProductInfoDTO();
				dto.setId(resultSet.getInt("id"));
				dto.setProductId(resultSet.getInt("product_Id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setProductDescription(resultSet.getString("product_description"));
				dto.setCategoryId(resultSet.getInt("category_id"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setImageFileName(resultSet.getString("image_file_name"));
				dto.setReleaseDate(resultSet.getDate("release_date"));
				dto.setReleaseCompany(resultSet.getString("release_company"));
				dto.setStatus(resultSet.getInt("status"));
				dto.setRegistDate(resultSet.getDate("regist_date"));
				dto.setUpdateDate(resultSet.getDate("update_date"));
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


	public List<ProductInfoDTO> getProductInfoList(String productId){

		DBConnector dbConnector=new DBConnector();
		Connection connection=dbConnector.getConnection();
//		Listのインスタンス化は？
		String sql="SELECT * FROM product_info WHERE product_id=?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, productId);
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				ProductInfoDTO dto=new ProductInfoDTO();
				dto.setId(resultSet.getInt("id"));

			}


		}catch(SQLException e){

		}


	}

}
