package com.example.demo;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Properties;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class ExamonlineApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(ExamonlineApplication.class, args);
	}
}
