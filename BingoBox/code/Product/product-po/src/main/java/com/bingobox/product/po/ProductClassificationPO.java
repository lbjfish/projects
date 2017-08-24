package com.bingobox.product.po;

import java.util.Date;

/**
 * Created by zhangfubin on 2017/7/5.
 */
public class ProductClassificationPO {
    private Long productClassificationId;
    private String classificationCode;
    private String classificationName;
    private Long parentClassificationId;
    private Integer isDelete;
    private Long createUserId;
    private Date createTime;
    private Long lastUpdateUserId;
    private Date lastUpdateTime;

    public Long getProductClassificationId() {
        return productClassificationId;
    }

    public void setProductClassificationId(Long productClassificationId) {
        this.productClassificationId = productClassificationId;
    }

    public String getClassificationCode() {
        return classificationCode;
    }

    public void setClassificationCode(String classificationCode) {
        this.classificationCode = classificationCode;
    }

    public String getClassificationName() {
        return classificationName;
    }

    public void setClassificationName(String classificationName) {
        this.classificationName = classificationName;
    }

    public Long getParentClassificationId() {
        return parentClassificationId;
    }

    public void setParentClassificationId(Long parentClassificationId) {
        this.parentClassificationId = parentClassificationId;
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
