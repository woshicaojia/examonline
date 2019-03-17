package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(String sysid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String sysid);

    Student selectByStudentId(String studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    //根据学生的姓名查找信息
    List<Student> findByStudentname(String name);
}