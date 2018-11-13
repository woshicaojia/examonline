package com.example.demo.controller;

import com.example.demo.entity.Teacher;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/11/13.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestController {

    @RequestMapping("getuser")
    public Teacher getUser() {
        Teacher teacher = new Teacher();
        teacher.setPassword("test");
        return teacher;
    }
}
