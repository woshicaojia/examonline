package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class ExamonlineApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ExamonlineApplication.class, args);
	}
}
