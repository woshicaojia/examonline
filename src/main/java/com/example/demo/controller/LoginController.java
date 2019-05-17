package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.impl.StudentServiceImpl;
import com.example.demo.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class LoginController {
    @Autowired
    private TeacherServiceImpl teacherService;
    @Autowired
    private StudentServiceImpl studentService;
    @RequestMapping(value="/login")
    public String Login(){
        return "login";
    }
    @RequestMapping(value="/main",method = RequestMethod.POST)
    //登录
    public void LoginSuccess(Model model, HttpServletRequest request, HttpServletResponse response)throws  Exception{
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String role=request.getParameter("role");
//        PrintWriter pw=null;
//        if("teacher".equals(role)){
//              if(teacherService.allowLogin(username,password)){
//                  Teacher teacher=teacherService.getTeacherInfo(username);
//                  model.addAttribute("teacher",teacher);
//                  request.getSession().setAttribute("teacherSession",teacher);
//                  return "teacher/teacherIndex";
//              }
//        }else if("student".equals(role)){
//              if(studentService.allowLogin(username,password)){
//                  Student student=studentService.getStudentInfo(username);
//                  model.addAttribute("student",student);
//                  request.getSession().setAttribute("studentSession",student);
//                  return "student/studentIndex";
//              }
//        }else{
//              pw.print("<script>alert('请以教师或者学生身份登录');window.location.href='/exam/login';</script>");
//        }
//        return null;
        if("student".equals(role)&&"1001".equals(username)&&"123456".equals(password)){
            response.sendRedirect("stu/list");
        }
    }
}
