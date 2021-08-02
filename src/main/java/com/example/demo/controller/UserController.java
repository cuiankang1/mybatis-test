package com.example.demo.controller;

import com.example.demo.dao.StudentDao;
import com.example.demo.domain.Student;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/students")
    public List<Student> selectStudents(){
        return userService.selectStudents();
    }
    @PostMapping("/insert")
    public void insertStudent(@RequestBody Student student){
        userService.insertStudent(student);
    }
    @RequestMapping(value = "/update", produces = "application/json;charset=UTF-8", method = RequestMethod.GET)
    public void updateStudent(Student student){
        userService.updateStudent(student);
    }
}
