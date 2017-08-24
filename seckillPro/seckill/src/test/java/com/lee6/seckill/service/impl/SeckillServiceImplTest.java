package com.lee6.seckill.service.impl;

import com.lee6.seckill.dto.Exposer;
import com.lee6.seckill.dto.SeckillExecution;
import com.lee6.seckill.entity.Seckill;
import com.lee6.seckill.service.SeckillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/6/15 0015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class SeckillServiceImplTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SeckillService seckillService;

    @Test
    public void testGetSeckillList() throws Exception {
        List<Seckill> list = seckillService.getSeckillList();
        //{}代表着占位符，list代表占位符的值
        logger.info("结果={}",list);
    }

    @Test
    public void testGetById() throws Exception {
        long id = 1000;
        Seckill seckill = seckillService.getById(id);
        logger.info("结果={}",seckill);
    }

    @Test
    public void testExportSeckillUrl() throws Exception {
        long id = 1000;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        logger.info("结果={}",exposer);
    }

    @Test
    public void testExecuteSeckill() throws Exception {
//		long id = 1000;
//		long phone = 13578425963L;
//		String md5 = "4bfc7082408e10ad9b7602e6bf509c14";
//		try{
//			SeckillExecution execution = seckillService.executeSeckill(id, phone, md5);
//			logger.info("结果={}",execution);
//		}catch(RepeatKillException e){
//			logger.error(e.getMessage());
//		}catch(SeckillCloseException e){
//			logger.error(e.getMessage());
//		}

        long id = 1000;
        long phone = 13578425963L;
        String md5 = "4bfc7082408e10ad9b7602e6bf509c14";
        SeckillExecution execution = seckillService.executeSeckill(id, phone, md5);
        logger.info("结果={}",execution);
    }
}