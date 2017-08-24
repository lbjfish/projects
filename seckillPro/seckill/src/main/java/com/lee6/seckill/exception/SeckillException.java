package com.lee6.seckill.exception;

/**
 * 秒杀相关业务异常(中间类)
 * @author lbj
 *
 */
public class SeckillException extends RuntimeException {

	public SeckillException(String message){
		super(message);
	}

	public SeckillException(String message, Throwable cause){
		super(message, cause);
	}
}
