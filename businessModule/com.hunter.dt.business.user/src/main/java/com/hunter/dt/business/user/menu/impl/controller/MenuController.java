package com.hunter.dt.business.user.menu.impl.controller;

import com.hunter.dt.base.common.base.BaseController;
import com.hunter.dt.base.common.response.CommonResult;
import com.hunter.dt.business.user.menu.service.IMenuService;
import com.hunter.dt.business.user.menu.service.domain.vo.MenuSearchParamVo;
import com.hunter.dt.business.user.menu.service.domain.vo.MenuVo;
import com.hunter.dt.business.user.user.service.domain.vo.UserSearchParamVo;
import com.hunter.dt.business.user.user.service.domain.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(tags = "菜单管理")
@RestController
@RequestMapping("/menu")
public class MenuController extends BaseController<IMenuService> {

    @ApiOperation(value="新增菜单")
    @PostMapping("/addMenu")
    public CommonResult addMenu(@RequestBody MenuVo menuVo){
        return CommonResult.SUCCESS(getService().addMenu(menuVo));
    }

    @ApiOperation(value="删除菜单")
    @GetMapping("/delMenuById")
    public CommonResult delMenuById(@RequestParam String menuId){
        return CommonResult.SUCCESS(getService().delMenuById(menuId));
    }

    @ApiOperation(value="通过 Id 查询菜单")
    @GetMapping("/findMenuById")
    public CommonResult findMenuById(@RequestParam String menuId){
        return CommonResult.SUCCESS(getService().findMenuById(menuId));
    }

    @ApiOperation(value="通过查询条件分页查询菜单列表")
    @PostMapping("/findMenuPageByParam")
    public CommonResult findMenuPageByParam(@RequestBody MenuSearchParamVo paramVo){
        return CommonResult.SUCCESS(getService().findMenuPageByParam(paramVo));
    }

}
