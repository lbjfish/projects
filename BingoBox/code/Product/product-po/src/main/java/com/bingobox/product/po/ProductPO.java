package com.bingobox.product.po;

import java.util.Date;

/**
 * Created by zhangfubin on 2017/7/7.
 */
public class ProductPO {
    private Long productId;
    private Long productClassificationId;
    private Long productPackDictId;
    private String productSpecification;
    private Date productExpirationDate;
    private Integer alarmBeforeDay;
    private String productProducingArea;
    private String productName;
    private Double productFloorPrice;
    private String productBarCode;
    private Integer isDelete;
    private Long createUserId;
    private Date createTime;
    private Long lastUpdateUserId;
    private Date lastUpdateTime;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductClassificationId() {
        return productClassificationId;
    }

    public void setProductClassificationId(Long productClassificationId) {
        this.productClassificationId = productClassificationId;
    }

    public Long getProductPackDictId() {
        return productPackDictId;
    }

    public void setProductPackDictId(Long productPackDictId) {
        this.productPackDictId = productPackDictId;
    }

    public String getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(String productSpecification) {
        this.productSpecification = productSpecification;
    }

    public Date getProductExpirationDate() {
        return productExpirationDate;
    }

    public void setProductExpirationDate(Date productExpirationDate) {
        this.productExpirationDate = productExpirationDate;
    }

    public Integer getAlarmBeforeDay() {
        return alarmBeforeDay;
    }

    public void setAlarmBeforeDay(Integer alarmBeforeDay) {
        this.alarmBeforeDay = alarmBeforeDay;
    }

    public String getProductProducingArea() {
        return productProducingArea;
    }

    public void setProductProducingArea(String productProducingArea) {
        this.productProducingArea = productProducingArea;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductFloorPrice() {
        return productFloorPrice;
    }

    public void setProductFloorPrice(Double productFloorPrice) {
        this.productFloorPrice = productFloorPrice;
    }

    public String getProductBarCode() {
        return productBarCode;
    }

    public void setProductBarCode(String productBarCode) {
        this.productBarCode = productBarCode;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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
}
