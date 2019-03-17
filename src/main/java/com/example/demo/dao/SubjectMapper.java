package com.example.demo.dao;

import com.example.demo.entity.Subject;

import java.util.List;

public interface SubjectMapper {
    int deleteByPrimaryKey(Integer stid);

    int insert(Subject record);

    int insertSelective(Subject record);

    Subject selectByPrimaryKey(Integer stid);

    Subject selectByStTitle(String stTitle);

    int updateByPrimaryKeySelective(Subject record);

    int updateByPrimaryKey(Subject record);

    List<Subject> getAllSubjects();
}