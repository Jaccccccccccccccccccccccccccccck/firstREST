package com.firstREST.service;

import com.firstREST.dao.jlzx.BaseDao;
import com.firstREST.dao.localLeftjointest.LeftjointestDao;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("Base1102Service")
public class BasePagingService implements PagingService{
    @Autowired
    private BaseDao baseDao;
    @Autowired
    private LeftjointestDao leftjointestDao;

    @Override
    public PageInfo<HashMap> selectByPage(String dbName,String tableName,int currentPage, int pageSize){
        if(dbName.equals("leftjointest")){
            PageHelper.startPage(currentPage, pageSize);
            return new PageInfo<>(leftjointestDao.getAll(tableName));
//            PageHelper.setProperties
        }
        else if(dbName.equals("jlzx")){
            PageHelper.startPage(currentPage, pageSize);
            return new PageInfo<>(baseDao.getAll(tableName));
        }
        return null;

    }
}
