package com.hunter.dt.business.user.role.service.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hunter.dt.base.common.base.BaseEntity;

/**
 * 角色表
 * @author Hunter
 * @date 2021/3/16
 **/
@TableName("T_DT_ROLE")
public class RolePo extends BaseEntity {

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色描述
     */
    private String describe;

    /**
     * 是否是默认角色
     */
    private boolean initRole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public boolean isInitRole() {
        return initRole;
    }

    public void setInitRole(boolean initRole) {
        this.initRole = initRole;
    }
}
