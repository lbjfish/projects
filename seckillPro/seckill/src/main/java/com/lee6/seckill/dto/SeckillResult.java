package com.lee6.seckill.dto;

/**
 * 所有ajax请求返回类型，封装json结果
 * @author lbj
 *
 * @param <T>
 */
public class SeckillResult<T> {
	
	private boolean success;
	
	private T data;
	
	private String error;

	//正确/错误 返回这个构造方法 ， 特定异常也返回这个构造方法（如：RepeatKillException、SeckillCloseException）
	public SeckillResult(boolean success, T data) {
		super();
		this.success = success;
		this.data = data;
	}
	
	//值返回错误的构造方法
	public SeckillResult(boolean success, String error) {
		super();
		this.success = success;
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
