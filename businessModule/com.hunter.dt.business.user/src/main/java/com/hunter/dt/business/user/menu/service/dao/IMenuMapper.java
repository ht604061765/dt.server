package com.hunter.dt.business.user.menu.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hunter.dt.business.user.menu.service.domain.po.MenuPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IMenuMapper extends BaseMapper<MenuPo> {

}
