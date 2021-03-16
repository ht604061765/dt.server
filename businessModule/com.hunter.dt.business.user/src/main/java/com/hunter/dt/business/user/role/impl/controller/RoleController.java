package com.hunter.dt.business.user.role.impl.controller;

import com.hunter.dt.base.common.base.BaseController;
import com.hunter.dt.base.common.response.CommonResult;
import com.hunter.dt.business.user.user.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "角色管理")
@RestController
@RequestMapping("/role")
public class RoleController extends BaseController<IUserService> {


}
