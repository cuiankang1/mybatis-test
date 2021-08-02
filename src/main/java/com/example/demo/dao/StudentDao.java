package com.example.demo.dao;

import com.example.demo.domain.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentDao {
    public List<Student> selectStudents();
    public void insertStudent(Student student);
    public void updateStudent(Student student);
}
