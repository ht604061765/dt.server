package com.hunter.dt.business.user.user.impl.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hunter.dt.base.common.enumerate.DataStatusEnum;
import com.hunter.dt.base.common.response.PageResult;
import com.hunter.dt.business.user.user.service.IUserService;
import com.hunter.dt.business.user.user.service.dao.IUserMapper;
import com.hunter.dt.business.user.user.service.domain.po.UserPo;
import com.hunter.dt.business.user.user.service.domain.vo.UserSearchParamVo;
import com.hunter.dt.business.user.user.service.domain.vo.UserVo;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImplI extends ServiceImpl<IUserMapper, UserPo> implements IUserService {

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
     * 删除指定用户
     *
     * @param userId 人员 ID
     * @return UserVo
     */
    @Override
    public UserVo delUserById(String userId) {
        UserPo userPo = getBaseMapper().selectById(userId);
        if(Objects.isNull(userPo)){
            throw new RuntimeException("未找到对应用户");
        }
        userPo.setDataStatusEnum(DataStatusEnum.CANCEL);
        getBaseMapper().updateById(userPo);
        return getTransfer().toVo(userPo, UserVo.class);
    }

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
     * 分页查询用户列表
     *
     * @param paramVo 查询参数对象
     */
    @Override
    public PageResult<UserVo> findUserPageByParam(UserSearchParamVo paramVo) {
        QueryWrapper<UserPo> wrapper = new QueryWrapper<>();
        wrapper.ne("data_status_enum", DataStatusEnum.CANCEL);
        IPage<UserPo> userPoPage = getBaseMapper().selectPage(new Page<>(paramVo.getPageNo(), paramVo.getPageSize()), wrapper);
        if(!CollectionUtils.isEmpty(userPoPage.getRecords())){
            List<UserVo> vos = getTransfer().toVoList(userPoPage.getRecords(), UserVo.class);
            // 填充业务属性
            return PageResult.build(paramVo.getPageNo(), paramVo.getPageSize(), userPoPage.getPages(), userPoPage.getTotal(), vos);
        }
        return PageResult.emptyPage(paramVo.getPageNo(), paramVo.getPageSize());
    }
}
