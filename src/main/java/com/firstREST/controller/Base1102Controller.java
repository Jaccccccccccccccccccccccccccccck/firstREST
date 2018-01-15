package com.firstREST.controller;

import com.firstREST.dao.Base1101Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Base1102Controller {
    @Autowired
    private Base1101Dao base1101Dao;

    @GetMapping("/list/all")
    public Object listAll() {
        return base1101Dao.getAll();
    }
}
