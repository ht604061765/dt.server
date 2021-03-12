package com.hunter.dt.base.common.base;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * Service 基类
 * @author Hunter
 * @date 2021/1/4
 */
public interface IBaseService<PO extends BaseEntity, VO extends BaseVo> extends IService<PO> {

    default ValueObjectTransfer<PO, VO> getTransfer(){
        return new ValueObjectTransfer<>();
    }

}
