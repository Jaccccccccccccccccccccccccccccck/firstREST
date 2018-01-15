package com.firstREST.service;

import com.firstREST.dao.UserDao;
import com.firstREST.entity.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public PageInfo<User> selectUserByPage(int currentPage, int pageSize){
        PageHelper.startPage(currentPage, pageSize);
        return new PageInfo<>(userDao.getAll());
    }
}
