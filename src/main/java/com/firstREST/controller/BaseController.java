package com.firstREST.controller;

import com.firstREST.service.BasePagingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {
    @Autowired
    private BasePagingService base1102PagingService;

    @GetMapping("{dbName}/{tableName}/{pageNum}")
    public Object listAll(@PathVariable("dbName") String dbName,@PathVariable("tableName") String tableName,@PathVariable("pageNum") int pageNum) {
        return base1102PagingService.selectByPage(dbName,tableName, pageNum,500);
    }
}
