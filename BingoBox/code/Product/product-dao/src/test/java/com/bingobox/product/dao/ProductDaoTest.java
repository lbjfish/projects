package com.bingobox.product.dao;

import com.bingobox.product.po.ProductPO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ProductDaoTest {

    // Dao impl
    @Resource
    private ProductDao productDao;

    @Test
    public void getById() throws Exception {
        Long productId = 1L;
        ProductPO product = productDao.getProductById(productId);
        System.out.println(product.getProductName());
        System.out.println(product);
    }

    @Test
    public void getByParam() throws Exception {
        ProductPO productPO = new ProductPO();
        productPO.setProductId(2L);
        productPO.setIsDelete(0);
        productPO.setProductClassificationId(1L);
        productPO.setProductPackDictId(1L);
        productPO.setProductSpecification("水果");
        productPO.setAlarmBeforeDay(20);
        productPO.setProductProducingArea("北京市");
        productPO.setProductName("苹果");
        productPO.setProductFloorPrice(5.00);
        productPO.setProductBarCode("123456");
        productPO.setCreateUserId(1L);
        productPO.setLastUpdateUserId(1L);
        List<ProductPO> results = productDao.listProductByParam(productPO);
        for(int i=0; i<results.size(); i++) {
            System.out.println(results.get(i).getProductName());
        }
    }

    @Test
    public void saveProduct() throws Exception{
        ProductPO productPO = new ProductPO();
        productPO.setIsDelete(0);
        productPO.setProductClassificationId(1L);
        productPO.setProductPackDictId(1L);
        productPO.setProductSpecification("水果");
        productPO.setAlarmBeforeDay(20);
        productPO.setProductProducingArea("北京市");
        productPO.setProductName("香蕉");
        productPO.setProductFloorPrice(5.00);
        productPO.setProductBarCode("12345678");
        productPO.setCreateUserId(1L);
        productPO.setLastUpdateUserId(1L);
        productPO.setProductExpirationDate(new Date());
        productPO.setCreateTime(new Date());
        productPO.setLastUpdateTime(new Date());
        System.out.println("插入前id=" + productPO.getProductId());
        Integer id = productDao.saveProduct(productPO);
        System.out.println("=============================>>>>>"+id);
        System.out.println("插入后id="+ productPO.getProductId());

    }

    @Test
    public void updateProduct()  throws Exception{
        ProductPO productPO = new ProductPO();
        productPO.setProductId(6L);
        productPO.setIsDelete(0);
        productPO.setProductClassificationId(1L);
        productPO.setProductPackDictId(1L);
        productPO.setProductSpecification("水果");
        productPO.setAlarmBeforeDay(20);
        productPO.setProductProducingArea("北京市");
        productPO.setProductName("哈密瓜");
        productPO.setProductFloorPrice(5.00);
        productPO.setProductBarCode("12345678");
        productPO.setCreateUserId(1L);
        productPO.setLastUpdateUserId(1L);
        productPO.setProductExpirationDate(new Date());
        productPO.setCreateTime(new Date());
        productPO.setLastUpdateTime(new Date());
        Integer id = productDao.updateProduct(productPO);
        System.out.println("=============================>>>>>"+id);
    }

    @Test
    public void deleteProduct() throws Exception{
        Integer id=  productDao.deleteProduct(7L);
        System.out.println("==============>>>>"+id);
    }

}