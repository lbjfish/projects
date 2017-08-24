package com.bingobox.user.framework.constant;

public enum ResultCode {
	
	
	
	LOGIN_UNUSER(11001, "用户未注册"), 
	LOGIN_UNPWD(11002, "密码错误"), 
	LOGIN_CODE_ERROR(11003, "验证码错误");

	private Integer code;
	private String msg;

	private ResultCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
