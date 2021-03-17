package com.hunter.dt.business.user.user.service;

import com.hunter.dt.base.common.base.IBaseService;
import com.hunter.dt.base.common.response.PageResult;
import com.hunter.dt.business.user.user.service.domain.po.UserPo;
import com.hunter.dt.business.user.user.service.domain.vo.UserSearchParamVo;
import com.hunter.dt.business.user.user.service.domain.vo.UserVo;

/**
 * @author Hunter
 * @date 2021/3/16
 **/
public interface IUserService extends IBaseService<UserPo, UserVo> {

    /**
     * 新增用户
     * @param userVo 用户对象实体
     * @return UserVo
     */
    UserVo addUser(UserVo userVo);

    /**
     * 删除指定用户
     * @param userId 人员 ID
     * @return UserVo
     */
    UserVo delUserById(String userId);

    /**
     * 获取用户详情
     * @param userId 用户ID
     * @return UserVo
     */
    UserVo findUserById(String userId);

    /**
     * 分页查询用户列表
     * @param paramVo 查询参数对象
     */
    PageResult<UserVo> findUserPageByParam(UserSearchParamVo paramVo);
    
}
