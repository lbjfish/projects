package com.bingobox.basedata.req;

import com.bingobox.framework.common.CommonVO;
import com.bingobox.framework.common.GroupAdd;
import com.bingobox.framework.common.GroupUpdate;

import javax.validation.constraints.NotNull;

/**
 * Created by zhangfubin on 2017/8/1.
 */
public class ReqBox extends CommonVO{

    @NotNull(message = "id不能为空!", groups = {GroupUpdate.class})
    private Long boxId;
    private String boxCode;
    private String boxName;
    private String deviceName;
    @NotNull(message = "省份不能为空!", groups = {GroupUpdate.class, GroupAdd.class})
    private Integer provinceId;
    @NotNull(message = "城市不能为空!", groups = {GroupUpdate.class, GroupAdd.class})
    private Integer cityId;
    @NotNull(message = "区域不能为空!", groups = {GroupUpdate.class, GroupAdd.class})
    private Integer districtId;
    private String address;
    private Integer coordinateSystem;
    private String longitude;
    private String latitude;
    @NotNull(message = "盒子状态不能为空!", groups = {GroupUpdate.class, GroupAdd.class})
    private Integer isValid;

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
}
