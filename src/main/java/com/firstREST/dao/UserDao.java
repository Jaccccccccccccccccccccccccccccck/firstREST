package com.firstREST.dao;

import com.firstREST.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserDao {
    @Select("Select id,name,age from t_basicInfo")
    @ResultType(User.class)
    List<User> getAll();




}