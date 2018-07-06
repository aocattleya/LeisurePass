package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.leisurepass.dto.CartInfoDTO;
import com.internousdev.leisurepass.util.DBConnector;

public class CartInfoDAO {
//	カートに表示する表の中身list,
//	AddCartActionに続く
public List<CartInfoDTO> getCartInfoDtoList(String loginId){
	List<CartInfoDTO> cartInfoDtoList = new ArrayList<CartInfoDTO>();
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	String sql="select ci.id as id,"
			+ " ci.user_id as user_id,"
			+ " ci.temp_user_id as temp_user_id,"
			+ " ci.product_id as product_id,"
			+ " sum(ci.product_count) as product_count,"
			+ " pi.price as price,"
			+ " pi.regist_date as regist_date,"
			+ " pi.update_date as update_date,"
			+ " pi.product_name as product_name,"
			+ " pi.product_name_kana as product_name_kana,"
			+ " pi.product_description as product_description,"
			+ " pi.category_id as category_id,"
			+ " pi.image_file_path as image_file_path, "
			+ " pi.image_file_name as image_file_name, "
			+ " pi.release_date as release_date,"
			+ " pi.release_company as release_company,"
			+ " pi.status as status,"
			+ " (sum(ci.product_count) * pi.price) as subtotal"
			+ " FROM cart_info as ci"
			+ " LEFT JOIN product_info as pi"
			+ " ON ci.product_id = pi.product_id"
			+ " WHERE ci.user_id = ?"
			+ " group by product_id";
	try {
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, loginId);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			CartInfoDTO cartInfoDTO = new CartInfoDTO();
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
			cartInfoDtoList.add(cartInfoDTO);
		}

	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return cartInfoDtoList;
}

//商品詳細画面からカートに追加した際にカート内の合計金額を表示するのに使用されるメソッド
public int getTotalPrice(String userId){
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
//カート(cart_infoテーブル)に商品等の情報を入れる
public int regist(String userId, String tempUserId, int productId, String productCount, int price) {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	int count = 0;
	String sql ="insert into cart_info(user_id, tempUserId, product_id, product_count, price, regist_date)"
			+ "values(?,?,?,?,?,?,now())";
	try{
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, userId);
		ps.setString(2, tempUserId);
		ps.setInt(3, productId);
		ps.setString(4, productCount);
		ps.setInt(5, price);
		count=ps.executeUpdate();
	} catch (SQLException e) {
		e.printStackTrace();
	}try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return count;
	}

//マイページ画面にて商品購入履歴の削除に用いられる
public int deleteAll(String userId){
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	int count =0;
	String sql="delete from cart_info where user_id=?";

	try{
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, userId);
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

//決済画面にて使用
public int linkToLoginId(String tempUserId, String loginId){
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	int count=0;
	String sql="update cart_info set user_id=? , temp_user_id=null where temp_user_id=?";

	try{
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, tempUserId);
		ps.setString(2, loginId);
	}catch(SQLException e){
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