package com.firstREST.service;

import com.github.pagehelper.PageInfo;

import java.util.HashMap;

public interface PagingService {
    public PageInfo<HashMap> selectByPage(String dbName,String tableName,int currentPage, int pageSize);
}
