package com.hunter.dt.business.user.role.service.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hunter.dt.base.common.base.BaseEntity;

/**
 * 角色与人员映射表（角色人员表）
 * @author Hunter
 * @date 2021/3/16
 **/
@TableName("T_DT_ROLE_USER")
public class RoleUserPo extends BaseEntity {

    /**
     * 角色 Id
     */
    private String roleId;

    /**
     * 用户 Id
     */
    private String userId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
