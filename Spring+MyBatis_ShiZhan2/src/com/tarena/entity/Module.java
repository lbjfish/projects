package com.tarena.entity;

import java.io.Serializable;

public class Module implements Serializable {

	private Integer module_id;
	private String name;
	
	public Integer getModule_id() {
		return module_id;
	}
	public void setModule_id(Integer moduleId) {
		module_id = moduleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return module_id+","+name;
	}
	
}
