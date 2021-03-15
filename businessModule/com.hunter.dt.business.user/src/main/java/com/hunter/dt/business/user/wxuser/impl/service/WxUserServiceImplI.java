package com.hunter.dt.business.user.wxuser.impl.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hunter.dt.base.common.feign.IWxServerFeign;
import com.hunter.dt.base.common.utils.RandomUtils;
import com.hunter.dt.base.common.utils.RedisUtils;
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

    @Autowired
    private RedisUtils redisUtils;

    /**
     * 授权类型，微信服务端固定参数
     */
    private static final String GRANT_TYPE = "authorization_code";

    @Override
    public String code2Session(String jsCode) {
        WeChatUserVo weChatUserVo = wxServerFeign.jscode2session(WxAppId, WxAppSecret, jsCode, GRANT_TYPE);
        // 生成本服务唯一令牌
        String token = RandomUtils.getUUID();
        redisUtils.set(token, weChatUserVo, 5 * 60 * 1000);
        return token;
    }

    /**
     * 前端获取登录用户信息
     *
     * @param token 令牌
     * @return WeChatUserVo
     */
    @Override
    public WeChatUserVo getLoginUser(String token) {
        WeChatUserVo weChatUserVo = (WeChatUserVo) redisUtils.get(token);
        return weChatUserVo;
    }
}
