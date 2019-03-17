package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.entity.User;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/addStudent")
    public String addStudent(Model model, HttpServletResponse response, HttpServletRequest request){
        Teacher teacher=(Teacher)request.getSession().getAttribute("teacherSession");
        model.addAttribute("teacher",teacher);
        return "teacher/studentAdd";
    }

    @RequestMapping(value="/save")
    public void save(HttpServletResponse response, HttpServletRequest request, Student student){
        System.out.println(student);
    }
}
