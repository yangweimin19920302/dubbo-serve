package com.service;

import com.model.User;

/**
 * Created by Administrator on 2016/8/10.
 */
public interface UserService {
    User get(String userId) throws Exception;

    void add(User user) throws Exception;
}
