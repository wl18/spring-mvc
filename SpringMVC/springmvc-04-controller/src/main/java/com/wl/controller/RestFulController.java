package com.wl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: wl
 * @Date: 2020/7/19 09:40
 */

@Controller
public class RestFulController {

    //原来的方式   ： http://localhost:8080/springmvc_04_controller_war_exploded/add?a=1&b=2
    //RestFul风格 ： http://localhost:8080/springmvc_04_controller_war_exploded/add/a/b

    //@RequestMapping(value="/add/{a}/{b}", method = RequestMethod.DELETE)
    //public String test1(@PathVariable int a,@PathVariable int b, Model model) {
    //    int res = a+b;
    //    model.addAttribute("msg","结果为"+res);
    //    return "test";
    //}

    @PostMapping("/add/{a}/{b}")
    public String test2(@PathVariable int a,@PathVariable int b, Model model) {
        int res = a+b;
        model.addAttribute("msg","结果2为"+res);
        return "test";
    }

    @PutMapping("/add/{a}/{b}")
    public String test3(@PathVariable int a,@PathVariable int b, Model model) {
        int res = a+b;
        model.addAttribute("msg","结果3为"+res);
        return "test";
    }


}
