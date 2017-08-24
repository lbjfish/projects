package com.bingobox.product.dao;

import com.bingobox.product.po.ProductClassificationPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by zhangfubin on 2017/7/6.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ProductClassificationDaoTest {
    @Resource
    private ProductClassificationDao productClassificationDao;

    @Test
    public void getById() throws Exception{
        ProductClassificationPO productClassificationPO = productClassificationDao.getProductClassificationById(1L);
        System.out.println(productClassificationPO.getClassificationCode());
    }

    @Test
    public void getByParam() throws Exception{
        ProductClassificationPO productClassificationPO = new ProductClassificationPO();
        /*productClassificationPO.setProductClassificationId(1L);
        productClassificationPO.setClassificationCode("123456");
        productClassificationPO.setClassificationName("水果");
        productClassificationPO.setParentClassificationId(1L);
        productClassificationPO.setCreateUserId(1L);
        productClassificationPO.setLastUpdateUserId(1L);*/
        productClassificationPO.setIsDelete(0);
        List<ProductClassificationPO> results = productClassificationDao.listProductClassificationByParam(productClassificationPO);


        for(int i=0; i<results.size(); i++){
            System.out.println(results.get(i).getClassificationCode());
        }
    }

    @Test
    public void insertProductClassification() throws Exception{
        ProductClassificationPO productClassificationPO = new ProductClassificationPO();
        productClassificationPO.setClassificationCode("123456");
        productClassificationPO.setClassificationName("水果");
        productClassificationPO.setParentClassificationId(1L);
        productClassificationPO.setCreateUserId(1L);
        productClassificationPO.setLastUpdateUserId(1L);
        productClassificationPO.setIsDelete(0);
        productClassificationPO.setCreateTime(new Date());
        productClassificationPO.setLastUpdateTime(new Date());

        System.out.println("插入前id=" + productClassificationPO.getProductClassificationId());

        productClassificationDao.saveProductClassification(productClassificationPO);

        System.out.println("插入后id=" + productClassificationPO.getProductClassificationId());

    }

    @Test
    public void updateProductClassification() throws Exception{
        ProductClassificationPO productClassificationPO = new ProductClassificationPO();
        productClassificationPO.setProductClassificationId(3L);
        productClassificationPO.setClassificationCode("123456");
        productClassificationPO.setClassificationName("饮料");
        productClassificationPO.setParentClassificationId(1L);
        productClassificationPO.setCreateUserId(1L);
        productClassificationPO.setLastUpdateUserId(1L);
        productClassificationPO.setIsDelete(0);
        productClassificationPO.setCreateTime(new Date());
        productClassificationPO.setLastUpdateTime(new Date());
        productClassificationDao.updateProductClassification(productClassificationPO);
    }

    @Test
    public void deleteProductClassification() throws Exception{
        productClassificationDao.deleteProductClassification(3L);
    }




}
