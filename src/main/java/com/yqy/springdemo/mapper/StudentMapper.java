package com.yqy.springdemo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yqy.springdemo.data.Student;
import org.apache.ibatis.annotations.*;

@Mapper //映射接口
public interface StudentMapper extends BaseMapper<Student> {

}
