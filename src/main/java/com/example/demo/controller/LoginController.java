package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.service.impl.StudentServiceImpl;
import com.example.demo.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
    public ModelAndView LoginSuccess(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        ModelAndView mv = new ModelAndView();
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String role=request.getParameter("role");
        //用于记录消息
        Map<String,String> resMap = new HashMap<>();
        if("teacher".equals(role)){
              if(teacherService.allowLogin(username,password)){
                  Teacher teacher=teacherService.getTeacherInfo(username);
                  request.getSession().setAttribute("teacherSession",teacher);
                  mv.addObject("teacher",teacher);
                  mv.setViewName("teacher/teacherIndex");
                  return mv;
              }else{
                  resMap.put("msg","The teacher login in success");
              }
        }else if("student".equals(role)){
              if(studentService.allowLogin(username,password)){
                  Student student=studentService.getStudentInfo(username);
                  request.getSession().setAttribute("studentSession",student);
                  mv.addObject("student",student);
                  mv.setViewName("student/studentIndex");
                  return mv;
              }else{
                  resMap.put("msg","The teacher login in failed");
              }
        }else{
              response.setContentType("text/html;charset=utf-8");
              String msg = "alert('教师或学生角色登录失败，请重新登录！'); window.location.href='"+request.getContextPath()+"';";
              response.getWriter().write("<script language=\"javascript\">");
              response.getWriter().write(msg+"\n");
              response.getWriter().write("</script>");
              return null;
        }
        if(!CollectionUtils.isEmpty(resMap)){
            response.setContentType("text/html;charset=utf-8");
            String msg = "alert('"+resMap.get("msg")+"'); window.location.href='"+request.getContextPath()+"/login';";
            response.getWriter().write("<script language=\"javascript\">");
            response.getWriter().write(msg+"\n");
            response.getWriter().write("</script>");
            return null;
        }
        return new ModelAndView("redirect:/login");
    }
}
