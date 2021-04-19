package com.edu.controller;

import com.edu.Application;
import com.edu.dao.entity.UserEntity;
import com.edu.service.UserLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserLoginService userLoginService;

    /**
     * 用户端登录
     * @param request
     * @param data
     */
    @PostMapping("/login")
//    public DeferredResult<String> login(HttpServletRequest request, @RequestBody String data) {
    public String login(HttpServletRequest request, @RequestBody String data) {

        UserEntity userEntity = new UserEntity();
        userEntity.setPassword("123");
        userEntity.setUsername("user1");
        UserEntity result = userLoginService.login(userEntity);

        logger.info("user login info : {}", result);
        return createJsonResult(result);
    }

    @PostMapping("/register")
    public String register(HttpServletRequest request, @RequestBody String data) {


        return "SUCCESS";
    }

}
