package com.wl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @ Author: wl
 * @ Date: 2020/8/8 20:55
 */

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model){
        //这里是把用户信息存到session中
        session.setAttribute("userLoginInfo",username);

        model.addAttribute("username",username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String login(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
