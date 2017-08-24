package com.bingobox.user.framework.constant;

public enum StatusEnum {
	
	USER_UN_ACTIVATION(0,"未激活"),
	USER_ACTIVATION(1,"已激活");

	private Integer status;
	private String name;

	private StatusEnum(Integer status, String name) {
		this.status = status;
		this.name = name;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
