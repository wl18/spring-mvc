package com.wl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wl
 * @Date: 2020/7/19 09:14
 */

@Controller  //使用了这个注解表示这个类会被spring接管，被这个注解的类中的所有方法，如果返回值是String，并且有具体页面可以跳转，那么就会被试图解析器解析
public class ControllerTest2 {

    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg","HelloTest2!");
        return "test";
    }

}
