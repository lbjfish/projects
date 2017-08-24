package com.bingobox.product.service.impl;

import com.bingobox.order.dto.OrderInfoDTO;
import com.bingobox.order.dto.OrderInstanceDetailDTO;
import com.bingobox.product.dao.ProductDao;
import com.bingobox.product.dao.ScenarioPriceDetailDao;
import com.bingobox.product.po.ProductPO;
import com.bingobox.product.service.ProductService;
import com.bingobox.product.service.api.ProductServiceApi;
import com.bingobox.snapshot.service.api.ProductSnapshotServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangfubin on 2017/7/5.
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ProductSnapshotServiceApi productSnapshotServiceApi;

    @Autowired
    private ScenarioPriceDetailDao scenarioPriceDetailDao;

    @Autowired
    private ProductServiceApi productServiceApi;


    @Override
    public ProductPO getProduct(Long productId) throws Exception {

        OrderInfoDTO orderInfoDTO = new OrderInfoDTO();
        orderInfoDTO.setBoxId(1L);
        orderInfoDTO.setIsDelete(0);

        List<OrderInstanceDetailDTO> listOrderInstanceDetail = new ArrayList<OrderInstanceDetailDTO>();
        for (int i = 0; i < 8; i++) {
            OrderInstanceDetailDTO orderInstanceDetailDTO = new OrderInstanceDetailDTO();

            orderInstanceDetailDTO.setRfId("test-rf-id-00" + i);
            orderInstanceDetailDTO.setIsDelete(0);

            listOrderInstanceDetail.add(orderInstanceDetailDTO);
        }
        orderInfoDTO.setListOrderInstanceDetail(listOrderInstanceDetail);
        productServiceApi.listProductByBoxIdAndRfId(orderInfoDTO);
        return null;
    }

    /**
     * 新增商品
     * @param productPO
     * @return
     * @throws Exception
     */
    @Override
    public Integer saveProduct(ProductPO productPO) throws Exception {
        return productDao.saveProduct(productPO);
    }


}
