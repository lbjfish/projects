package com.lee6.seckill.exception;

/**
 * 重复秒杀异常(可能他点错两次，或者用了脚本去重复秒杀) 
 * 运行期异常
 * @author lbj
 *
 */
public class RepeatKillException extends SeckillException {
	
	public RepeatKillException(String message){
		super(message);
	}
	
	public RepeatKillException(String message,Throwable cause){
		super(message,cause);
	}
}
