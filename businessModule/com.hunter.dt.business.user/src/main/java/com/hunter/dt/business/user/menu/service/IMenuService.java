package com.hunter.dt.business.user.menu.service;

import com.hunter.dt.base.common.base.IBaseService;
import com.hunter.dt.base.common.response.PageResult;
import com.hunter.dt.business.user.menu.service.domain.po.MenuPo;
import com.hunter.dt.business.user.menu.service.domain.vo.MenuSearchParamVo;
import com.hunter.dt.business.user.menu.service.domain.vo.MenuVo;

public interface IMenuService extends IBaseService<MenuPo, MenuVo> {

    /**
     * 新增菜单
     * @param menuVo 菜单对象实体
     * @return MenuVo
     */
    MenuVo addMenu(MenuVo menuVo);

    /**
     * 删除指定菜单
     * @param menuId 菜单 ID
     * @return MenuVo
     */
    MenuVo delMenuById(String menuId);

    /**
     * 获取菜单详情
     * @param menuId 菜单ID
     * @return MenuVo
     */
    MenuVo findMenuById(String menuId);

    /**
     * 分页查询用户列表
     * @param paramVo 查询参数对象
     */
    PageResult<MenuVo> findMenuPageByParam(MenuSearchParamVo paramVo);

}
