package com.yqy.springdemo.handler;

import com.yqy.springdemo.data.LoginUser;
import com.yqy.springdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class UserHandler implements HandlerInterceptor {
    @Autowired
    UserMapper userMapper;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        /*使其只拦截post和get请求 跨域预检不拦截*/
        if (request.getMethod().equals("POST") || request.getMethod().equals("GET")){
            LoginUser user = new LoginUser(request.getHeader("token"),request.getHeader("token2"));
            System.out.println(user);
            return userMapper.selectOne(user)!=null;
        }
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
