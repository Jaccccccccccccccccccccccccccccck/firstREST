package com.firstREST.controller;

import com.firstREST.dao.UserMapper;
import com.firstREST.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list/all")
    public Object listAll() {
        return userMapper.selectByExample(new UserExample());
    }

}