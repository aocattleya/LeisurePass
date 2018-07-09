package com.internousdev.leisurepass.util;



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

}
