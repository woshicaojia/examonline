/**
 * Copyright (c) 2019, 中国电信甘肃万维公司 All rights reserved.
 * 万维公司 专有/保密源代码,未经许可禁止任何人通过任何渠道使用、修改源代码.
 */
package com.example.demo;

import com.example.demo.intercept.MyIntercept;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 系统名称
 * 工程名称 examonline
 * 创建时间 2019/5/20 16:49
 *
 * @author caoj
 * @since 1.8
 */
@Configuration
public class MyWebConfig extends WebMvcConfigurationSupport {
    //静态资源配置
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").
                addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    protected void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new MyIntercept()).
                addPathPatterns("/**").excludePathPatterns("/","/login");
        super.addInterceptors(registry);
    }

    protected void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("login");
        super.addViewControllers(registry);
    }
}
