package com.example.demo.Bean;

public class BabyBean {

	int id;
	String name,meaning,sex,religion,username,password;
	
	
	
	public BabyBean() {
		
	}



	



	public BabyBean(int id, String name, String meaning, String sex, String religion) {
		super();
		this.id = id;
		this.name = name;
		this.meaning = meaning;
		this.sex = sex;
		this.religion = religion;
	}







	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getMeaning() {
		return meaning;
	}



	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getReligion() {
		return religion;
	}



	public void setReligion(String religion) {
		this.religion = religion;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
		
}
