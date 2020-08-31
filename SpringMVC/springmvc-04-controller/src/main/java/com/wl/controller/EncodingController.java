package com.wl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @Author: wl
 * @Date: 2020/7/19 13:10
 */

@Controller
public class EncodingController {

    @PostMapping("/e/t1")
    public String test(String name, Model model) {

        //过滤器解决乱码
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }

}
