package com.hunter.dt.business.user.menu.impl.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hunter.dt.base.common.enumerate.DataStatusEnum;
import com.hunter.dt.base.common.response.PageResult;
import com.hunter.dt.business.user.menu.service.IMenuService;
import com.hunter.dt.business.user.menu.service.dao.IMenuMapper;
import com.hunter.dt.business.user.menu.service.domain.po.MenuPo;
import com.hunter.dt.business.user.menu.service.domain.vo.MenuSearchParamVo;
import com.hunter.dt.business.user.menu.service.domain.vo.MenuVo;
import com.hunter.dt.business.user.role.service.IRoleService;
import com.hunter.dt.business.user.role.service.dao.IRoleMapper;
import com.hunter.dt.business.user.role.service.domain.po.RolePo;
import com.hunter.dt.business.user.user.service.domain.po.UserPo;
import com.hunter.dt.business.user.user.service.domain.vo.UserVo;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

@Service
public class MenuServiceImpl extends ServiceImpl<IMenuMapper, MenuPo> implements IMenuService {

    /**
     * 新增菜单
     *
     * @param menuVo 菜单对象实体
     * @return MenuVo
     */
    @Override
    public MenuVo addMenu(MenuVo menuVo) {
        MenuPo menuPo = getTransfer().toPo(menuVo, MenuPo.class);
        getBaseMapper().insert(menuPo);
        return getTransfer().toVo(menuPo, MenuVo.class);
    }

    /**
     * 删除指定菜单
     *
     * @param menuId 菜单 ID
     * @return MenuVo
     */
    @Override
    public MenuVo delMenuById(String menuId) {
        MenuPo menuPo = getBaseMapper().selectById(menuId);
        if(Objects.isNull(menuPo)){
            throw new RuntimeException("未找到对应菜单");
        }
        menuPo.setDataStatusEnum(DataStatusEnum.CANCEL);
        getBaseMapper().updateById(menuPo);
        return getTransfer().toVo(menuPo, MenuVo.class);
    }

    /**
     * 获取菜单详情
     *
     * @param menuId 菜单ID
     * @return MenuVo
     */
    @Override
    public MenuVo findMenuById(String menuId) {
        MenuPo menuPo = getBaseMapper().selectById(menuId);
        return getTransfer().toVo(menuPo, MenuVo.class);
    }

    /**
     * 分页查询用户列表
     *
     * @param paramVo 查询参数对象
     */
    @Override
    public PageResult<MenuVo> findMenuPageByParam(MenuSearchParamVo paramVo) {
        QueryWrapper<MenuPo> wrapper = new QueryWrapper<>();
        wrapper.ne("data_status_enum", DataStatusEnum.CANCEL);
        IPage<MenuPo> menuPoPage = getBaseMapper().selectPage(new Page<>(paramVo.getPageNo(), paramVo.getPageSize()), wrapper);
        if(!CollectionUtils.isEmpty(menuPoPage.getRecords())){
            List<MenuVo> vos = getTransfer().toVoList(menuPoPage.getRecords(), MenuVo.class);
            // 填充业务属性
            return PageResult.build(paramVo.getPageNo(), paramVo.getPageSize(), menuPoPage.getPages(), menuPoPage.getTotal(), vos);
        }
        return PageResult.emptyPage(paramVo.getPageNo(), paramVo.getPageSize());
    }
}
