package com.lee6.seckill.service.impl;

import java.util.Date;
import java.util.List;

import com.lee6.seckill.dao.SeckillDao;
import com.lee6.seckill.dao.SuccessKilledDao;
import com.lee6.seckill.dto.Exposer;
import com.lee6.seckill.dto.SeckillExecution;
import com.lee6.seckill.entity.Seckill;
import com.lee6.seckill.entity.SuccessKilled;
import com.lee6.seckill.enums.SeckillStatEnum;
import com.lee6.seckill.exception.RepeatKillException;
import com.lee6.seckill.exception.SeckillCloseException;
import com.lee6.seckill.exception.SeckillException;
import com.lee6.seckill.service.SeckillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

@Service
public class SeckillServiceImpl implements SeckillService{

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SeckillDao seckillDao;
	@Autowired
	private SuccessKilledDao successKilledDao;

	//随便敲，用于混淆md5使其不可逆
	private final String slat = "ksdh23874h3sa4dh~%ghdg34hs*&jh3das3jkh343";

	@Override
	public List<Seckill> getSeckillList() {
		return seckillDao.queryAll(0, 4);
	}

	@Override
	public Seckill getById(long seckillId) {
		return seckillDao.queryById(seckillId);
	}

	@Override
	public Exposer exportSeckillUrl(long seckillId) {
		Seckill seckill = seckillDao.queryById(seckillId);
		//false 查不到秒杀记录的情况
		if(seckill == null){
			return new Exposer(false,seckillId);
		}

		Date startTime = seckill.getStartTime();
		Date endTime = seckill.getEndTime();
		//系统当前时间
		Date nowTime = new Date();
		//false 秒杀未开始或秒杀已结束
		if(nowTime.getTime() < startTime.getTime() || nowTime.getTime() > endTime.getTime()){
			return new Exposer(false,seckillId, nowTime.getTime(), startTime.getTime(),endTime.getTime());
		}

		//转化特定字符串的过程，不可逆
		String md5 = getMD5(seckillId);
		//true
		return new Exposer(true,md5,seckillId);
	}

	/**
	 * 获取md5值的方法
	 * spring-core-4.0.3.RELEASE.jar下生成加密md5的工具类   = DigestUtils.md5DigestAsHex(bytes)
	 * 把这个功能单独取出来原因：因为可能还有别的方法也需要生成md5
	 * @param seckillId
	 * @return
	 */
	private String getMD5(long seckillId){
		String base = seckillId + "/" + slat;
		//spring-core-4.0.3.RELEASE.jar下生成加密md5的工具类
		String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
		return md5;
	}

	@Override
	@Transactional
	/**
	 * 使用注解控制事务方法的优点：
	 * 1.开发团队达成一致约定，明确标注事务方法的编程风格。
	 * 2.保证事务方法的执行时间尽可能短，不要穿插其它网络操作RPC/HTTP请求或者剥离到事务方法外部
	 * 3.不是所有的方法都需要事务，如只有一条修改操作、只读操作不需要事务控制。
	 */
	public SeckillExecution executeSeckill(long seckillId, long userPhone,String md5)
			throws SeckillException, RepeatKillException,SeckillCloseException {
		try{
			if(md5 == null || !md5.equals(getMD5(seckillId))){
				throw new SeckillException("数据篡改异常 或 md5值没有匹配上！");
			}
			//执行秒杀逻辑：减库存  + 记录购买行为
			Date nowTime = new Date();
			//减库存
			int updateCount = seckillDao.reduceNumber(seckillId, nowTime);
			if(updateCount <= 0){
				//没有更新到记录，秒杀结束
				throw new SeckillCloseException("秒杀结束！");
			}else{
				//记录购买行为
				int insertCount = successKilledDao.insertSuccessKilled(seckillId, userPhone);
				//如果用户再一次秒杀，数据库的联合主键（seckillId, userPhone）是唯一的，所以会ignore，返回0
				if(insertCount <= 0){ //应该=0 因为不可能小于，但是不会错
					//重复秒杀
					throw new RepeatKillException("重复秒杀！");
				}else{
					//秒杀成功
					SuccessKilled successKilled = successKilledDao.queryByIdWidthSeckill(seckillId, userPhone);
					return new SeckillExecution(seckillId, SeckillStatEnum.SUCCESS,successKilled);
				}
			}
		}catch(SeckillCloseException e1){
			throw e1;
		}catch(RepeatKillException e2){
			throw e2;
		}catch(Exception e){
			logger.error(e.getMessage(), e);
			//所有编译期异常，转化为运行期异常
			throw new SeckillException("秒杀错误信息："+e.getMessage());
		}
	}

	public static void main(String[] args) {
		String base = 1000 + "/" + "ksdh23874h3sa4dh~%ghdg34hs*&jh3das3jkh343";
		//spring-core-4.0.3.RELEASE.jar下生成加密md5的工具类
		String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
		System.out.println(md5);
	}
}
