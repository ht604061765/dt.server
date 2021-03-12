package com.hunter.dt.business.user.wxuser.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hunter.dt.business.user.wxuser.service.domain.po.WxUserPo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IWxUserMapper extends BaseMapper<WxUserPo> {

}
