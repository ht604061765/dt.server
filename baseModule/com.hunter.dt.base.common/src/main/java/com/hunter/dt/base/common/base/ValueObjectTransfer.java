package com.hunter.dt.base.common.base;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * 实体对象转换类
 * @author Hunter
 * @date 2021/1/4
 */
public class ValueObjectTransfer<PO extends BaseEntity, VO extends BaseVo> {

    /**
     * poList -> voList
     * @param poList 需要转换的PO列表
     * @param voClass 需要转换后的VO类
     */
    public List<VO> toVoList(List<PO> poList, Class<VO> voClass){
        if(!CollectionUtils.isEmpty(poList)){
            List<VO> voList = new ArrayList<>();
            for (PO po : poList) {
                VO vo = this.toVo(po, voClass);
                voList.add(vo);
            }
            return voList;
        }
        return Collections.emptyList();
    }

    /**
     * voList -> poList
     * @param voList 需要转换的VO列表
     * @param poClass 需要转换后的PO类
     */
    public List<PO> toPoList(List<VO> voList, Class<PO> poClass){
        if(!CollectionUtils.isEmpty(voList)){
            List<PO> poList = new ArrayList<>();
            for (VO vo : voList) {
                PO po = this.toPo(vo, poClass);
                poList.add(po);
            }
            return poList;
        }
        return Collections.emptyList();
    }

    /**
     * po -> vo
     * @param po 需要转换的PO
     * @param voClass 需要转换后的VO类
     */
    public VO toVo(PO po, Class<VO> voClass) {
        if (!Objects.isNull(po)){
            try {
                VO vo = voClass.newInstance();
                BeanUtils.copyProperties(po, vo);
                return vo;
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * vo -> po
     * @param vo 需要转换的VO
     * @param poClass 需要转换后的PO类
     */
    public PO toPo(VO vo, Class<PO> poClass) {
        if (!Objects.isNull(vo)){
            try {
                PO po = poClass.newInstance();
                BeanUtils.copyProperties(vo, po);
                return po;
            } catch (InstantiationException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}
