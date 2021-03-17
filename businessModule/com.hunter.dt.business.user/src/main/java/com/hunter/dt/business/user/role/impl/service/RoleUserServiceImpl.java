package com.hunter.dt.business.user.role.impl.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hunter.dt.business.user.role.service.IRoleMenuService;
import com.hunter.dt.business.user.role.service.IRoleUserService;
import com.hunter.dt.business.user.role.service.dao.IRoleMenuMapper;
import com.hunter.dt.business.user.role.service.dao.IRoleUserMapper;
import com.hunter.dt.business.user.role.service.domain.po.RoleMenuPo;
import com.hunter.dt.business.user.role.service.domain.po.RoleUserPo;
import org.springframework.stereotype.Service;

@Service
public class RoleUserServiceImpl extends ServiceImpl<IRoleUserMapper, RoleUserPo> implements IRoleUserService {


}
