package com.example.myunidatabase.controller;

import com.example.myunidatabase.model.Student;
import com.example.myunidatabase.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        System.out.println("sql");
        return studentService.getAllStudents();
    }
}
