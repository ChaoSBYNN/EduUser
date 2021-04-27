package com.edu.service;

import com.edu.dao.entity.SchoolClassEntity;
import com.edu.dao.entity.UserClassEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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

    public List<SchoolClassEntity> getClassList(String uid, String sid, String aid) {
        // from uid sid aid get class list
        SchoolClassEntity query = new SchoolClassEntity();
        query.setSid(sid);
        if (!StringUtils.isEmpty(aid)) {
            query.setAid(aid);
        }
        return classService.getClassList(query);
    }

    public UserClassEntity getMyClass(String uid, String sid, String aid, String cid) {
        UserClassEntity query = new UserClassEntity();
        query.setSid(sid);
        query.setAid(aid);
        query.setUid(uid);
        query.setCid(cid);
        return userService.getUserOneClass(query);
    }

    public List<UserClassEntity> getMyAllClass(String uid, String sid, String aid) {
        UserClassEntity query = new UserClassEntity();
        query.setSid(sid);
        query.setAid(aid);
        query.setUid(uid);
        return userService.getUserAllClass(query);
    }

}
