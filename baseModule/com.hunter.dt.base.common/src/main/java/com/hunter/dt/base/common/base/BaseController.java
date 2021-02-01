package com.hunter.dt.base.common.base;

import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 公共 controller 基类
 * @author Hunter
 * @param <Service>
 */
public class BaseController<Service extends IService> {

    @Autowired
    private Service service;

    protected Service getService() {
        return this.service;
    }

    public void setService(Service newService) {
        this.service = newService;
    }

}
