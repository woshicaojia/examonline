package com.example.demo.dao;

import com.example.demo.entity.Subject;

public interface SubjectMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer stid);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);
}