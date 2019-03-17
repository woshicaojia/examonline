package com.example.demo.service.impl;

import com.example.demo.dao.TeacherMapper;
import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    //判断是否是合法的老师。
    public boolean allowLogin(String teacherId,String password){
          Teacher teacher=teacherMapper.selectByTeacherId(teacherId);
          if(teacher==null){
              return false;
          }else if(password.equals(teacher.getPassword())){
              return true;
          }else {
              return false;
          }
    }
    //返回老师的信息
    public Teacher getTeacherInfo(String teacherId){
         return teacherMapper.selectByTeacherId(teacherId);
    }
}
