package com.example.demo.dao;

import com.example.demo.entity.Student;
import com.github.pagehelper.Page;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(String sysid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String sysid);

    Student selectByStudentId(String studentId);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    /**
     * 根据学生姓名查询学生信息
     * @param name
     * @return
     */
    List<Student> findByStudentname(String name);

    /**
     * 回去所有学生信息
     * @return
     */
    List<Student> findAll();

    /**
     * 分页查询
     * @return
     */
    Page<Student> findByPage();
}