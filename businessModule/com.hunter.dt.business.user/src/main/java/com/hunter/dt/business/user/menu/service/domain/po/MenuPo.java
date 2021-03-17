package com.hunter.dt.business.user.menu.service.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hunter.dt.base.common.base.BaseEntity;
import com.hunter.dt.base.common.enumerate.SexEnum;
import com.hunter.dt.business.user.menu.service.enumerate.OpenTypeEnum;

/**
 * 菜单表
 * @author Hunter
 * @date 2021/3/16
 **/
@TableName("T_DT_MENU")
public class MenuPo extends BaseEntity {

    /**
     * 上级菜单唯一标识
     */
    private String pid;

    /**
     * 菜单标题
     */
    private String name;

    /**
     * 菜单副标题
     */
    private String subName;

    /**
     * 菜单路径
     */
    private String path;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 菜单名称
     */
    private OpenTypeEnum openTypeEnum;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public OpenTypeEnum getOpenTypeEnum() {
        return openTypeEnum;
    }

    public void setOpenTypeEnum(OpenTypeEnum openTypeEnum) {
        this.openTypeEnum = openTypeEnum;
    }
}
