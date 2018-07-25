package com.internousdev.leisurepass.util;

import java.util.Map;

public class CommonUtility {
//仮ＩＤの数字決定、ランダムの数字が生成され、その数字が仮ＩＤとなる
	public String randomValue(){
		String value ="";
		double d;
		for(int i=1; i<=16; i++){
			d=Math.random() * 10;
			value = value + ((int)d);
		}
		return value;
	}
public String [] parseArrayList(String s){
	return s.split(", ",0);
}


	// 管理者でログインしているかチェック
	// 管理者ではなかったら例外を発生させる
	public static void checkLoginAdmin(Map<String, Object> session) throws Exception {
		if (session.containsKey("status")) {

			/*ステータスが管理者でなければERROR*/
			if (!((String) session.get("status")).equals("1")) {
				throw new Exception();
			}
			/*statusがなくてもERROR*/
		} else {
			throw new Exception();
		}
	}
}
