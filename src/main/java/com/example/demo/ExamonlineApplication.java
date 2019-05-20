package com.example.demo;

import com.github.pagehelper.PageHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Properties;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
@Configuration
public class ExamonlineApplication extends WebMvcConfigurerAdapter {
	public static void main(String[] args) {
		SpringApplication.run(ExamonlineApplication.class, args);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").
				addResourceLocations("classpath:/static/");
		super.addResourceHandlers(registry);
	}
}
