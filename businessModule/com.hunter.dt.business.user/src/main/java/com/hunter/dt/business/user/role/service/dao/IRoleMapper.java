package com.hunter.dt.business.user.role.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hunter.dt.business.user.role.service.domain.po.RolePo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IRoleMapper extends BaseMapper<RolePo> {

}
