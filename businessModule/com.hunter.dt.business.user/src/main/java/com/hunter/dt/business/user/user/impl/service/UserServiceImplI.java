package com.hunter.dt.business.user.user.impl.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hunter.dt.business.user.user.service.IUserService;
import com.hunter.dt.business.user.user.service.dao.IUserMapper;
import com.hunter.dt.business.user.user.service.domain.po.UserPo;
import com.hunter.dt.business.user.user.service.domain.vo.UserVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplI extends ServiceImpl<IUserMapper, UserPo> implements IUserService {

    /**
     * 获取用户详情
     *
     * @param userId 用户ID
     * @return UserVo
     */
    @Override
    public UserVo findUserById(String userId) {
        UserPo userPo = getBaseMapper().selectById(userId);
        return getTransfer().toVo(userPo, UserVo.class);
    }

    /**
     * 新增用户
     *
     * @param userVo 用户对象实体
     * @return UserVo
     */
    @Override
    public UserVo addUser(UserVo userVo) {
        UserPo userPo = getTransfer().toPo(userVo, UserPo.class);
        getBaseMapper().insert(userPo);
        return getTransfer().toVo(userPo, UserVo.class);
    }

    /**
     * 获取用户列表
     *
     * @return List<UserVo>
     */
    @Override
    public List<UserVo> findUserList() {
        List<UserPo> userPos = getBaseMapper().selectList(new QueryWrapper<>());
        return getTransfer().toVoList(userPos, UserVo.class);
    }
}
