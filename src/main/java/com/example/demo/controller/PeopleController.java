package com.example.demo.controller;

import com.example.demo.entity.People;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/people")
public class PeopleController {
    //测试ajax
    @RequestMapping(value="/ajax01")
    public String getUU(){
        return "test/ajaxtest";
    }

    @RequestMapping(value="/testpeop",method = RequestMethod.POST)
    @ResponseBody
    public void getU(String pid,String name,String birthday,String email){
        People p=new People(pid,name,birthday,email);
        System.out.println(p.toString());
    }
}
