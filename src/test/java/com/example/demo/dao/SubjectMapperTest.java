package com.example.demo.dao;

import com.example.demo.ExamonlineApplication;
import com.example.demo.service.SubjectService;
import com.example.demo.service.impl.SubjectServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ExamonlineApplication.class)
@WebAppConfiguration
public class SubjectMapperTest {
    @Autowired
    private SubjectServiceImpl subjectService;

    @Test
    public void Testo1(){
        int total=subjectService.countSubject();
        System.out.println(total);
    }
}
