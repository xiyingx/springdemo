package com.yqy.springdemo.data;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
@TableName("student")
@Data
public class Student implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private int age;
    private String major;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }
}
