package com.bingobox.basedata.framework.util;

import java.io.Serializable;

public class CommonResult<T> extends BaseBean<T> implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2453620429044260547L;
	
	private String errCode;
	private String errMsg;
	private T data;
	
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
