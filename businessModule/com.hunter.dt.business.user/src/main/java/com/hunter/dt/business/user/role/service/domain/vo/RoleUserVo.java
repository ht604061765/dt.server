package com.hunter.dt.business.user.role.service.domain.vo;

import com.hunter.dt.base.common.base.BaseVo;

/**
 * 角色与人员映射 Vo（角色人员映射 Vo）
 * @author Hunter
 * @date 2021/3/16
 **/
public class RoleUserVo extends BaseVo {

    /**
     * 角色 Id
     */
    private String roleId;

    /**
     * 菜单 Id
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
