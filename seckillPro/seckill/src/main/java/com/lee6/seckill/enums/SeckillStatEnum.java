package com.lee6.seckill.enums;

/**
 * 使用枚举表述常量数据字典 
 * 把java中常量的值（就是固定不会被改变的属性）提取出来，封装成枚举类型,这样就保证传参数不会过多，直接传一个枚举类型就够了
 * 有三种方式传常量：1.类里定义static final MAX = 22 ; 2.就是用枚举
 * @author lbj
 *
 */
public enum SeckillStatEnum {
	
	SUCCESS(1,"秒杀成功"),
	END(0,"秒杀结束"),
	REPEAT_KILL(-1,"重复秒杀"),
	INNER_ERROR(-2,"系统异常"),
	DATA_REWRITE(-3,"数据篡改");
	
	private int state;
	private String stateInfo;

	private SeckillStatEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
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

	public static SeckillStatEnum stateOf(int index){
		for(SeckillStatEnum state : values()){
			if(state.getState() == index){
				return state;
			}
		}
		return null;
	}
}
