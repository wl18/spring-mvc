package com.wl.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.wl.pojo.User;
import com.wl.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: wl
 * @Date: 2020/7/19 19:58
 */
//@Controller
@RestController
public class UserController {

    @RequestMapping("/j1")
    //@ResponseBody //加了这个注解，它就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {

        //jackson中的，ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("007一号",88,"女");

        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<User> userList = new ArrayList<>();

        User user1 = new User("001一号",22,"男");
        User user2 = new User("001二号",22,"男");
        User user3 = new User("001三号",22,"男");
        User user4 = new User("001四号",22,"男");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        return mapper.writeValueAsString(userList);
    }

    @RequestMapping("j3")
    public String json3() throws JsonProcessingException {

        //jackson中的，ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        Date date = new Date();
        //自定义日期的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //ObjectMapper，时间解析后的默认格式为：Timestamp,时间戳

        //return mapper.writeValueAsString(sdf.format(date));

        //return mapper.writeValueAsString(date);
        return JsonUtils.getJson(date);
    }


    //fastJson演示
    @RequestMapping("/j4")
    public String json4() throws JsonProcessingException {

        List<User> userList2 = new ArrayList<User>();

        User user1 = new User("001ee号",22,"男");
        User user2 = new User("001rr号",22,"男");
        User user3 = new User("001ee号",22,"男");
        User user4 = new User("001ww号",22,"男");

        userList2.add(user1);
        userList2.add(user2);
        userList2.add(user3);
        userList2.add(user4);
        //return JSON.toJSONString(userList2);

        System.out.println("==========Java对象 转 JSON字符串============");
        String str1 = JSON.toJSONString(userList2);
        System.out.println("JSON.toJSONString(userList2)==>"+ str1);
        String str2 = JSON.toJSONString(user1);
        System.out.println("JSON.toJSONString(user1)==>"+ str2);

        System.out.println("\n==========JSON字符串 转 Java对象============");
        User jp_user1 = JSON.parseObject(str2,User.class);
        System.out.println("JSON.parseObject(str2,User.class)==>"+ jp_user1);

        System.out.println("\n==========Java对象 转 JSON对象============");
        JSONObject jsonObject = (JSONObject) JSON.toJSON(user2);
        System.out.println("(JSONObject) JSON.toJSON(user2)==>"+ jsonObject.getString("name"));

        System.out.println("\n==========JSON对象 转 java对象============");
        User to_java_user = JSON.toJavaObject(jsonObject,User.class);
        System.out.println("JSON.toJavaObject(jsonObject,User.class)==>"+ to_java_user);

        return "hello";
    }
}
