package com.bingobox.basedata.framework.basedataenum;

/**
 * Created by zhangfubin on 2017/8/2.
 */
public enum BoxBindingEnum {
    /**
     * 是否绑定,0-未绑定, 1-已绑定
     */
    UNBINDING(0,"未绑定"), BINDINGED(1, "已绑定");

    private Integer key;
    private String value;

    BoxBindingEnum(Integer key, String value) {
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

