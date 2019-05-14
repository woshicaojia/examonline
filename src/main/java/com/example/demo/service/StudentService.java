package com.example.demo.service;

import com.example.demo.entity.Student;
import com.github.pagehelper.Page;

import java.util.List;

public interface StudentService {
    //判断是否为合法学生，决定是否登录
    public boolean allowLogin(String studentID,String password);
    //获得学生的信息 单个
    public Student getStudentInfo(String studentID);
    //设置学生成绩
    public void setStudentResult(String studentID,int result);
    //根据学生的姓名查找信息
    public List<Student> getStudentByName(String studentName);
    //根据班级查找学生
    //public PageResult getStudentByClass(String sclass,Page page);
    //保存一个学生记录
    public void saveStudent(Student student);
    //根据分页查询学生记录
    //public PageResult queryStudentByPage(Page page);
    //获取学生数量
    //public int countStudent();
    //public int countStudentByClass(String sclass);

    /**
     * 查找所有
     * @return
     */
    public List<Student> findAll();

    /**
     * 分页查询
     * @param pageNo 页号
     * @param pageSize  每页显示的条数
     * @return
     */
    public Page<Student> findByPage(int pageNo,int pageSize);
}
