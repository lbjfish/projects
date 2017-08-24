package com.lee6.seckill.dao;

import org.apache.ibatis.annotations.Param;
import com.lee6.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
	/**
	 * 插入购买明细，可过滤重复
	 * @param seckillId
	 * @param userPhone
	 * @return 插入的行数 
	 */
	int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
	
	/**
	 * 根据id查询SuccessKilled并携带秒杀成功产品对象实体
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWidthSeckill(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);
	
}
