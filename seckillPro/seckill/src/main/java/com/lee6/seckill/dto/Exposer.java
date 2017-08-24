package com.lee6.seckill.dto;

/**
 * 暴露秒杀地址DTO
 * @author lbj
 *
 */
public class Exposer {
	//是否暴露秒杀地址
	private boolean exposed;
	//一种加密措施
	private String md5;
	//id
	private long seckillId;
	//系统当前时间(有可能用户调用这个接口的时候秒杀还未开启，不能告诉他秒杀地址，但是返回一个系统时间，定义到服务器的时间), 
	//当前时间毫秒值  -- 例：Wed Nov 23 15:55:31 CST 2016 = 1479887678225
	private long now;
	//秒杀开启时间 //开始时间毫秒值  -- 例：Wed Nov 23 15:55:31 CST 2016 = 1479887678225
	private long start;
	//秒杀结束时间 //结束时间毫秒值  -- 例：Wed Nov 23 15:55:31 CST 2016 = 1479887678225
	private long end;
	
	public Exposer(){
		
	}

	//true
	public Exposer(boolean exposed, String md5, long seckillId) {
		this.exposed = exposed;
		this.md5 = md5;
		this.seckillId = seckillId;
	}

	//false 秒杀未开始或秒杀已结束
	public Exposer(boolean exposed, long seckillId, long now, long start, long end) {
		this.exposed = exposed;
		this.seckillId = seckillId;
		this.now = now;
		this.start = start;
		this.end = end;
	}

	//false 查不到秒杀记录的情况
	public Exposer(boolean exposed, long seckillId) {
		this.exposed = exposed;
		this.seckillId = seckillId;
	}

	public boolean isExposed() {
		return exposed;
	}

	public void setExposed(boolean exposed) {
		this.exposed = exposed;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public long getSeckillId() {
		return seckillId;
	}

	public void setSeckillId(long seckillId) {
		this.seckillId = seckillId;
	}

	public long getNow() {
		return now;
	}

	public void setNow(long now) {
		this.now = now;
	}

	public long getStart() {
		return start;
	}

	public void setStart(long start) {
		this.start = start;
	}

	public long getEnd() {
		return end;
	}

	public void setEnd(long end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Exposer [exposed=" + exposed + ", md5=" + md5 + ", seckillId="
				+ seckillId + ", now=" + now + ", start=" + start + ", end="
				+ end + "]";
	}
	
}
