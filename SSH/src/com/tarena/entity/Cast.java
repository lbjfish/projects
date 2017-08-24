package com.tarena.entity;

public class Cast {
	private String name;
	private Double base_cost;
	private String os_username;
	private String login_passwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBase_cost() {
		return base_cost;
	}
	public void setBase_cost(Double base_cost) {
		this.base_cost = base_cost;
	}
	public String getOs_username() {
		return os_username;
	}
	public void setOs_username(String os_username) {
		this.os_username = os_username;
	}
	public String getLogin_passwd() {
		return login_passwd;
	}
	public void setLogin_passwd(String login_passwd) {
		this.login_passwd = login_passwd;
	}
	@Override
	public String toString() {
		return "Cast [name=" + name + ", base_cost=" + base_cost
				+ ", os_username=" + os_username + ", login_passwd="
				+ login_passwd + "]";
	}
	
}
