package com.lucifer.auth.controller;

import com.lucifer.auth.bean.vo.UserInfoVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：yuz13
 * @date ：Created in 2022/3/11 13:36
 * @description：
 * @modified By：
 * @version: $
 */

@RestController
@RequestMapping("/login")
@Slf4j
@Api(tags = "登录认证接口")
public class LoginController {

    @GetMapping("")
    @ApiOperation("登录认证接口")
    public String Login(UserInfoVo userInfoVo){
       // log.info("进入Login接口，参数为【{}】",userInfoVo);
        return "Login success";
    }

}
