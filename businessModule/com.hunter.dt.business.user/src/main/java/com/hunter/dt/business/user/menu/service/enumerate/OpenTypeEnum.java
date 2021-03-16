package com.hunter.dt.business.user.menu.service.enumerate;

/**
 * 菜单打开方式枚举类
 */
public enum OpenTypeEnum {

    CURRENT("当前窗口"),
    NEW("新窗口");

    // 构造方法
    OpenTypeEnum(String name) {
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
