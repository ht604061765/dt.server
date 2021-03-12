package com.hunter.dt.business.user.wxuser.impl.controller;

import com.hunter.dt.base.common.base.BaseController;
import com.hunter.dt.base.common.response.CommonResult;
import com.hunter.dt.business.user.user.service.IUserService;
import com.hunter.dt.business.user.wxuser.service.IWxUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "微信用户管理")
@RestController
@RequestMapping("/wechat")
public class WxUserController extends BaseController<IWxUserService> {

    @ApiOperation(value="auth.code2Session")
    @GetMapping("/code2Session")
    public CommonResult code2Session(@RequestParam String jsCode){
        return CommonResult.SUCCESS(getService().code2Session(jsCode));
    }

}
