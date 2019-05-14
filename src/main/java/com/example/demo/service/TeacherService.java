package com.example.demo.service;

import com.example.demo.entity.Teacher;

public interface TeacherService {
    //判断是否是合法的老师。
    public boolean allowLogin(String teacherId,String password);
    //返回老师的信息
    public Teacher getTeacherInfo(String teacherId);
    //插入信息
    int addTeacher(Teacher teacher);
}
