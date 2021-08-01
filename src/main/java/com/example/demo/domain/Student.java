package com.example.demo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Student {
    private int id;
    private String name;
    private String age;
    private String des;
}
