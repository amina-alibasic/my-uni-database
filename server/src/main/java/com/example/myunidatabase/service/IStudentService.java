package com.example.myunidatabase.service;

import com.example.myunidatabase.model.Student;

import java.util.List;

public interface IStudentService {
    Student addNewStudent(Student student);
    boolean deleteStudent(Long studentId);
    Student updateStudentDepartment(Long studentId, Long newDepartmentId);
    List<Student> getAllStudents();
    List<Student> getStudentsByClassId(Long classId);
    List<Student> getStudentsByDepartmentId(Long departmentId);
    List<Student> getStudentsByDegreeTypeId(Long degreeTypeId);
}
