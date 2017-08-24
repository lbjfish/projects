package com.bingobox.basedata.po;

import java.util.Date;

/**
 * Created by zhangfubin on 2017/7/25.
 */
public class BoxFranchiseePO {
    private Long boxId;
    private String boxCode;
    private String boxName;
    private String deviceName;
    private Integer provinceId;
    private Integer cityId;
    private Integer districtId;
    private String address;
    private Integer coordinateSystem;
    private String longitude;
    private String latitude;
    private Integer isValid;
    private Date createTime;
    private String franchiseeCode;
    private String franchiseeName;
    private Integer isBinding;
    private Long franchiseeBoxMappingId;

    public Long getBoxId() {
        return boxId;
    }

    public void setBoxId(Long boxId) {
        this.boxId = boxId;
    }

    public String getBoxCode() {
        return boxCode;
    }

    public void setBoxCode(String boxCode) {
        this.boxCode = boxCode;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCoordinateSystem() {
        return coordinateSystem;
    }

    public void setCoordinateSystem(Integer coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFranchiseeCode() {
        return franchiseeCode;
    }

    public void setFranchiseeCode(String franchiseeCode) {
        this.franchiseeCode = franchiseeCode;
    }

    public String getFranchiseeName() {
        return franchiseeName;
    }

    public void setFranchiseeName(String franchiseeName) {
        this.franchiseeName = franchiseeName;
    }

    public Integer getIsBinding() {
        return isBinding;
    }

    public void setIsBinding(Integer isBinding) {
        this.isBinding = isBinding;
    }

    public Long getFranchiseeBoxMappingId() {
        return franchiseeBoxMappingId;
    }

    public void setFranchiseeBoxMappingId(Long franchiseeBoxMappingId) {
        this.franchiseeBoxMappingId = franchiseeBoxMappingId;
    }

    @Override
    public String toString() {
        return "BoxFranchiseePO{" +
                "boxId=" + boxId +
                ", boxCode='" + boxCode + '\'' +
                ", boxName='" + boxName + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", districtId=" + districtId +
                ", address='" + address + '\'' +
                ", coordinateSystem=" + coordinateSystem +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", isValid=" + isValid +
                ", createTime=" + createTime +
                ", franchiseeCode='" + franchiseeCode + '\'' +
                ", franchiseeName='" + franchiseeName + '\'' +
                ", isBinding=" + isBinding +
                ", franchiseeBoxMappingId=" + franchiseeBoxMappingId +
                '}';
    }
}