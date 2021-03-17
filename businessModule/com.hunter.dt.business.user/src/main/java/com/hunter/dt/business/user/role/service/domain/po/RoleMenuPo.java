package com.hunter.dt.business.user.role.service.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hunter.dt.base.common.base.BaseEntity;

/**
 * 角色与菜单映射表（角色权限表）
 * @author Hunter
 * @date 2021/3/16
 **/
@TableName("T_DT_ROLE_MENU")
public class RoleMenuPo extends BaseEntity {

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
