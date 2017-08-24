package com.bingobox.product.po;

import java.util.Date;

/**
 * Created by zhangfubin on 2017/7/19.
 */
public class BoxScenarioPriceMappingPO {
    private Long boxScenarioPriceMappingId;
    private Long boxId;
    private Long scenarioPriceId;
    private Long createUserId;
    private Date createTime;
    private Long lastUpdateUserId;
    private Date lastUpdateTime;
    private Integer isDelete;

    public Long getBoxScenarioPriceMappingId() {
        return boxScenarioPriceMappingId;
    }

    public void setBoxScenarioPriceMappingId(Long boxScenarioPriceMappingId) {
        this.boxScenarioPriceMappingId = boxScenarioPriceMappingId;
    }

    public Long getBoxId() {
        return boxId;
    }

    public void setBoxId(Long boxId) {
        this.boxId = boxId;
    }

    public Long getScenarioPriceId() {
        return scenarioPriceId;
    }

    public void setScenarioPriceId(Long scenarioPriceId) {
        this.scenarioPriceId = scenarioPriceId;
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
