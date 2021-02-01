package com.hunter.dt.base.common.base;

/**
 * Service 基类
 * @author Hunter
 * @date 2021/1/4
 */
public interface BaseService<PO extends BaseEntity, VO extends BaseDTO> {

    default ValueObjectTransfer<PO, VO> getTransfer(){
        return new ValueObjectTransfer<>();
    }

}
