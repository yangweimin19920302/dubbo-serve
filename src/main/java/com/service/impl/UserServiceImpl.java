package com.service.impl;

import com.model.User;
import com.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/8/11.
 */
@Service
public class UserServiceImpl implements UserService{

    public User get(String userId) {
        System.out.println(userId);
        User user = new User();
        user.setUserId(userId);
        user.setUserName("杨慰民");
        return user;
    }

    public void add(User user) throws Exception {
        if (user.getUserId() == null) {
            throw new Exception("信息不能为空");
        }
    }
}
