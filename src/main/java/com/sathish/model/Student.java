package com.sathish.model;

public class Student {

	private Integer Id;
	private String Name;
	private Integer RegNO;
	private String Email;
	private String password;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Integer getRegNO() {
		return RegNO;
	}
	public void setRegNO(Integer regNO) {
		RegNO = regNO;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", RegNO=" + RegNO + ", Email=" + Email + ", password="
				+ password + "]";
	}
	
}
