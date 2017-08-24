package com.lee6.seckill.service;

import java.util.List;

import com.lee6.seckill.dto.Exposer;
import com.lee6.seckill.dto.SeckillExecution;
import com.lee6.seckill.entity.Seckill;
import com.lee6.seckill.exception.RepeatKillException;
import com.lee6.seckill.exception.SeckillCloseException;
import com.lee6.seckill.exception.SeckillException;

/**
 * 业务接口：站在"试用者"角度设计接口
 * 三个方面：方法定义力度，参数，返回类型（return 类型/异常）
 * @author lbj
 *
 */
public interface SeckillService {
	/**
	 * 查询所有秒杀记录
	 * @return
	 */
	List<Seckill> getSeckillList();
	
	/**
	 * 查询单个秒杀记录
	 * @param seckillId
	 * @return
	 */
	Seckill getById(long seckillId);
	
	/**
	 * 秒杀开启时输出秒杀接口地址，否则输出系统时间和秒杀时间(如果秒杀未开启，让用户永远猜不到真实的秒杀地址)
	 * @param seckilId
	 */
	Exposer exportSeckillUrl(long seckillId);
	
	/**
	 * 执行秒杀操作（联合主键+md5）和内部一个md5作比较 如果md5值变了 会拒绝秒杀
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 */
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
			throws SeckillException,RepeatKillException,SeckillCloseException;
}
