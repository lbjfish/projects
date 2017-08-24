package com.lee6.seckill.dto;

import com.lee6.seckill.entity.SuccessKilled;
import com.lee6.seckill.enums.SeckillStatEnum;

/**
 * 封装秒杀执行后结果
 * @author lbj
 *
 */
public class SeckillExecution {
	
	private long seckillId;
	//执行秒杀后 的 状态  -1:重复秒杀 -2:系统异常 -3:数据篡改 1:秒杀成功 0:秒杀结束
	private int state;
	//解释状态的标示信息
	private String stateInfo;
	//秒杀成功的对象
	private SuccessKilled successKilled;

	//秒杀成功状态下的构造方法
	public SeckillExecution(long seckillId, SeckillStatEnum statEnum,
			SuccessKilled successKilled) {
		super();

		this.seckillId = seckillId;
		this.state = statEnum.getState();
		this.stateInfo = statEnum.getStateInfo();
		this.successKilled = successKilled;
	}
	//秒杀失败状态下构造方法
	public SeckillExecution(long seckillId, SeckillStatEnum statEnum) {
		super();
		this.seckillId = seckillId;
		this.state = statEnum.getState();
		this.stateInfo = statEnum.getStateInfo();
	}
	public long getSeckillId() {
		return seckillId;
	}
	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getStateInfo() {
		return stateInfo;
	}
	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}
	public SuccessKilled getSuccessKilled() {
		return successKilled;
	}
	public void setSuccessKilled(SuccessKilled successKilled) {
		this.successKilled = successKilled;
	}
	@Override
	public String toString() {
		return "SeckillExecution [seckillId=" + seckillId + ", state=" + state
				+ ", stateInfo=" + stateInfo + ", successKilled="
				+ successKilled + "]";
	}
	
}
