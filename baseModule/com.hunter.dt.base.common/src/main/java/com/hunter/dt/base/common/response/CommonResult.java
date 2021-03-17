package com.hunter.dt.base.common.response;

import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.Objects;

/**
 * 通用返回结果
 * @author Hunter
 * @date 2021/3/12
 **/
public class CommonResult implements Serializable {

    /**
     * 结果代码
     */
    private int code = ResultCode.SUCCESS.code;

    /**
     * 数据对象
     */
    private Object data;

    /**
     * 消息文本
     */
    private String msg;

    public static CommonResult SUCCESS(Object data){
        CommonResult result = new CommonResult();
        if(!Objects.isNull(data)){
            result.setData(data);
        }
        result.setMsg(ResultCode.SUCCESS.message);
        return result;
    }

    public static CommonResult FAIL(String message){
        CommonResult result = new CommonResult();
        result.setCode(ResultCode.FAIL.code);
        StringBuilder msg = new StringBuilder(ResultCode.FAIL.message);
        if(!StringUtils.isEmpty(message)){
            msg.append(",错误信息：").append(message);
        }
        result.setMsg(msg.toString());
        return result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
