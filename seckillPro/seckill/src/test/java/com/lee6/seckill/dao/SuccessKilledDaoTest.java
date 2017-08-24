package com.lee6.seckill.dao;

import com.lee6.seckill.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void testInsertSuccessKilled() throws Exception {
        long id= 1001L;
        long phone = 17600998078L;
        int inserCount = successKilledDao.insertSuccessKilled(id, phone);
        System.out.println("插入："+inserCount);
    }

    @Test
    public void testQueryByIdWidthSeckill() throws Exception {
        long id= 1001L;
        long phone = 17600998078L;
        SuccessKilled successKilled = successKilledDao.queryByIdWidthSeckill(id, phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }
}