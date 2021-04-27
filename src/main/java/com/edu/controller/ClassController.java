package com.edu.controller;

import com.edu.dao.entity.UserEntity;
import com.edu.service.UserClassService;
import com.edu.service.UserLoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName UserController
 * @Descripion 课表 班级
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/18 下午5:51
 * @Version 1.0
 **/
@RestController
@RequestMapping("${server.baseurl}/class")
public class ClassController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(ClassController.class);

    @Autowired
    private UserClassService userClassService;

    @PostMapping("/all")
    public String getClass(HttpServletRequest request, @RequestBody String data) {

        String uid = "";
        String sid = "";
        String aid = "";

        return createJsonResult(userClassService.getClassList(uid, sid, aid));
    }

    @PostMapping("/my/one")
    public String getOneClass(HttpServletRequest request, @RequestBody String data) {

        String uid = "";
        String sid = "";
        String aid = "";
        String cid = "";

        return createJsonResult(userClassService.getMyClass(uid, sid, aid, cid));
    }

    @PostMapping("/my/all")
    public String getAllClass(HttpServletRequest request, @RequestBody String data) {

        String uid = "";
        String sid = "";
        String aid = "";

        return createJsonResult(userClassService.getMyAllClass(uid, sid, aid));
    }

}
