package com.tarena.entity;


public class Student {
	private Integer s_id;
	private String s_name;
	private Integer ca_id;
	public Integer getS_id() {
		return s_id;
	}
	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public Integer getCa_id() {
		return ca_id;
	}
	public void setCa_id(Integer ca_id) {
		this.ca_id = ca_id;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_name=" + s_name + ", ca_id="
				+ ca_id + "]";
	}
	
	
}
