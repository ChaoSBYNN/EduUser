package com.edu.service;

import com.edu.dao.entity.SchoolClassEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserClassService
 * @Descripion TODO
 * @Author ChaoS_Zhang t7_chaos@163.com
 * @Date 2021/4/20 上午10:03
 * @Version 1.0
 **/
@Service
public class UserClassService {

    @Autowired
    private UserService userService;

    @Autowired
    private SchoolService schoolService;

    @Autowired
    private ClassService classService;

    public List<SchoolClassEntity> getMyClassList(String uid, String sid, String aid) {

        // from uid sid aid get class list
        SchoolClassEntity query = new SchoolClassEntity();
        query.setSid(sid);
        return classService.getClassList(query);
    }


}
