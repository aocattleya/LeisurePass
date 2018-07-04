package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.leisurepass.dto.PurchaseHistoryInfoDTO;
import com.internousdev.leisurepass.util.DBConnector;


public class PurchaseHistoryInfoDAO {

//////////////購入履歴情報を取得します//////////////////
	public List<PurchaseHistoryInfoDTO> getPurchaseHistoryList(String loginId){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();

		List<PurchaseHistoryInfoDTO> purchaseHistoryInfoDTOList = new ArrayList<PurchaseHistoryInfoDTO>();
		//phiはpurchase_history_info、piはproduct_info、diはdestination_infoの略称
		String sql = "SELECT "
				+ "phi.id AS id, " //ID
				+ "phi.user_id AS user_id, " //ユーザーID
				+ "phi.product_count AS product_count, " //個数
				+ "pi.product_name AS product_name, " //商品名
				+ "pi.product_name_kana AS product_name_kana, " //商品名かな
				+ "pi.product_description AS product_description, " //商品詳細
				+ "pi.category_id AS category_id, " //カテゴリID
				+ "pi.price, " //価格
				+ "pi.image_file_name AS image_file_name, " //画像ファイルパス
				+ "pi.image_file_path AS image_file_path, " //画像ファイル名
				+ "pi.release_company, " //発売会社
				+ "pi.release_date, " //発売日
				+ "phi.price AS price, " //金額(合計?)
				+ "phi.regist_date AS regist_date, " //登録日
				+ "phi.update_date AS update_date, " //更新日
				+ "di.family_name AS family_name, " //姓
				+ "di.first_name AS first_name, " //名
				+ "di.family_name_kana AS family_name_kana, " //姓かな
				+ "di.first_name_kana AS first_name_kana, " //名かな
				+ "di.email AS email, " //メールアドレス
				+ "di.tel_number AS tel_number, " //電話番号
				+ "di.user_address AS user_address " //住所
				+ "FROM purchase_history_info AS phi "
				+ "LEFT JOIN product_info AS pi "
				+ "ON phi.product_id = pi.product_id " //それぞれの商品IDをリンク
				+ "LEFT JOIN destination_info AS di "
				+ "ON phi.destination_id = di.id " //それぞれの宛先情報IDをリンク
				+ "WHERE phi.user_id = ? " //"対象のユーザーIDの"
				+ "ORDER BY regist_date DESC"; //登録日基準の降順で並び替え

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,loginId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()){
				PurchaseHistoryInfoDTO purchaseHistoryInfoDto = new PurchaseHistoryInfoDTO();
				purchaseHistoryInfoDto.setId(resultSet.getInt("id"));
				purchaseHistoryInfoDto.setUserId(resultSet.getString("user_id"));
				purchaseHistoryInfoDto.setProductId(resultSet.getInt("product_id"));
				purchaseHistoryInfoDto.setPrice(resultSet.getInt("price"));
				purchaseHistoryInfoDto.setRegistDate(resultSet.getDate("regist_date"));
				purchaseHistoryInfoDto.setUpdateDate(resultSet.getDate("update_date"));
				purchaseHistoryInfoDto.setProductName(resultSet.getString("product_name"));
				purchaseHistoryInfoDto.setProductNameKana(resultSet.getString("product_name_kana"));
				purchaseHistoryInfoDto.setProductDescription(resultSet.getString("product_description"));
				purchaseHistoryInfoDto.setCategoryId(resultSet.getInt("category_id"));
				purchaseHistoryInfoDto.setImageFileName(resultSet.getString("image_file_name"));
				purchaseHistoryInfoDto.setImageFilePath(resultSet.getString("image_file_path"));
				purchaseHistoryInfoDto.setReleaseCompany(resultSet.getString("release_company"));
				purchaseHistoryInfoDto.setReleaseDate(resultSet.getDate("release_date"));
				purchaseHistoryInfoDto.setFamilyName(resultSet.getString("family_name"));
				purchaseHistoryInfoDto.setFirstName(resultSet.getString("first_name"));
				purchaseHistoryInfoDto.setFamilyNameKana(resultSet.getString("family_name_kana"));
				purchaseHistoryInfoDto.setFirstNameKana(resultSet.getString("first_name_kana"));
				purchaseHistoryInfoDto.setEmail(resultSet.getString("email"));
				purchaseHistoryInfoDto.setTelNumber(resultSet.getString("tel_number"));
				purchaseHistoryInfoDto.setUserAddress(resultSet.getString("user_address"));
				purchaseHistoryInfoDTOList.add(purchaseHistoryInfoDto);

			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return purchaseHistoryInfoDTOList;
	}
//////////////////ここまで///////////////////////

/////////////////購入した商品を商品履歴に追加します//////////////////////
	public int regist(String loginId, int productId, int productCount, int destinationId, int price){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
		String sql = "INSERT INTO purchase_history_info("
				+ "user_id, " //ユーザーID
				+ "product_id, " //商品ID
				+ "product_count, " //購入個数
				+ "price, " //金額(合計?)
				+ "destination_id, " //宛先ID
				+ "regist_date, " //登録日
				+ "update_date) " //更新日
				+ "values(?, ?, ?, ?, ?, now(), '0000-01-01')";
			//追加した要素の有無を判定するための変数(無い場合は0)
		int count = 0;
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			preparedStatement.setInt(2, productId);
			preparedStatement.setInt(3, productCount);
			preparedStatement.setInt(4, price);
			preparedStatement.setInt(5, destinationId);
			count = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
//////////////////////////ここまで/////////////////////////////////////

///////////////////////購入履歴を全て削除します///////////////////////
	public int deleteAll(String loginId){
		DBConnector dbConnector = new DBConnector();
		Connection connection = dbConnector.getConnection();
			//指定したユーザーの購入履歴を全削除
		String sql = "DELETE FROM purchase_history_info WHERE user_id = ?";
			//削除した要素の有無を判定するための変数(無い場合は0)
		int count = 0;
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginId);
			count = preparedStatement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return count;
	}
////////////////////////////ここまで///////////////////////////////////////
}
