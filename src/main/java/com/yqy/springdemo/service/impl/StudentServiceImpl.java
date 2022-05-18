package com.yqy.springdemo.service.impl;

import com.yqy.springdemo.data.Student;
import com.yqy.springdemo.mapper.StudentMapper;
import com.yqy.springdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public List<Student> queryAllStudents() {
        List<Student> studAll = (List<Student>)redisTemplate.opsForHash().values("studAll");
        if (studAll.isEmpty()){
            List<Student> students = studentMapper.selectList(null);
            for (Student student : students) {
                redisTemplate.opsForHash().put("studAll",student.getId(),student);
            }
        }
        return studAll;
    }
    @Override
    public int addStudent(Student student) {
        int s  = studentMapper.insert(student);
        redisTemplate.opsForHash().put("studAll",student.getId(),student);
        return s;
    }
    @Override
    public int updateStudent(Student student) {
        redisTemplate.opsForHash().put("studAll",student.getId(),student);
        return studentMapper.updateById(student);
    }

    @Override
    public int delStudent(int id) {
        redisTemplate.opsForHash().delete("studAll",id);
        return studentMapper.deleteById(id);
    }
}
