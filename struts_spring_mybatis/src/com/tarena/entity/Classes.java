package com.tarena.entity;

import java.util.List;


public class Classes {
	private Integer ca_id;
	private String ca_name;
	private Integer t_id;
	
	private Teacher teacher;
	
	private List<Student> stus;

	public List<Student> getStus() {
		return stus;
	}

	public void setStus(List<Student> stus) {
		this.stus = stus;
	}

	public Integer getCa_id() {
		return ca_id;
	}

	public void setCa_id(Integer ca_id) {
		this.ca_id = ca_id;
	}

	public String getCa_name() {
		return ca_name;
	}

	public void setCa_name(String ca_name) {
		this.ca_name = ca_name;
	}

	public Integer getT_id() {
		return t_id;
	}

	public void setT_id(Integer t_id) {
		this.t_id = t_id;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Classes [ca_id=" + ca_id + ", ca_name=" + ca_name + ", t_id="
				+ t_id + ", teacher=" + teacher + ", stus=" + stus + "]";
	}
	
}
