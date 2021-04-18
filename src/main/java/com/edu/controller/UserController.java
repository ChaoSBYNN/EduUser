package com.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName UserController
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/18 下午5:51
 * @Version 1.0
 **/
@RestController
@RequestMapping("${server.baseurl}")
public class UserController extends BaseController {

    /**
     * 用户端登录
     * @param request
     * @param data
     */
    @PostMapping("/login")
//    public DeferredResult<String> login(HttpServletRequest request, @RequestBody String data) {
    public String login(HttpServletRequest request, @RequestBody String data) {



        return "SUCCESS";
    }

}
