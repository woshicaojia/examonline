package com.example.demo.controller;

import com.example.demo.entity.Teacher;
import com.example.demo.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ManagerService managerService;

    @RequestMapping("getuser")
    public Teacher getUser() {
        Teacher teacher = new Teacher();
        teacher.setPassword("test");
        return teacher;
    }

    @RequestMapping("getManager")
    public Manager getManager() {
        Manager manager = managerService.getManager("123");
        return manager;
    }
}
