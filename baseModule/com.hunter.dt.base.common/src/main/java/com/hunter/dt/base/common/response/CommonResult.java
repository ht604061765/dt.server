package com.hunter.dt.base.common.response;

import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.Objects;

/**
 * 通用返回结果
 * @author Administrator
 * @date 2020/9/27
 **/
public class CommonResult implements Serializable {

    private int code = ResultCode.SUCCESS.code;

    private Object data;

    private String msg;

    public static CommonResult SUCCESS(Object data){
        CommonResult result = new CommonResult();
        if(!Objects.isNull(data)){
            result.setData(data);
        }
        result.setMsg(ResultCode.SUCCESS.message);
        return result;
    }

    public static CommonResult FAIL(Object data, String message){
        CommonResult result = new CommonResult();
        if(!Objects.isNull(data)){
            result.setData(data);
        }
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
