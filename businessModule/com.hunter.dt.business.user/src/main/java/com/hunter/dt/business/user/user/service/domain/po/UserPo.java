package com.hunter.dt.business.user.user.service.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.hunter.dt.base.common.base.BaseEntity;
import com.hunter.dt.base.common.enumerate.SexEnum;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@TableName("T_DT_USER")
public class UserPo extends BaseEntity {

    /**
     * 用户账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 名称
     */
    private String name;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 性别
     */
    private SexEnum sex;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }
}
