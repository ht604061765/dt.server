package com.hunter.dt.business.user.menu.impl.controller;

import com.hunter.dt.base.common.base.BaseController;
import com.hunter.dt.business.user.menu.service.IMenuService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "菜单管理")
@RestController
@RequestMapping("/menu")
public class MenuController extends BaseController<IMenuService> {


}
