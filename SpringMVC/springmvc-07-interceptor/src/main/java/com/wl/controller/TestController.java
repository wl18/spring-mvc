package com.wl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author: wl
 * @ Date: 2020/8/8 20:23
 */

@RestController
public class TestController {

    @GetMapping("/t1")
    public String test() {
        System.out.println("testController执行了");
        return "ok";
    }
}
