package com.firstREST.controller;

import com.fasterxml.jackson.databind.ser.Serializers;
import com.firstREST.dao.Base1101Dao;
import com.firstREST.dao.UserDao;
import com.firstREST.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserService userService;


    @GetMapping("/list/all")
    public Object listAll() {
        return userDao.getAll();
    }

    @GetMapping("list/{pageNum}")
    public Object listNum(@PathVariable("pageNum") int pageNum){
        return userService.selectUserByPage( pageNum,2);
    }


}