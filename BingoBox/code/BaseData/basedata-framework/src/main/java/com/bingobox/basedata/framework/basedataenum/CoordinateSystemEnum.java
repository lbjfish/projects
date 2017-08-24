package com.bingobox.basedata.framework.basedataenum;

/**
 * Created by zhangfubin on 2017/8/2.
 */
public enum CoordinateSystemEnum {
    /**
     * 坐标体系：0=高德，1=百度，2=谷歌
     */
    GAODE(0,"高德"), BAIDU(1, "百度"), GOOGLE(2, "谷歌");

    private Integer key;
    private String value;

    CoordinateSystemEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

