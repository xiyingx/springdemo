package com.yqy.springdemo.service;

import com.yqy.springdemo.data.Student;

import java.util.List;

public interface StudentService {
    public List<Student> queryAllStudents();
    public int addStudent(Student student);
    public int updateStudent(Student student);
    public int delStudent(int id);
}
