
package com.internousdev.leisurepass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.leisurepass.dto.UserInfoDTO;
import com.internousdev.leisurepass.util.DBConnector;



public class UserInfoDAO {
	public int createUser(String familyName,String firstName,String familyNameKana,String firstNameKana,String sex,String email,String loginId,String password){
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		int count = 0;
		String sql = "insert into user_info(user_id,password,family_name,first_name,family_name_kana,"
				+ " first_name_kana,sex,email,status,logined,regist_date,update_date)"
				+ " values(?,?,?,?,?,?,?,?,?,?, now(),0)";
		try{
			PreparedStatement preparedstatement = con.prepareStatement(sql);
			preparedstatement.setString(1,loginId);
			preparedstatement.setString(2,password);
			preparedstatement.setString(3,familyName);
			preparedstatement.setString(4,firstName);
			preparedstatement.setString(5,familyNameKana);
			preparedstatement.setString(6,firstNameKana);
			preparedstatement.setString(7,sex);
			preparedstatement.setString(8,email);
			preparedstatement.setInt(9,0);
			preparedstatement.setInt(10,1);
			count = preparedstatement.executeUpdate();
		} catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		} catch (SQLException e){
			e.printStackTrace();
		}
		return count;
	}
	/*
	 *同じID.PASSWORDの人がいるかどうか判別しています。↓
	 *TRUEなら該当する人がいるということなので、そのID.PASSWORDは
	 *使えません。
	 * 『}catch』はDBに接続できなかったなどの例外を示しています。
	 */

public boolean isExistsUserInfo(String loginId,String password){
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	boolean result = false;
	String sql= "select count(*) as count from user_info where user_id= binary ? and password= binary ?";
	try{
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, loginId);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			if(resultSet.getInt("count")>0){
				result = true;
			}
		}
	} catch (SQLException e){
		e.printStackTrace();
	}
	try{
		con.close();
	} catch (SQLException e){
		e.printStackTrace();
	}
	return result;

}



/*
 * 同じIDがないかチェックしている↓
 */


public boolean existLoginId(String loginId) {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	boolean result = false;


	String sql = "SELECT * FROM user_info WHERE user_id =?";

	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, loginId);
		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			result = true;

		}

	} catch (SQLException e) {
		e.printStackTrace();
	}
	try{
		con.close();
	}catch(SQLException e){
		e.printStackTrace();
	}
	return result;
}







public UserInfoDTO getUserInfo(String loginId,String password){
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	UserInfoDTO userInfoDTO = new UserInfoDTO();
	String sql= "select * from user_info where user_id= binary ? and password= binary ?";
	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, loginId);
		preparedStatement.setString(2, password);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()){
			userInfoDTO.setId(resultSet.getInt("id"));
			userInfoDTO.setUserId(resultSet.getString("user_id"));
			userInfoDTO.setPassword(resultSet.getString("password"));
			userInfoDTO.setFamilyName(resultSet.getString("family_name"));
			userInfoDTO.setFirstName(resultSet.getString("first_name"));
			userInfoDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
			userInfoDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
			userInfoDTO.setSex(resultSet.getInt("sex"));
			userInfoDTO.setEmail(resultSet.getString("email"));
			userInfoDTO.setStatus(resultSet.getString("status"));
			userInfoDTO.setLogined(resultSet.getInt("logined"));
			userInfoDTO.setRegistDate(resultSet.getDate("regist_date"));
			userInfoDTO.setUpdateDate(resultSet.getDate("update_date"));
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		connection.close();
	}catch (SQLException e){
		e.printStackTrace();
	}
	return userInfoDTO;
	}


/*
 * userInfoDTO.set(resultSet.getString("family_name_kana"));〜
 * は書いていません！！！！
 *
 * loginIdだけ入力しPASSWORDを変更したい場合↓
 */

public UserInfoDTO getUserInfo(String loginId) {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	UserInfoDTO userInfoDTO = new UserInfoDTO();
	String sql = "select * from user_info where user_id= binary ?";
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, loginId);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			userInfoDTO.setId(resultSet.getInt("id"));
			userInfoDTO.setUserId(resultSet.getString("user_id"));
			userInfoDTO.setPassword(resultSet.getString("password"));
			userInfoDTO.setFamilyName(resultSet.getString("family_name"));
			userInfoDTO.setFirstName(resultSet.getString("first_name"));
			userInfoDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
			userInfoDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
			userInfoDTO.setSex(resultSet.getInt("sex"));
			userInfoDTO.setEmail(resultSet.getString("email"));
			userInfoDTO.setStatus(resultSet.getString("status"));
			userInfoDTO.setLogined(resultSet.getInt("logined"));
			userInfoDTO.setRegistDate(resultSet.getDate("regist_date"));
			userInfoDTO.setUpdateDate(resultSet.getDate("update_date"));
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	try {
		connection.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return userInfoDTO;
}



public int resetPassword(String loginId,String password){
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	String sql= "update user_info set password=? where user_Id= binary ?";
	int result= 0;
	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, password);
		preparedStatement.setString(2, loginId);
		result= preparedStatement.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		connection.close();
	}catch (SQLException e){
		e.printStackTrace();
	}
	return result;
	}
/*
 *
 * ログインしているかどうかのメソッド↓
 * logined=1というのは
 * ログインできていたら、１
 * できていなかったら、０
 * が入ることになっている。
 *
 */

public int login(String loginId,String password){
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	String sql= "update user_info set logined=1 where user_Id= binary ? and password = binary ?";
	int result= 0;
	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, loginId);
		preparedStatement.setString(2, password);
		result = preparedStatement.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		connection.close();
	}catch (SQLException e){
		e.printStackTrace();
	}
	return result;
	}


/*
 *  * ログアウトしているかどうかのメソッド↓
 * logined=0というのは
 * ログインできていたら、１
 * できていなかったら、０
 * が入ることになっている。
 *
 */



public int logout(String loginId){
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();
	String sql= "update user_info set logined=0 where user_Id= binary ?";
	int result= 0;
	try{
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, loginId);
		result = preparedStatement.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}
	try{
		connection.close();
	}catch (SQLException e){
		e.printStackTrace();
	}
	return result;
	}

/*
 * passwordは４文字以上１６文字以下。
 *
 * int beginIndex = 0;　→　１文字目のこと
 * int endIndex = 4;　→　５文字目のこと
 * もともと入っているStringBuilderをインスタンス化。StringBuilder=**************** 16個の＊
 * concealPasswordという変数に代入していく。
 *
 * stringBuilder.replace　→　16個の＊から　いくつか見えるようにしてほしい。という意味
 * いくつかとは、今回の場合０−４→”５”でreplaceはendindex−１をとして考える。
 * だから４つ見えるようにしてほしいということ。
 *
 *もし、４文字のpassword 1234 だったら　　　　　1234************
 *もし、１０文字のpassword
 * 12345678910でも　　　　　　　　　　　　　　　1234************
 */


public String concealPassword(String password) {
	int beginIndex = 0;
	int endIndex = 1;
	if(password.length() > 1) {
		endIndex = 2;
	}
	StringBuilder stringBuilder = new StringBuilder("****************");

	String concealPassword = stringBuilder.replace(beginIndex, endIndex, password.substring(beginIndex,endIndex)).toString();
	return concealPassword;

}
}


