package com.hunter.dt.base.common.utils;

import java.util.UUID;

/**
 * @author Hunter
 * @date 2020/10/7
 **/
public class RandomUtils {

    /**
     * 生成UUID
     */
    public static String getUUID() {
        UUID id = UUID.randomUUID();
        return id.toString().replace("-", "");
    }

}
