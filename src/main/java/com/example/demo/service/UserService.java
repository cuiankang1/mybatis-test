package com.example.demo.service;

import com.example.demo.dao.StudentDao;
import com.example.demo.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private StudentDao studentDao;
    public List<Student> selectStudents(){
        return studentDao.selectStudents();
    }
}
