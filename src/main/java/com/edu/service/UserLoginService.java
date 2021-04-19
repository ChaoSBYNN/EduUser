package com.edu.service;

import com.edu.dao.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserLoginService
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/19 下午12:50
 * @Version 1.0
 **/
@Service
public class UserLoginService {

    @Autowired
    private UserService userService;

    public UserEntity login(UserEntity data) {
        return userService.getUser(data);
    }
}
