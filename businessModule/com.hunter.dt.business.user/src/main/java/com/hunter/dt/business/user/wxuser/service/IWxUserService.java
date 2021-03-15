package com.hunter.dt.business.user.wxuser.service;

import com.hunter.dt.base.common.base.IBaseService;
import com.hunter.dt.base.common.vo.wechat.WeChatUserVo;
import com.hunter.dt.business.user.wxuser.service.domain.po.WxUserPo;
import com.hunter.dt.business.user.wxuser.service.domain.vo.WxUserVo;

public interface IWxUserService extends IBaseService<WxUserPo, WxUserVo> {

    /**
     * 前端 jsCode 转化为会话 token
     * @return 会话 token
     */
    String code2Session(String jsCode);

    /**
     * 前端获取登录用户信息
     * @param token
     * @return
     */
    WeChatUserVo getLoginUser(String token);

}
