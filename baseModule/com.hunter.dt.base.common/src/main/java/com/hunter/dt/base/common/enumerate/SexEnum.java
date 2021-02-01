package com.hunter.dt.base.common.enumerate;

/**
 * 性别枚举.
 * @author Hunter
 * @date 2020/08/19
 */
public enum SexEnum {

    MAN("男"),

    WOMAN("女");

    private String name;

    SexEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
