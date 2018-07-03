package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.leisurepass.dto.CartinfoDTO;


public class CartinfoDAO {
//	カートに表示する表の中身list,
//	AddCartActionに続く
public List<CartinfoDTO> CartInfoList(String loginId){
	List<CartinfoDTO> CartList = new ArrayList<CartinfoDTO>();
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	String sql="Select ci.id,"
			+ " ci.user_id,"
			+ " ci.temp_user_id,"
			+ " ci.product_id,"
			+ " ci.product_count,"
			+ " pi.price,"
			+ " pi.product_name,"
			+ " pi.product_name_kanam"
			+ " pi.release_company,"
			+ " pi.release_date,"
			+ " pi.image_file_path,"
			+ " pi.image_file_name,"
			+ " ci.product_count * pi.price as subtotal"
			+ " From cart_info as ci"
			+ " Left join product_info as pi"
			+ " ON ci.product_id = pi.product_id"
			+ " Where ci.user_id=?";
	try {
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, loginId);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			CartinfoDTO cartInfoDTO = new CartinfoDTO();
			cartInfoDTO.setId(rs.getInt("id"));
			cartInfoDTO.setUserId(rs.getString("user_id"));
			cartInfoDTO.setTempUserId(rs.getString("temp_user_id"));
			cartInfoDTO.setProductId(rs.getInt("product_id"));
			cartInfoDTO.setProductCount(rs.getInt("product_count"));
			cartInfoDTO.setPrice(rs.getInt("price"));
			cartInfoDTO.setProductName(rs.getString("product_name"));
			cartInfoDTO.setProductNameKana(rs.getString("product_name_kana"));
			cartInfoDTO.setCategoryId(rs.getInt("category_id"));
			cartInfoDTO.setImageFilePath(rs.getString("image_file_path"));
			cartInfoDTO.setImageFileName(rs.getString("image_file_name"));
			cartInfoDTO.setReleaseDate(rs.getDate("release_date"));
			cartInfoDTO.setReleaseCompany(rs.getString("release_company"));
			cartInfoDTO.setStatus(rs.getString("status"));
			cartInfoDTO.setSubtotal(rs.getInt("subtotal"));
			CartList.add(cartInfoDTO);
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return CartList;
}

//商品詳細画面からカートに追加した際にカート内の合計金額を表示するのに使用されるメソッド
public int TotalPrice(String userId){
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	int totalPrice=0;
//	 group by user_idでSUM()の中身をuser_idに集計している
	String sql = "select sum(product_count * price) as total_price from cart_info where user_id=? group by user_id";
	try {
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, userId);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			totalPrice = rs.getInt("total_price");
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return totalPrice;
}


//	cart.jspの削除ボタンを押した際にDeleteCartActionにて機能
public int delete(String id) {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	int count = 0;
	String sql = "delete from cart_info where id=?";
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, id);

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
}