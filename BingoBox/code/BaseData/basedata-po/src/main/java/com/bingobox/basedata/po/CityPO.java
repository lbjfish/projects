package com.bingobox.basedata.po;

import java.util.Date;
import java.util.Set;

/**
 * Created by liqingwei on 2017/7/24.
 */
public class CityPO {
    private Long cityId;
    private String cityName;
    private String pinyin;
    private Integer isActive;
    private Float longitude;
    private Float latitude;
    private Integer enumCitySettingFlag;
    private String shortPinyin;
    private String associationWords;
    private String firstLetter;
    private Integer enumRegionInfoLevel;
    private Long parentRegionInfoId;
    private Integer enumMapType;
    private String internalName;
    private Date lastUpdateTime;
    private Date createTime;
    private Set<Long> cityIds;
    private Integer isOversea;

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPinyin() {
		return pinyin;
	}

	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Integer getEnumCitySettingFlag() {
		return enumCitySettingFlag;
	}

	public void setEnumCitySettingFlag(Integer enumCitySettingFlag) {
		this.enumCitySettingFlag = enumCitySettingFlag;
	}

	public String getShortPinyin() {
		return shortPinyin;
	}

	public void setShortPinyin(String shortPinyin) {
		this.shortPinyin = shortPinyin;
	}

	public String getAssociationWords() {
		return associationWords;
	}

	public void setAssociationWords(String associationWords) {
		this.associationWords = associationWords;
	}

	public String getFirstLetter() {
		return firstLetter;
	}

	public void setFirstLetter(String firstLetter) {
		this.firstLetter = firstLetter;
	}

	public Integer getEnumRegionInfoLevel() {
		return enumRegionInfoLevel;
	}

	public void setEnumRegionInfoLevel(Integer enumRegionInfoLevel) {
		this.enumRegionInfoLevel = enumRegionInfoLevel;
	}

	public Long getParentRegionInfoId() {
		return parentRegionInfoId;
	}

	public void setParentRegionInfoId(Long parentRegionInfoId) {
		this.parentRegionInfoId = parentRegionInfoId;
	}

	public Integer getEnumMapType() {
		return enumMapType;
	}

	public void setEnumMapType(Integer enumMapType) {
		this.enumMapType = enumMapType;
	}

	public String getInternalName() {
		return internalName;
	}

	public void setInternalName(String internalName) {
		this.internalName = internalName;
	}

	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Set<Long> getCityIds() {
		return cityIds;
	}

	public void setCityIds(Set<Long> cityIds) {
		this.cityIds = cityIds;
	}

	public Integer getIsOversea() {
		return isOversea;
	}

	public void setIsOversea(Integer isOversea) {
		this.isOversea = isOversea;
	}

	@Override
	public String toString() {
		return "CityPO{" +
				"cityId=" + cityId +
				", cityName='" + cityName + '\'' +
				", pinyin='" + pinyin + '\'' +
				", isActive=" + isActive +
				", longitude=" + longitude +
				", latitude=" + latitude +
				", enumCitySettingFlag=" + enumCitySettingFlag +
				", shortPinyin='" + shortPinyin + '\'' +
				", associationWords='" + associationWords + '\'' +
				", firstLetter='" + firstLetter + '\'' +
				", enumRegionInfoLevel=" + enumRegionInfoLevel +
				", parentRegionInfoId=" + parentRegionInfoId +
				", enumMapType=" + enumMapType +
				", internalName='" + internalName + '\'' +
				", lastUpdateTime=" + lastUpdateTime +
				", createTime=" + createTime +
				", cityIds=" + cityIds +
				", isOversea=" + isOversea +
				'}';
	}
}
