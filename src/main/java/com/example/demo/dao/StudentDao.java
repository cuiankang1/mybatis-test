package com.example.demo.dao;

import com.example.demo.domain.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> selectStudents();
}
