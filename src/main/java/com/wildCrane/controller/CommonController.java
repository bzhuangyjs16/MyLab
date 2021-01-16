package com.wildCrane.controller;

import com.wildCrane.constants.enums.HttpStatusEnum;
import com.wildCrane.entity.User;
import com.wildCrane.exception.ServiceException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@Api(value = "用户接口")
@RestController
@RequestMapping("api/common")
public class CommonController {

    @ApiOperation("插入用户信息")
    @ApiImplicitParam(name = "user", value = "用户", required=true, dataType = "User")
    @PostMapping("/insert")
    public String insert(@RequestBody User user) {
        System.out.println("开始新增...");
        //如果姓名为空就手动抛出一个自定义的异常！
        if(user.getName()==null){
            throw  new ServiceException(HttpStatusEnum.BAD_REQUEST.getCode(),"用户姓名不能为空！");
        }
        return "hello World";
    }


}
