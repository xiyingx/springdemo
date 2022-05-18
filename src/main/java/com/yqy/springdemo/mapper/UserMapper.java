package com.yqy.springdemo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yqy.springdemo.data.LoginUser;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<LoginUser> {

}
