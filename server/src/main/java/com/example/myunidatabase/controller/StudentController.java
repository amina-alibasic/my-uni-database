package com.example.myunidatabase.controller;

import com.example.myunidatabase.model.Student;
import com.example.myunidatabase.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/add-student")
    public Student addNewStudent(@RequestBody Student student) {
        return studentService.addNewStudent(student);
    }
}
