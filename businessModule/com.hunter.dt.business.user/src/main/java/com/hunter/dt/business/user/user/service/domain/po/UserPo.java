package com.hunter.dt.business.user.user.service.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hunter.dt.base.common.base.BaseEntity;
import com.hunter.dt.base.common.enumerate.SexEnum;

/**
 * 人员信息表
 * @author Hunter
 * @date 2021/3/16
 **/
@TableName("T_DT_USER")
public class UserPo extends BaseEntity {

    /**
     * 名称
     */
    private String nickName;

    /**
     * 用户账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private SexEnum sex;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
