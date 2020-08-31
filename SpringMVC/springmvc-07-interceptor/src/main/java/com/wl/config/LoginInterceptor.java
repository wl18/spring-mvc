package com.wl.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ Author: wl
 * @ Date: 2020/8/8 21:07
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession(); //请求服务器中的session过来

        //放行，判断什么情况下登录

        //登录页面也要放行
        if (request.getRequestURI().contains("goLogin")){
            return true;
        }
        if (request.getRequestURI().contains("login")){
            return true;
        }

        if (session.getAttribute("userLoginInfo") != null){
            return true;
        }

        //判断什么情况下没有登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
        return false;
    }
}
