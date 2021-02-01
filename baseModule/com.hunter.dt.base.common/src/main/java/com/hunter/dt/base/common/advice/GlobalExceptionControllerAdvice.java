package com.hunter.dt.base.common.advice;

import com.hunter.dt.base.common.response.CommonResult;
import com.hunter.dt.base.common.response.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Hunter
 * @date 13:45 2020/11/11
 **/
@ControllerAdvice
@ResponseBody
public class GlobalExceptionControllerAdvice {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionControllerAdvice.class);

    @SuppressWarnings("rawtypes")
    @ExceptionHandler
    public CommonResult runtimeFailHandle(RuntimeException e){
        logger.error(e.getMessage(), e);
        return CommonResult.FAIL(ResultCode.FAIL, e.getMessage());
    }

    @SuppressWarnings("rawtypes")
    @ExceptionHandler
    public CommonResult unknownHandle(Exception e) {
        logger.error(e.getMessage(), e);
        return CommonResult.FAIL(ResultCode.FAIL, e.getMessage());
    }
}
