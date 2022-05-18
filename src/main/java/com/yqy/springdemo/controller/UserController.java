package com.yqy.springdemo.controller;

import com.yqy.springdemo.data.LoginUser;
import com.yqy.springdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/login")
    public boolean login(@RequestBody LoginUser user, HttpServletResponse response, HttpServletRequest request){
        LoginUser loginUser = userMapper.selectOne(user);
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
        System.out.println("111111");
        LoginUser tokenLogin = userMapper.selectOne(new LoginUser(request.getHeader("token"),request.getHeader("token2")));
        return loginUser != null || tokenLogin != null;
    }

    @GetMapping("/query")
    public String query(@PathVariable String text){
        System.out.println(text);
        return text;
    }


}
