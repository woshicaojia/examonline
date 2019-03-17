package com.example.demo.dao;


import com.example.demo.ExamonlineApplication;
import com.example.demo.dao.TeacherMapper;
import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import com.example.demo.service.impl.TeacherServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExamonlineApplication.class)
@WebAppConfiguration
//IDEA有个快捷键，在dao层类下，ctrl+alt+t能自动生成测试类放在test目录下。
public class TeacherMapperTest {
    @Autowired
    private TeacherServiceImpl teacherService;


    @Test
    public void Test01(){
        Teacher teacher=teacherService.getTeacherInfo("10001");
        System.out.println(teacher.getPassword());
    }

}
