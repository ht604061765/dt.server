package com.hunter.dt.base.common.enumerate;

/**
 * 数据状态.
 * @author Hunter
 * @date 2020/08/19
 */
public enum FunctionEnum {

    DEFAULT("DEFAULT"),

    USER_MANAGER("USER_MANAGER");

    private String name;

    FunctionEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
