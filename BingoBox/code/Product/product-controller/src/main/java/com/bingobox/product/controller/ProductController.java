package com.bingobox.product.controller;

import com.bingobox.product.po.ProductPO;
import com.bingobox.product.service.ProductService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangfubin on 2017/7/5.
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());



    @RequestMapping("index")
    @ResponseBody
    public ProductPO getProducbasedata() throws Exception {
        logger.info("ProductController类getProduct()方法");
        Long id = 2L;
        ProductPO productPO = productService.getProduct(id);
        return productPO;
    }

}

