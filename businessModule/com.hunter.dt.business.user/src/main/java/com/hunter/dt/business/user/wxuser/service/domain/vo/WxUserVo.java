package com.hunter.dt.business.user.wxuser.service.domain.vo;

import com.hunter.dt.base.common.base.BaseVo;
import com.hunter.dt.base.common.enumerate.SexEnum;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
public class WxUserVo extends BaseVo {

    /**
     * 用户Id，映射系统用户Id
     */
    private String userId;

    /**
     * 微信用户全局唯一Id
     */
    private String unionId;

    /**
     * 微信用户Id
     */
    private String openId;

    /**
     * 昵称
     */
    private String nickName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
