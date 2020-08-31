package com.wl.controller;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

/**
 * @Author: wl
 * @Date: 2020/7/18 21:57
 */

@Controller
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model) {

        //封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");
        return "hello";  //会被视图解析器处理  这个hello就是hello.jsp的名字，意思就是返回到这个页面。
    }

}
