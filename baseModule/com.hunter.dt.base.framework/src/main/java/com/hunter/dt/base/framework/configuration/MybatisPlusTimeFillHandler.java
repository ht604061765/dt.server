package com.hunter.dt.base.framework.configuration;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * MybatisPlus基础属性填充
 * @author caihaopeng
 * @date 15:46 2020/12/22
 **/
@Component
public class MybatisPlusTimeFillHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        // 填充创建时间和更新时间
        long currentTimestamp = System.currentTimeMillis();
        this.setFieldValByName("createTime", currentTimestamp, metaObject);
        this.setFieldValByName("updateTime", currentTimestamp, metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 填充更新时间
        this.setFieldValByName("updateTime", System.currentTimeMillis(), metaObject);
    }

}
