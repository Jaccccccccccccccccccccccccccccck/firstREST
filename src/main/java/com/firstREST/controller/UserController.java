package com.firstREST.controller;

import com.firstREST.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;

    @GetMapping("/list/all")
    public Object listAll() {
        return userDao.getAll();
    }

}