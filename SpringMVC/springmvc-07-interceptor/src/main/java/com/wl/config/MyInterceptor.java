package com.wl.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ Author: wl
 * @ Date: 2020/8/8 20:29
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("==========处理前=============");
        return true; //return true; 执行下一个拦截，放行，false则不执行
    }

    //@Override
    //public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    //    System.out.println("==========处理后=============");
    //}
    //
    //@Override
    //public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    //    System.out.println("==========清理=============");
    //}
}
