package com.example.demo.service.impl;

import com.example.demo.dao.StudentMapper;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    //判断是否为合法学生，决定是否登录
    public boolean allowLogin(String studentID,String password){
        Student student=studentMapper.selectByStudentId(studentID);
        if(student==null){
            return false;
        }else if(password.equals(student.getPassword())){
            return true;
        }else{
            return false;
        }
    }
    //获得学生的信息 单个
    public Student getStudentInfo(String studentID){
        return studentMapper.selectByStudentId(studentID);
    }
    //设置学生成绩
    public void setStudentResult(String studentID,int result){

    }
    //根据学生的姓名查找信息
    public List<Student> getStudentByName(String studentName){
        return studentMapper.findByStudentname(studentName);
    }
    //保存一个学生记录
    public void saveStudent(Student student){
        studentMapper.insert(student);
    }
}
