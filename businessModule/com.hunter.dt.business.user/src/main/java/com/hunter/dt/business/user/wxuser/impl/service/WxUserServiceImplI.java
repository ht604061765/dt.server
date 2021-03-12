package com.hunter.dt.business.user.wxuser.impl.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hunter.dt.base.common.feign.IWxServerFeign;
import com.hunter.dt.base.common.vo.wechat.WeChatUserVo;
import com.hunter.dt.business.user.wxuser.service.IWxUserService;
import com.hunter.dt.business.user.wxuser.service.dao.IWxUserMapper;
import com.hunter.dt.business.user.wxuser.service.domain.po.WxUserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WxUserServiceImplI extends ServiceImpl<IWxUserMapper, WxUserPo> implements IWxUserService {

    @Value("${wechat.app.id}")
    private String WxAppId;

    @Value("${wechat.app.secret}")
    private String WxAppSecret;

    @Autowired
    private IWxServerFeign wxServerFeign;

    private static final String GRANT_TYPE = "authorization_code";

    @Override
    public String code2Session(String jsCode) {
        String weChatUserStr = wxServerFeign.jscode2session(WxAppId, WxAppSecret, jsCode, GRANT_TYPE);
        System.out.println(weChatUserStr);
        JSONObject weChatUserVo = JSONObject.parseObject(weChatUserStr);
        return weChatUserStr;
    }
}
