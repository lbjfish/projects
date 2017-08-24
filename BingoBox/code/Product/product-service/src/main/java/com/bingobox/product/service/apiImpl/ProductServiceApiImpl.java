package com.bingobox.product.service.apiImpl;

import com.bingobox.framework.redis.RedisClient;
import com.bingobox.framework.util.BingoBoxBeanUtils;
import com.bingobox.framework.util.JsonUtils;
import com.bingobox.order.dto.OrderInfoDTO;
import com.bingobox.order.dto.OrderInstanceDetailDTO;
import com.bingobox.product.dao.BoxScenarioPriceMappingDao;
import com.bingobox.product.dao.ProductDao;
import com.bingobox.product.dao.ScenarioPriceDetailDao;
import com.bingobox.product.dto.ProductPriceSnapshotDTO;
import com.bingobox.product.framework.constant.RedisConstant;
import com.bingobox.product.po.BoxScenarioPriceMappingPO;
import com.bingobox.product.po.ProductInstancePO;
import com.bingobox.product.po.ProductPO;
import com.bingobox.product.po.ScenarioPriceDetailPO;
import com.bingobox.product.service.ProductInstanceService;
import com.bingobox.product.service.api.ProductServiceApi;
import com.bingobox.snapshot.dto.ProductSnapshotDTO;
import com.bingobox.snapshot.service.api.ProductSnapshotServiceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zhangfubin on 2017/7/7.
 */
@Service("productServiceApi")
public class ProductServiceApiImpl implements ProductServiceApi {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductInstanceService productInstanceService;

    @Autowired
    private ScenarioPriceDetailDao scenarioPriceDetailDao;

    @Autowired
    private ProductSnapshotServiceApi productSnapshotServiceApi;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private BoxScenarioPriceMappingDao boxScenarioPriceMappingDao;

