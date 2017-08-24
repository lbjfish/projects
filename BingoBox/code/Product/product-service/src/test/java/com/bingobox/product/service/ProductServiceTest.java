package com.bingobox.product.service;

import com.bingobox.product.po.ProductPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-service.xml")
public class ProductServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private ProductService productService;

    @Test
    public void getById() throws Exception {
        long productId = 4L;
        ProductPO product = productService.getProduct(productId);
        logger.info(product.toString());
    }
}