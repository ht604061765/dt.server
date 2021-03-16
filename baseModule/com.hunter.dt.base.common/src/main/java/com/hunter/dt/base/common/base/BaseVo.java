package com.hunter.dt.base.common.base;

import com.hunter.dt.base.common.enumerate.DataStatusEnum;

import java.io.Serializable;

/**
 * 公共实体基类
 * @author Hunter
 */
public class BaseVo implements Serializable {

    /**
     * 数据主键
     */
    private String id;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 更新时间
     */
    private Long updateTime;

    /**
     * 数据状态枚举
     */
    private DataStatusEnum dataStatusEnum;

    /**
     * 数据状态名称
     */
    private String dataStatusName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public DataStatusEnum getDataStatusEnum() {
        return dataStatusEnum;
    }

    public void setDataStatusEnum(DataStatusEnum dataStatusEnum) {
        this.dataStatusEnum = dataStatusEnum;
    }

    public String getDataStatusName() {
        return dataStatusName;
    }

    public void setDataStatusName(String dataStatusName) {
        this.dataStatusName = dataStatusName;
    }
}
