package com.hunter.dt.business.user.role.service.domain.vo;

import com.hunter.dt.base.common.base.BaseVo;

/**
 * 角色与菜单映射 Vo（角色权限映射 Vo）
 * @author Hunter
 * @date 2021/3/16
 **/
public class RoleMenuVo extends BaseVo {

    /**
     * 角色 Id
     */
    private String roleId;

    /**
     * 菜单 Id
     */
    private String menuId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
}
