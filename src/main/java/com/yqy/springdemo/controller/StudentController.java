package com.yqy.springdemo.controller;

import com.yqy.springdemo.data.Student;
import com.yqy.springdemo.mapper.StudentMapper;
import com.yqy.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/stu/all")
    public List<Student> getStudent(){
        return studentService.queryAllStudents();
    }

    @PostMapping("/stu/add")
    public int reg(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PostMapping("/stu/update")
    public int updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @GetMapping("/stu/del")
    public int deleteStudent(int id){
        return studentService.delStudent(id);
    }
}