    /**
     * 向订单系统提供商品信息
     * @param orderInfoDTO
     * @return
     */
    @Override
    public List<ProductPriceSnapshotDTO> listProductByBoxIdAndRfId(OrderInfoDTO orderInfoDTO) throws Exception{

        // 无效传参
        if(orderInfoDTO == null
                || orderInfoDTO.getBoxId() == null
                || orderInfoDTO.getBoxId() == -1L
                || orderInfoDTO.getListOrderInstanceDetail() == null
                || orderInfoDTO.getListOrderInstanceDetail().size() <= 0){

            logger.warn("ProductServiceApiImpl.listProductByBoxIdAndRfId({}) 无效传参", orderInfoDTO);
            return new ArrayList<ProductPriceSnapshotDTO>();

        }

        //获取场景策略id
        Long boxId = orderInfoDTO.getBoxId();
        BoxScenarioPriceMappingPO boxScenarioPriceMappingPO = new BoxScenarioPriceMappingPO();
        boxScenarioPriceMappingPO.setBoxId(orderInfoDTO.getBoxId());
        List<BoxScenarioPriceMappingPO> boxScenarioPriceMappingPOs = boxScenarioPriceMappingDao.listBoxScenarioPriceMapping(boxScenarioPriceMappingPO);
        Long scenarioPriceId;
        if(boxScenarioPriceMappingPOs != null && boxScenarioPriceMappingPOs.size() > 0) {
            scenarioPriceId = boxScenarioPriceMappingPOs.get(0).getScenarioPriceId();
        }else {
            scenarioPriceId = 0L;
            logger.warn("ProductServiceApiImpl.listProductByBoxIdAndRfId() 查询盒子id={}无结果", orderInfoDTO.getBoxId());
        }

        List<String> rfIdList = new ArrayList<String>();
        List<OrderInstanceDetailDTO> orderInfoDTOs = orderInfoDTO.getListOrderInstanceDetail();
        for(int i=0; i<orderInfoDTOs.size(); i++){
            rfIdList.add(orderInfoDTOs.get(i).getRfId());
        }

        //获取商品id的list
        List<ProductInstancePO> productInstancePOs = productInstanceService.listProductInstanceByRfId(rfIdList);

        //商品idList
        List<Long> productIds = new ArrayList<>();
        if(productInstancePOs != null && productInstancePOs.size() > 0){
            for(int i=0; i<productInstancePOs.size(); i++){
                productIds.add(productInstancePOs.get(i).getProductId());
            }
        }else {
            productIds.add(0L);
            logger.warn("ProductServiceApiImpl.listProductByBoxIdAndRfId() 查询商品实例id=({})无结果", rfIdList.toString());
        }

        //获取商品价格
        List<ScenarioPriceDetailPO> scenarioPriceDetailPOs = new ArrayList<>();
        if(productIds != null) {
            ScenarioPriceDetailPO scenarioPriceDetailPO ;
            for(Long id:productIds) {
                //先查缓存
                String key = RedisConstant.SCENARIO_PRICE + "bId_" + boxId + "pId_" + id;
                RedisClient redisClient = new RedisClient();
                scenarioPriceDetailPO = JsonUtils.parseObject(redisClient.get(key), ScenarioPriceDetailPO.class);
                if(scenarioPriceDetailPO == null) {
                    scenarioPriceDetailPO = scenarioPriceDetailDao.getScenarioPriceDetailByScenarioPriceIdAndProductId(scenarioPriceId, id);
                    //存入缓存
                    String result = redisClient.set(key, scenarioPriceDetailPO, -1);
                    if(!result.equals("OK")){
                        logger.warn("ProductServiceApiImpl.listProductByBoxIdAndRfId(), pushRedis result is false, key = {}, scenarioPriceDetailPO = {}", key, scenarioPriceDetailPO.toString());
                    }
                }
                scenarioPriceDetailPOs.add(scenarioPriceDetailPO);
            }
        }

        // 将价格转为map, key=productId, value = scenarioPriceDetailPO
        Map<Long, ScenarioPriceDetailPO> scenarioPriceDetailPOMap = new HashMap<>();
        if(scenarioPriceDetailPOs != null) {
            scenarioPriceDetailPOMap = scenarioPriceDetailPOs.stream().collect(Collectors.toMap(ScenarioPriceDetailPO::getProductId, scenarioPriceDetailPO -> scenarioPriceDetailPO));
        }else {
            logger.warn("ProductServiceApiImpl类,listProductByBoxIdAndRfId(),未查询到场景价格信息!");
            return null;
        }

        List<ProductPO> productPOs = productDao.listProductByIdList(productIds);
        //将商品转为map, key=productId value = ProductPO
        Map<Long, ProductPO> productMap = new HashMap<>();
        if(productPOs != null) {
            productMap = productPOs.stream().collect(Collectors.toMap(ProductPO::getProductId, productPO -> productPO));
        }else {
            logger.warn("ProductServiceApiImpl类,listProductByBoxIdAndRfId(),未查询到商品信息!");
            return null;
        }
        //拼装返回订单的对象
        List<ProductPriceSnapshotDTO> productPriceSnapshotDTOs = new ArrayList<>();
        if(productInstancePOs != null) {
            for(int i=0; i<productInstancePOs.size(); i++){
                Long productId = productInstancePOs.get(i).getProductId();
                ProductPriceSnapshotDTO productPriceSnapshotDTO = BingoBoxBeanUtils.generatorObject(productMap.get(productId), ProductPriceSnapshotDTO.class);
                productPriceSnapshotDTO.setProductScenarioPrice(scenarioPriceDetailPOMap.get(productId).getProductScenarioPrice());
                productPriceSnapshotDTO.setRfId(productInstancePOs.get(i).getRfId());
                ProductSnapshotDTO productSnapshotDTO = productSnapshotServiceApi.getProductSnapshotLastTime(productId);
                if(productSnapshotDTO!=null) {
                    productPriceSnapshotDTO.setProductSnapshotId(productSnapshotDTO.getProductSnapshotId());
                }else {
                    logger.warn("ProductServiceApiImpl.listProductByBoxIdAndRfId() 未找到商品productId={}的快照", productId);
                }
                productPriceSnapshotDTOs.add(productPriceSnapshotDTO);
            }
        }


        return productPriceSnapshotDTOs;
    }
}
