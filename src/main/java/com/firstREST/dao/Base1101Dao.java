package com.firstREST.dao;

import com.firstREST.entity.User;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface Base1101Dao {
    @Select("Select top 10 * from JL_BASE_1102")
    @ResultType(HashMap.class)
    List<HashMap> getAll();
}
