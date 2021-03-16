package com.hunter.dt.business.user.menu.impl.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hunter.dt.business.user.menu.service.IMenuService;
import com.hunter.dt.business.user.menu.service.dao.IMenuMapper;
import com.hunter.dt.business.user.menu.service.domain.po.MenuPo;
import com.hunter.dt.business.user.role.service.IRoleService;
import com.hunter.dt.business.user.role.service.dao.IRoleMapper;
import com.hunter.dt.business.user.role.service.domain.po.RolePo;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends ServiceImpl<IMenuMapper, MenuPo> implements IMenuService {


}
