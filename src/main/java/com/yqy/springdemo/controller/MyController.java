package com.yqy.springdemo.controller;


import com.yqy.springdemo.data.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MyController {
    @Autowired
    Person person;
    @GetMapping("/hi")//控制器中的每一个方法就是提供给前端的一个具体的服务点 get表示用get方式请求的方式
    public String hello(){
        return "hello,world";
    }
    @GetMapping("/time")//http://localhost:8080/time
    public String getTime(){
        return (new Date()).toString();
    }
    @GetMapping("/img")
    public String getImg(){
        double ran = Math.random();
        if (ran<0.5){
            return "/img/www.jpg";
        }return "/img/www2.jpg";
    }
    @GetMapping("/login")
    public Person userLogin(String userName,String pwd){
        person.setName(userName);
        person.setPwd(pwd);
        System.out.println("user:"+userName+",pwd:"+pwd);
        return person;
    }
}
