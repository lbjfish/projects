package com.bingobox.basedata.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class CityVO implements Serializable {
    private static final long serialVersionUID = 963246849073217664L;

    private Long cityId;
    private String name;
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
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public Integer getIsOversea() {
        return isOversea;
    }
    public void setIsOversea(Integer isOversea) {
        this.isOversea = isOversea;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((associationWords == null) ? 0 : associationWords.hashCode());
        result = prime * result + ((cityId == null) ? 0 : cityId.hashCode());
        result = prime * result + ((cityIds == null) ? 0 : cityIds.hashCode());
        result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
        result = prime * result + ((enumCitySettingFlag == null) ? 0 : enumCitySettingFlag.hashCode());
        result = prime * result + ((enumMapType == null) ? 0 : enumMapType.hashCode());
        result = prime * result + ((enumRegionInfoLevel == null) ? 0 : enumRegionInfoLevel.hashCode());
        result = prime * result + ((firstLetter == null) ? 0 : firstLetter.hashCode());
        result = prime * result + ((internalName == null) ? 0 : internalName.hashCode());
        result = prime * result + ((isActive == null) ? 0 : isActive.hashCode());
        result = prime * result + ((isOversea == null) ? 0 : isOversea.hashCode());
        result = prime * result + ((lastUpdateTime == null) ? 0 : lastUpdateTime.hashCode());
        result = prime * result + ((latitude == null) ? 0 : latitude.hashCode());
        result = prime * result + ((longitude == null) ? 0 : longitude.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((parentRegionInfoId == null) ? 0 : parentRegionInfoId.hashCode());
        result = prime * result + ((pinyin == null) ? 0 : pinyin.hashCode());
        result = prime * result + ((shortPinyin == null) ? 0 : shortPinyin.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CityVO other = (CityVO) obj;
        if (associationWords == null) {
            if (other.associationWords != null)
                return false;
        } else if (!associationWords.equals(other.associationWords))
            return false;
        if (cityId == null) {
            if (other.cityId != null)
                return false;
        } else if (!cityId.equals(other.cityId))
            return false;
        if (cityIds == null) {
            if (other.cityIds != null)
                return false;
        } else if (!cityIds.equals(other.cityIds))
            return false;
        if (createTime == null) {
            if (other.createTime != null)
                return false;
        } else if (!createTime.equals(other.createTime))
            return false;
        if (enumCitySettingFlag == null) {
            if (other.enumCitySettingFlag != null)
                return false;
        } else if (!enumCitySettingFlag.equals(other.enumCitySettingFlag))
            return false;
        if (enumMapType == null) {
            if (other.enumMapType != null)
                return false;
        } else if (!enumMapType.equals(other.enumMapType))
            return false;
        if (enumRegionInfoLevel == null) {
            if (other.enumRegionInfoLevel != null)
                return false;
        } else if (!enumRegionInfoLevel.equals(other.enumRegionInfoLevel))
            return false;
        if (firstLetter == null) {
            if (other.firstLetter != null)
                return false;
        } else if (!firstLetter.equals(other.firstLetter))
            return false;
        if (internalName == null) {
            if (other.internalName != null)
                return false;
        } else if (!internalName.equals(other.internalName))
            return false;
        if (isActive == null) {
            if (other.isActive != null)
                return false;
        } else if (!isActive.equals(other.isActive))
            return false;
        if (isOversea == null) {
            if (other.isOversea != null)
                return false;
        } else if (!isOversea.equals(other.isOversea))
            return false;
        if (lastUpdateTime == null) {
            if (other.lastUpdateTime != null)
                return false;
        } else if (!lastUpdateTime.equals(other.lastUpdateTime))
            return false;
        if (latitude == null) {
            if (other.latitude != null)
                return false;
        } else if (!latitude.equals(other.latitude))
            return false;
        if (longitude == null) {
            if (other.longitude != null)
                return false;
        } else if (!longitude.equals(other.longitude))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (parentRegionInfoId == null) {
            if (other.parentRegionInfoId != null)
                return false;
        } else if (!parentRegionInfoId.equals(other.parentRegionInfoId))
            return false;
        if (pinyin == null) {
            if (other.pinyin != null)
                return false;
        } else if (!pinyin.equals(other.pinyin))
            return false;
        if (shortPinyin == null) {
            if (other.shortPinyin != null)
                return false;
        } else if (!shortPinyin.equals(other.shortPinyin))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "CityVo [cityId=" + cityId + ", name=" + name + ", pinyin=" + pinyin + ", isActive=" + isActive
                + ", longitude=" + longitude + ", latitude=" + latitude + ", enumCitySettingFlag=" + enumCitySettingFlag
                + ", shortPinyin=" + shortPinyin + ", associationWords=" + associationWords + ", firstLetter="
                + firstLetter + ", enumRegionInfoLevel=" + enumRegionInfoLevel + ", parentRegionInfoId="
                + parentRegionInfoId + ", enumMapType=" + enumMapType + ", internalName=" + internalName
                + ", lastUpdateTime=" + lastUpdateTime + ", createTime=" + createTime + ", cityIds=" + cityIds
                + ", isOversea=" + isOversea + "]";
    }

}