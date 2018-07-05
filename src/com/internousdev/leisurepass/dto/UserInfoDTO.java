
package com.internousdev.leisurepass.dto;

import java.util.Date;

public class UserInfoDTO {
	 private int id;
	 private String userId;
	 private String password;
	 private String familyName;
	 private String firstName;
	 private String familyNameKana;
	 private String firstNameKana;
	 private int sex;
	 private String email;
	 private String status;
	 private int logined;
	 private Date registDate;
	 private Date updateDate;

	 public int getId(){
		 return id;
	 }
	 public void setId(int id){
		 this.id = id;
	 }

	 public String getUserId(){
		 return userId;
	 }
	 public void setUserId(String userId){
		 this.userId = userId;
	 }

	 public String getPassword(){
		 return password;
	 }
	 public void setPassword(String password){
		 this.password = password;
	 }

	 public String getFamilyName(){
		 return familyName;
	 }
	 public void setFamilyName(String familyName){
		 this.familyName = familyName;
	 }

	 public String getFirstName(){
		 return firstName;
	 }
	 public void setFirstName(String firstName){
		 this.firstName = firstName;
	 }

	 public String getFamilyNameKana(){
		 return familyNameKana;
	 }
	 public void setFamilyNameKana(String familyNameKana){
		 this.familyNameKana = familyNameKana;
	 }

	 public String getFirstNameKana(){
		 return firstNameKana;
	 }
	 public void setFirstNameKana(String firstNameKana){
		 this.firstNameKana = firstNameKana;
	 }

	 public int getSex(){
		 return sex;
	 }
	 public void setSex(int sex){
		 this.sex = sex;
	 }

	 public String getEmail(){
		 return email;
	 }
	 public void setEmail(String email){
		 this.email = email;
	 }
	 public String getStatus() {
			return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getLogined() {
		return logined;
	}
	public void setLogined(int logined) {
		this.logined = logined;
	}
	public Date getRegistDate() {
		return registDate;
	}
	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
