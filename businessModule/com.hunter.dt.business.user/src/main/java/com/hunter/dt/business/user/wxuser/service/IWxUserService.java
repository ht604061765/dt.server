package com.hunter.dt.business.user.wxuser.service;

import com.hunter.dt.base.common.base.IBaseService;
import com.hunter.dt.business.user.wxuser.service.domain.po.WxUserPo;
import com.hunter.dt.business.user.wxuser.service.domain.vo.WxUserVo;

public interface IWxUserService extends IBaseService<WxUserPo, WxUserVo> {

    String code2Session(String jsCode);

}
