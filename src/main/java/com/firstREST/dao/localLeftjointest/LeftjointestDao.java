package com.firstREST.dao.localLeftjointest;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface LeftjointestDao {
    @Select(value = "Select * from ${table_name} order by id")
    @ResultType(HashMap.class)
    List<HashMap> getAll(@Param("table_name") String tableName);
}
