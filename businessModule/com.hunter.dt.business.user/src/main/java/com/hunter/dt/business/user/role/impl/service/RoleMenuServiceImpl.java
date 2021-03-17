package com.hunter.dt.business.user.role.impl.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hunter.dt.business.user.role.service.IRoleMenuService;
import com.hunter.dt.business.user.role.service.IRoleService;
import com.hunter.dt.business.user.role.service.dao.IRoleMapper;
import com.hunter.dt.business.user.role.service.dao.IRoleMenuMapper;
import com.hunter.dt.business.user.role.service.domain.po.RoleMenuPo;
import com.hunter.dt.business.user.role.service.domain.po.RolePo;
import org.springframework.stereotype.Service;

@Service
public class RoleMenuServiceImpl extends ServiceImpl<IRoleMenuMapper, RoleMenuPo> implements IRoleMenuService {


}
