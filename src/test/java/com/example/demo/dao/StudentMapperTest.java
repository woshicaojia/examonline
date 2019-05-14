/**
 * Copyright (c) 2019, 中国电信甘肃万维公司 All rights reserved.
 * 万维公司 专有/保密源代码,未经许可禁止任何人通过任何渠道使用、修改源代码.
 */
package com.example.demo.dao;

import com.example.demo.ExamonlineApplication;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExamonlineApplication.class)
@WebAppConfiguration
public class StudentMapperTest {
    @Autowired
    private StudentService studentService;

    @Test
    public void show(){
        List<Student> list = studentService.findAll();
        for(Student s:list){
            System.out.println(s);
        }
    }

    @Test
    public void showByPage(){
        Page<Student> students = studentService.findByPage(1,5);
        PageInfo<Student> pageInfo = new PageInfo<>(students);
        System.out.println(pageInfo);
    }
}
