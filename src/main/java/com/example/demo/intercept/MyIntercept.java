/**
 * Copyright (c) 2019, 中国电信甘肃万维公司 All rights reserved.
 * 万维公司 专有/保密源代码,未经许可禁止任何人通过任何渠道使用、修改源代码.
 */
package com.example.demo.intercept;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 系统名称
 * 工程名称 examonline
 * 创建时间 2019/5/20 17:00
 *
 * @author caoj
 * @since 1.8
 */
public class MyIntercept implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) {
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {

    }
}
