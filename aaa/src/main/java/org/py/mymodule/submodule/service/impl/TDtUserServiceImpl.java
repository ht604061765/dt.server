package org.py.mymodule.submodule.service.impl;

import org.py.mymodule.submodule.entity.TDtUser;
import org.py.mymodule.submodule.mapper.TDtUserMapper;
import org.py.mymodule.submodule.service.ITDtUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2021-03-12
 */
@Service
public class TDtUserServiceImpl extends ServiceImpl<TDtUserMapper, TDtUser> implements ITDtUserService {

}
