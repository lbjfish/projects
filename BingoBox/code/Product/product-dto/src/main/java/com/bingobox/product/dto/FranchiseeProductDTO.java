package com.bingobox.product.dto;

import java.util.Date;

/**
 * Created by zhangfubin on 2017/7/17.
 */
public class FranchiseeProductDTO {
    private Long franchiseeProductId;
    private Long franchiseeId;
    private Long productId;
    private Integer isDelete;
    private Long createUserId;
    private Date createTime;
    private Long lastUpdateUserId;
    private Date lastUpdateTime;

    public Long getFranchiseeProductId() {
        return franchiseeProductId;
    }

    public void setFranchiseeProductId(Long franchiseeProductId) {
        this.franchiseeProductId = franchiseeProductId;
    }

    public Long getFranchiseeId() {
        return franchiseeId;
    }

    public void setFranchiseeId(Long franchiseeId) {
        this.franchiseeId = franchiseeId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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
