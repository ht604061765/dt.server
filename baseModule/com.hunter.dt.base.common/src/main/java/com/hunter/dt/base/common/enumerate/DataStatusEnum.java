package com.hunter.dt.base.common.enumerate;

/**
 * 数据状态枚举类
 */
public enum DataStatusEnum {

    NORMAL("正常"),
    STOP("停用"),
    CANCEL("删除");

    // 构造方法
    DataStatusEnum(String name) {
        this.name = name;
    }

    // 成员变量
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
