package com.hunter.dt.business.user.user.impl.controller;

import com.hunter.dt.base.common.base.BaseController;
import com.hunter.dt.base.common.response.CommonResult;
import com.hunter.dt.business.user.user.service.IUserService;
import com.hunter.dt.business.user.user.service.domain.vo.UserSearchParamVo;
import com.hunter.dt.business.user.user.service.domain.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController extends BaseController<IUserService> {

    @ApiOperation(value="新增用户")
    @PostMapping("/addUser")
    public CommonResult addUser(@RequestBody UserVo userVo){
        return CommonResult.SUCCESS(getService().addUser(userVo));
    }

    @ApiOperation(value="删除用户")
    @GetMapping("/delUserById")
    public CommonResult delUserById(@RequestParam String userId){
        return CommonResult.SUCCESS(getService().delUserById(userId));
    }

    @ApiOperation(value="通过用户 Id 查询用户")
    @GetMapping("/findUserById")
    public CommonResult findUserById(@RequestParam String userId){
        return CommonResult.SUCCESS(getService().findUserById(userId));
    }

    @ApiOperation(value="通过查询条件分页查询用户列表")
    @PostMapping("/findUserPageByParam")
    public CommonResult findUserPageByParam(@RequestBody UserSearchParamVo paramVo){
        return CommonResult.SUCCESS(getService().findUserPageByParam(paramVo));
    }

}
