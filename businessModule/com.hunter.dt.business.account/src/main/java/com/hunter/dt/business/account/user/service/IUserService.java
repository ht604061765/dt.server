package com.hunter.dt.business.account.user.service;

import com.hunter.dt.base.common.base.IBaseService;
import com.hunter.dt.business.account.user.service.domain.po.UserPo;
import com.hunter.dt.business.account.user.service.domain.vo.UserVo;

import java.util.List;

public interface IUserService extends IBaseService<UserPo, UserVo> {

    /**
     * 获取用户详情
     * @param userId 用户ID
     * @return UserVo
     */
    UserVo findUserById(String userId);

    /**
     * 新增用户
     * @param userVo 用户对象实体
     * @return UserVo
     */
    UserVo addUser(UserVo userVo);

    /**
     * 获取用户列表
     * @return List<UserVo>
     */
    List<UserVo> findUserList();

}
