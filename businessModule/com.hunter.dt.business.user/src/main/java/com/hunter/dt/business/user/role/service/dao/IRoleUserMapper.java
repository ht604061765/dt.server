package com.hunter.dt.business.user.role.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hunter.dt.business.user.role.service.domain.po.RoleMenuPo;
import com.hunter.dt.business.user.role.service.domain.po.RoleUserPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IRoleUserMapper extends BaseMapper<RoleUserPo> {

}
