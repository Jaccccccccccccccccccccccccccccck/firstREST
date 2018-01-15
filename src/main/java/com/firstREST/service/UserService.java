package com.firstREST.service;

import com.firstREST.entity.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    public PageInfo<User> selectUserByPage(int currentPage, int pageSize);
}
