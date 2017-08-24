package com.lee6.seckill.exception;

/**
 * 秒杀关闭异常（如果秒杀已经关闭了，还要去执行，还要去拿到秒杀地址是不允许的）
 * @author lbj
 */
public class SeckillCloseException extends SeckillException{
	
	public SeckillCloseException(String message){
		super(message);
	}
	
	public SeckillCloseException(String message,Throwable cause){
		super(message,cause);
	}
}
