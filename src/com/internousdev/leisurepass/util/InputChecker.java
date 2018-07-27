package com.internousdev.leisurepass.util;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils
;
public class InputChecker {



	/**
	 * このプログラムは渡された値を正規表現か検証するものです。
	 * 使い方はdoCheckに9つの引数を渡します。後半部分には当てはまる形式にtrueを入れます。
	 * emailを判別したいのであれば英字、数字、記号を含むため下記のようになります。
	 * 例(質問の内容,値,最小文字数,最大文字数,true,false,false,true,true)となります。
	 * 結果はList形式で渡されることに気を付けてください。
	 *
	 */
	public List<String> doCheck(String propertyName,String value,int minLength,int maxLength,boolean availableAlphabeticCharacters,boolean availableKanji,boolean availableHiragana,boolean availableHalfWidthDigit,boolean availableHalfWidthSymbols,boolean availableKatakana,boolean availableFullWidthSymbols, boolean availableSpace, boolean availableFullWidthAlphanumericCharacters){

		//検証した結果を入れるList
				List<String> stringList = new ArrayList<String>();
				List<String> characterTypeList = new ArrayList<String>();

				//入力欄が空かどうかを検証します
				if(minLength > 0) {
					if(StringUtils.isEmpty(value)){
						stringList.add(propertyName + "を入力してください。");
					}
				}

				//入力欄が最小文字数以上、最大文字数以下かどうかを検証します
				if(value.length() < minLength || value.length() > maxLength){
					stringList.add(propertyName + "は" + minLength + "文字以上" + maxLength + "文字以下で入力してください。");
				}


				///////////入力された文字のタイプから何を判別するか決めます//////////
				String regularExpression = "";
				String errorExpression = "";


				if(availableAlphabeticCharacters || availableKanji || availableHiragana || availableHalfWidthDigit || availableHalfWidthSymbols||availableKatakana||availableFullWidthSymbols||availableSpace){
					regularExpression = "[^";
				}
				if(!(availableAlphabeticCharacters) || !(availableKanji) || !(availableHiragana) || !(availableHalfWidthDigit) || !(availableHalfWidthSymbols)|| !(availableKatakana)|| !(availableFullWidthSymbols)|| !(availableSpace)){
					errorExpression = "[^";
				}

				if(availableAlphabeticCharacters){
					regularExpression +="a-zA-Z";
						characterTypeList.add("半角英字");
				}else{
					errorExpression += "a-zA-Z";
				}

				if(availableKanji){
					regularExpression +="一-龯";
					characterTypeList.add("漢字");
				}else{
					errorExpression +="一-龯";
				}

				if(availableHiragana){
					regularExpression +="ぁ-ん";
					characterTypeList.add("ひらがな");
				}else{
					errorExpression +="ぁ-ん";
				}

				if(availableHalfWidthDigit){
					regularExpression +="0-9";
					characterTypeList.add("半角数字");
				}else{
					errorExpression+="0-9";
				}

				if(availableHalfWidthSymbols){
					regularExpression +="@.,;:!#$%&'*+-/=?^_`{|}~";
					characterTypeList.add("半角記号");
				}else{
					errorExpression +="@.,;:!#$%&'*+-/=?^_`{|}~";
				}

				if(availableKatakana){
					regularExpression +="ァ-ヺ";
					characterTypeList.add("カタカナ");
				}else{
					errorExpression +="ァ-ヺ";
				}

				if(availableFullWidthSymbols){
					regularExpression +="＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～";
					characterTypeList.add("全角記号");
				}else{
					errorExpression +="＠．，；：！＃＄％＆’＊＋―／＝？＾＿｀｛｜｝～";
				}

				if(availableSpace){
					regularExpression +=" 　";
					//characterTypeList.add("スペース");
				}else{
					errorExpression +=" 　";
				}

				if(availableFullWidthAlphanumericCharacters){
					regularExpression +="０-９ａ-ｚＡ-Ｚ";
					characterTypeList.add("全角英数字");
				}else{
					errorExpression +="０-９ａ-ｚＡ-Ｚ";
				}

				if(!StringUtils.isEmpty(regularExpression)){
					regularExpression +="]+";
				}
				if(!StringUtils.isEmpty(errorExpression)){
					errorExpression +="]+";
				}
				////////////////////////////ここまで///////////////////////////


				//判別した項目に応じてエラーメッセージを返します
				String characterType = "";
				for(int i = 0;i < characterTypeList.size();i++){
					if(i == 0){
						characterType += characterTypeList.get(i).toString();
					}else{
						characterType += "、" + characterTypeList.get(i).toString();
					}
				}
				if(errorExpression.equals("")){
					if(value.matches(regularExpression)){
						stringList.add(propertyName + "は" + characterType + "で入力してください。");
					}
				}else{
					if(value.matches(regularExpression) || (!value.matches(errorExpression) && !value.equals(""))){
						stringList.add(propertyName + "は" + characterType + "で入力してください。");
					}
				}

				if (!availableSpace){
					if(value.contains(" ") || value.contains("　")){
						stringList.add(propertyName + "はスペースを使用できません。");
					}
				}

				return stringList;
			}


	//一度目のパスワードと二度目のパスワードが同じかを検証します。
	public List<String> doPasswordCheck(String password,String reConfirmationPassword){
		List<String> stringList = new ArrayList<String>();
		if(!(password.equals(reConfirmationPassword))){
			stringList.add("入力されたパスワードが異なります。");
		}
		return stringList;
	}
}