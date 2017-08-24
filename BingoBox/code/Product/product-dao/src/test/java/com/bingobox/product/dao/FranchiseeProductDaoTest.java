package com.bingobox.product.dao;

import com.bingobox.product.po.FranchiseeProductPO;
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
public class FranchiseeProductDaoTest {
    @Resource
    private FranchiseeProductDao franchiseeProductDao;

    @Test
    public void getFranchiseeProduct() throws Exception{
        FranchiseeProductPO franchiseeProductPO = franchiseeProductDao.getFranchiseeProduct(2L);
        System.out.println(franchiseeProductPO.getProductId());
    }

    @Test
    public void listFranchiseeProductByParam() throws Exception{
        FranchiseeProductPO franchiseeProductPO = new FranchiseeProductPO();
        /*franchiseeProductPO.setFranchiseeProductId(1L);
        franchiseeProductPO.setFranchiseeId(1L);
        franchiseeProductPO.setProductId(2L);
        franchiseeProductPO.setCreateUserId(2L);
        franchiseeProductPO.setLastUpdateUserId(2L);
*/

        franchiseeProductPO.setIsDelete(0);
        List<FranchiseeProductPO> results = franchiseeProductDao.listFranchiseeProductByParam(franchiseeProductPO);
        for(int i=0; i<results.size(); i++){
            System.out.println(results.get(i).getProductId());
        }
    }

    @Test
    public void saveFranchiseeProduct() throws Exception{
        FranchiseeProductPO franchiseeProductPO = new FranchiseeProductPO();
        franchiseeProductPO.setFranchiseeProductId(1L);
        franchiseeProductPO.setFranchiseeId(1L);
        franchiseeProductPO.setProductId(5L);
        franchiseeProductPO.setCreateUserId(2L);
        franchiseeProductPO.setLastUpdateUserId(2L);
        franchiseeProductPO.setCreateTime(new Date());
        franchiseeProductPO.setLastUpdateTime(new Date());
        franchiseeProductPO.setIsDelete(0);
        System.out.println("插入前id=" + franchiseeProductPO.getFranchiseeProductId());
        Integer id = franchiseeProductDao.saveFranchiseeProduct(franchiseeProductPO);
        System.out.println("插入后id="+franchiseeProductPO.getFranchiseeProductId());
    }

    @Test
    public void updateFranchiseeProduct() throws Exception{
        FranchiseeProductPO franchiseeProductPO = new FranchiseeProductPO();
        franchiseeProductPO.setFranchiseeProductId(1L);
        franchiseeProductPO.setFranchiseeId(1L);
        franchiseeProductPO.setProductId(5L);
        franchiseeProductPO.setCreateUserId(340L);
        franchiseeProductPO.setLastUpdateUserId(2L);
        franchiseeProductPO.setCreateTime(new Date());
        franchiseeProductPO.setLastUpdateTime(new Date());
        franchiseeProductPO.setIsDelete(0);
        Integer id = franchiseeProductDao.updateFranchiseeProduct(franchiseeProductPO);
    }

    @Test
    public void deleteFranchiseeProduct() throws Exception{
        franchiseeProductDao.deleteFranchiseeProduct(1L);
    }

}
