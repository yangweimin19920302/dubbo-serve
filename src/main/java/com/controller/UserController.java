package com.controller;

import com.model.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2016/8/10.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get/{userId}")
    @ResponseBody
    public User get(@PathVariable String userId) throws Exception{
        return userService.get(userId);
    }

    @RequestMapping("/add")
    @ResponseBody
    public void get(@RequestBody User user) throws Exception{
        userService.add(user);
    }
}
