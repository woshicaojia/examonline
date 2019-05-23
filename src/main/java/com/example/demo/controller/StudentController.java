/**
 * Copyright (c) 2019, 中国电信甘肃万维公司 All rights reserved.
 * 万维公司 专有/保密源代码,未经许可禁止任何人通过任何渠道使用、修改源代码.
 */
package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.util.PageInfo;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * 系统名称 考试系统
 * 工程名称 examonline
 * 创建时间 2019/5/15 9:30
 *
 * @author caoj
 * @since 1.8
 */

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    //学生首页
    @RequestMapping("/main")
    public String main(HttpServletRequest request,Model model){
        return "";
    }
    @RequestMapping("/list")
    public String list(@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
                       @RequestParam(value = "pageSize",defaultValue = "5") int pageSize,HttpServletRequest request, Model model){
        Page<Student> students = studentService.findByPage(pageNum,pageSize);
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        model.addAttribute("pageInfo",pageInfo);
        return "student/stu_list";
    }
}
