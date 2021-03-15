package com.hunter.dt.base.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Redis工具类，使用之前请确保 RedisTemplate 成功注入
 * @author Hunter
 * @version 2021/01/23
 */
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 业务数据缓存目录
     */
    private static final String REDIS_FOLDER = "dt:";


    //    ======================= 普通对象相关操作 =======================

    /**
     * 存入普通对象
     * @param key 键
     * @param value 值
     * @param timeout 有效期(秒)
     */
    public void set(final String key, final Object value, final long timeout) {
        redisTemplate.opsForValue().set(REDIS_FOLDER + key, value, timeout, TimeUnit.SECONDS);
    }

    /**
     * 获取普通对象
     * @param key 键
     * @return 对象
     */
    public Object get(final String key) {
        return redisTemplate.opsForValue().get(REDIS_FOLDER + key);
    }

    //    ======================= Hash 相关操作 =======================

    /**
     * 往Hash中存入数据
     * @param key Redis键
     * @param hKey Hash键
     * @param value 值
     */
    public void hPut(final String key, final String hKey, final Object value) {
        redisTemplate.opsForHash().put(REDIS_FOLDER + key, hKey, value);
    }

    /**
     * 获取Hash中的数据
     * @param key Redis键
     * @param hKey Hash键
     * @return Hash中的对象
     */
    public Object hGet(final String key, final String hKey) {
        return redisTemplate.opsForHash().get(REDIS_FOLDER + key, hKey);
    }

    /**
     * 往Hash中存入多个数据
     * @param key Redis键
     * @param values Hash键值对
     */
    public void hPutBatch(final String key, final Map<String, Object> values) {
        redisTemplate.opsForHash().putAll(REDIS_FOLDER + key, values);
    }

    /**
     * 获取多个Hash中的数据
     * @param key Redis键
     * @param hKeys Hash键集合
     * @return Hash对象集合
     */
    public List<Object> hGetBatch(final String key, final Collection<Object> hKeys) {
        return redisTemplate.opsForHash().multiGet(REDIS_FOLDER + key, hKeys);
    }

    //    ======================= set 相关操作 =======================

    /**
     * 往Set中存入数据
     * @param key Redis键
     * @param values 值
     * @return 存入的个数
     */
    public long sSet(final String key, final Object... values) {
        Long count = redisTemplate.opsForSet().add(REDIS_FOLDER + key, values);
        return count == null ? 0 : count;
    }

    /**
     * 删除Set中的数据
     * @param key Redis键
     * @param values 值
     * @return 移除的个数
     */
    public long sDel(final String key, final Object... values) {
        Long count = redisTemplate.opsForSet().remove(REDIS_FOLDER + key, values);
        return count == null ? 0 : count;
    }

    //    ======================= List相关操作 =======================

    /**
     * 往List中存入数据
     * @param key Redis键
     * @param value 数据
     * @return 存入的个数
     */
    public long lPush(final String key, final Object value) {
        Long count = redisTemplate.opsForList().rightPush(REDIS_FOLDER + key, value);
        return count == null ? 0 : count;
    }

    /**
     * 往List中存入多个数据
     * @param key Redis键
     * @param values 多个数据
     * @return 存入的个数
     */
    public long lPushBatch(final String key, final Collection<Object> values) {
        Long count = redisTemplate.opsForList().rightPushAll(REDIS_FOLDER + key, values);
        return count == null ? 0 : count;
    }

    /**
     * 往List中存入多个数据
     * @param key Redis键
     * @param values 多个数据
     * @return 存入的个数
     */
    public long lPushBatch(final String key, final Object... values) {
        Long count = redisTemplate.opsForList().rightPushAll(REDIS_FOLDER + key, values);
        return count == null ? 0 : count;
    }

    /**
     * 从List中获取begin到end之间的元素
     * @param key Redis键
     * @param start 开始位置
     * @param end 结束位置（start=0，end=-1表示获取全部元素）
     * @return List对象
     */
    public List<Object> lGet(final String key, final int start, final int end) {
        return redisTemplate.opsForList().range(REDIS_FOLDER + key, start, end);
    }

    //    ======================= 过期时间及删除相关操作 =======================

    /**
     * 设置有效时间
     * @param key Redis键
     * @param timeout 超时时间
     * @return true=设置成功；false=设置失败
     */
    public boolean expire(final String key, final long timeout) {
        return expire(REDIS_FOLDER + key, timeout, TimeUnit.SECONDS);
    }

    /**
     * 设置有效时间
     * @param key Redis键
     * @param timeout 超时时间
     * @param unit 时间单位
     * @return true=设置成功；false=设置失败
     */
    public boolean expire(final String key, final long timeout, final TimeUnit unit) {
        Boolean ret = redisTemplate.expire(REDIS_FOLDER + key, timeout, unit);
        return ret != null && ret;
    }

    /**
     * 删除单个 key
     * @param key 键
     * @return true=删除成功；false=删除失败
     */
    public boolean del(final String key) {
        Boolean ret = redisTemplate.delete(REDIS_FOLDER + key);
        return ret != null && ret;
    }

//    /**
//     * 删除多个 key
//     * @param keys 键集合
//     * @return 成功删除的个数
//     */
//    public long del(final Collection<String> keys) {
//        keys.forEach(key -> {
//            key = REDIS_FOLDER + key;
//        });
//        Long ret = redisTemplate.delete(keys);
//        return ret == null ? 0 : ret;
//    }
}