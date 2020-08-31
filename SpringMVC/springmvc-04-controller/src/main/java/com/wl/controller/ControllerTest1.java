package com.wl.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: wl
 * @Date: 2020/7/19 09:03
 */
public class ControllerTest1 implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new  ModelAndView();
        mv.setViewName("test");
        mv.addObject("msg","ControllerTest1");
        return mv;
    }
}
