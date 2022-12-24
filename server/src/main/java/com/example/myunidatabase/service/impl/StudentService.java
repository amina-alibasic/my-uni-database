package com.example.myunidatabase.service.impl;

import com.example.myunidatabase.model.Student;
import com.example.myunidatabase.repository.StudentRepository;
import com.example.myunidatabase.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService {
    private StudentRepository studentRepository;

    @Override
    public Student addNewStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public boolean deleteStudent(Long studentId) {
        return false;
    }

    @Override
    public Student updateStudentDepartment(Long studentId, Long newDepartmentId) {
        return null;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getStudentsByClassId(Long classId) {
        return null;
    }

    @Override
    public List<Student> getStudentsByDepartmentId(Long departmentId) {
        return null;
    }

    @Override
    public List<Student> getStudentsByDegreeTypeId(Long degreeTypeId) {
        return null;
    }
}
