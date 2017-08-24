package com.bingobox.basedata.req;

import com.bingobox.framework.common.CommonVO;

/**
 * Created by zhangfubin on 2017/8/1.
 */
public class ReqBoxFranchisee extends CommonVO {
    private String boxCode;
    private Integer provinceId;
    private Integer cityId;
    private Integer districtId;
    private Integer isValid;
    private String franchiseeCode;
    private Integer isBinding;

    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public String getFranchiseeCode() {
        return franchiseeCode;
    }

    public void setFranchiseeCode(String franchiseeCode) {
        this.franchiseeCode = franchiseeCode;
    }

    public Integer getIsBinding() {
        return isBinding;
    }

    public void setIsBinding(Integer isBinding) {
        this.isBinding = isBinding;
    }
}
