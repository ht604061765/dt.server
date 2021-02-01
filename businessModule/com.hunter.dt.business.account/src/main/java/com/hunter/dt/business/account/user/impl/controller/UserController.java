package com.hunter.dt.business.account.user.impl.controller;

import com.hunter.dt.base.common.base.BaseController;
import com.hunter.dt.base.common.response.CommonResult;
import com.hunter.dt.business.account.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<IUserService> {

    @ApiOperation(value="获取用户列表")
    @GetMapping("/findUserList")
    public CommonResult findUserList(){
        return CommonResult.SUCCESS(getService().findUserList());
    }

}
