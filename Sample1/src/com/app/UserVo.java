package com.app;

public class UserVo {
	
	private String name;
	private String city;
	private String role;
	public UserVo(String name, String city, String role) {
		super();
		this.name = name;
		this.city = city;
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserVo [name=" + name + ", city=" + city + ", role=" + role + "]";
	}
	
	

}

