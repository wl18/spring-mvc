package com.wl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: wl
 * @Date: 2020/7/19 09:24
 */

@Controller
@RequestMapping("/c3")
public class ControllerTest3 {

    @RequestMapping("/t1")
    public String test1(Model model) {

        model.addAttribute("msg","helloTest3!");
        return "test";
    }
}
