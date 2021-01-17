package com.wildCrane.controller;

import com.wildCrane.entity.User;
import com.wildCrane.service.UserService;
import com.wildCrane.utils.ResultBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(value = "用户接口")
@RestController
@RequestMapping("api/common")
public class CommonController {
    @Autowired
    private UserService userService;

    @ApiOperation("插入用户信息")
    @ApiImplicitParam(name = "user", value = "用户", required=true, dataType = "User")
    @PostMapping("/insert")
    public ResultBody insert(@RequestBody User user) {
        System.out.println("开始新增...");
        return ResultBody.success(userService.insert(user));
    }

    @ApiOperation("更新用户信息")
    @ApiImplicitParam(name = "user", value = "用户", required=true, dataType = "User")
    @PostMapping("/update")
    public ResultBody update(@RequestBody User user) {
        System.out.println("开始新增...");
        return ResultBody.success(userService.insert(user));
    }
}
