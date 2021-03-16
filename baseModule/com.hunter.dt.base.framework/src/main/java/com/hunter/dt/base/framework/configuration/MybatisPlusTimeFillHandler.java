package com.hunter.dt.base.framework.configuration;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.hunter.dt.base.common.enumerate.DataStatusEnum;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * MybatisPlus 基础属性自动配置
 * @author Hunter
 * @date 15:46 2021/3/16
 **/
@Component
public class MybatisPlusTimeFillHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        // 插入数据，设置默认值
        this.setFieldValByName("createTime", System.currentTimeMillis(), metaObject);
        this.setFieldValByName("dataStatusEnum", DataStatusEnum.NORMAL, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 更新数据，同步修改时间
        this.setFieldValByName("updateTime", System.currentTimeMillis(), metaObject);
    }

}
