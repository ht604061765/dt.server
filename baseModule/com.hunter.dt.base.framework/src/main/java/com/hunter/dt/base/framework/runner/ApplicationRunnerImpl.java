package com.hunter.dt.base.framework.runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Application 启动后事件
 */
@Component
public class ApplicationRunnerImpl implements ApplicationRunner {

    @Value("${spring.application.name}")
    private String serverName;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String appName = "【" + serverName + "】启动完成";
        System.out.println(appName);
    }
}
