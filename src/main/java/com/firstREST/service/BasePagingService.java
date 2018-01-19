package com.firstREST.service;

import com.firstREST.dao.jlzx.JlzxDao;
import com.firstREST.dao.localLeftjointest.LeftjointestDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("Base1102Service")
public class BasePagingService implements PagingService{
    @Autowired
    private JlzxDao jlzxDao;
    @Autowired
    private LeftjointestDao leftjointestDao;

    @Override
    public PageInfo<HashMap> selectByPage(String dbName,String tableName,int currentPage, int pageSize){
        if(dbName.equals("jlzx")){
            return new PageInfo<>(leftjointestDao.getAll(tableName,currentPage,pageSize));
        }
        else if(dbName.equals("jlzx1")){
            return new PageInfo<>(jlzxDao.getAll(tableName,currentPage,pageSize));
        }
        return null;

    }
}
