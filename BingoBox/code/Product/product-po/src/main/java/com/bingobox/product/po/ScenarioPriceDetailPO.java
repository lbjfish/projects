package com.bingobox.product.po;

import java.util.Date;

/**
 * Created by zhangfubin on 2017/7/6.
 */
public class ScenarioPriceDetailPO {
    private Long scenarioPriceDetailId;
    private Long scenarioPriceId;
    private Long productId;
    private Double productScenarioPrice;
    private Long createUserId;
    private Date createTime;
    private Long lastUpdateUserId;
    private Date lastUpdateTime;
    private Integer isDelete;

    public Long getScenarioPriceDetailId() {
        return scenarioPriceDetailId;
    }

    public void setScenarioPriceDetailId(Long scenarioPriceDetailId) {
        this.scenarioPriceDetailId = scenarioPriceDetailId;
    }

    public Long getScenarioPriceId() {
        return scenarioPriceId;
    }

    public void setScenarioPriceId(Long scenarioPriceId) {
        this.scenarioPriceId = scenarioPriceId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Double getProductScenarioPrice() {
        return productScenarioPrice;
    }

    public void setProductScenarioPrice(Double productScenarioPrice) {
        this.productScenarioPrice = productScenarioPrice;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(Long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
