package com.bingobox.product.service;

import com.bingobox.order.dto.OrderInfoDTO;
import com.bingobox.product.dto.ProductPriceSnapshotDTO;
import com.bingobox.product.service.api.ProductServiceApi;
import com.taobao.hsf.lightapi.ServiceFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zouzhenqian
 * 2017/7/4.09:54
 * projectName:Product
 * com.bingobox.product.service
 */


public class ProductServiceApiTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // 这里设置Pandora地址，参数是sar包所在目录，如这里我的sar包地址是/Users/Jason/Work/AliSoft/PandoraSar/DevSar/taobao-hsf.sar，则只取前面的地址即可
    private static final ServiceFactory factory = ServiceFactory.getInstanceWithPath("/Users/zhangfubin/Software/taobao-tomcat-7.0.59/deploy/");

    @Resource
    private ProductServiceApi productServiceApi;
    @Test
    public void listProductByBoxIdAndRfId() throws Exception{

        //服务调用

        long boxId = 4L;
        List<String> rfIdList = new ArrayList<>();
        rfIdList.add("111");
        rfIdList.add("222");

        OrderInfoDTO orderInfoDTO = new OrderInfoDTO();
        orderInfoDTO.setBoxId(4L);

        List<ProductPriceSnapshotDTO> productPriceSnapshotDTOs = productServiceApi.listProductByBoxIdAndRfId(orderInfoDTO);

        for(int i=0; i< productPriceSnapshotDTOs.size(); i++) {
            System.out.println(productPriceSnapshotDTOs.get(i).getProductScenarioPrice());
        }

    }

}
