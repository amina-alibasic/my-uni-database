package com.example.myunidatabase.repository;

import com.example.myunidatabase.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> getAllStudents();
    List<Student> getStudentsByDepartmentId(Long departmentId);
    List<Student> getStudentsByDegreeType(Long degreeTypeId);
    Student getStudentById(Long studentId);
    Student updateStudent(Student student);
    Boolean archiveStudent(Long studentId);
    Boolean changeDegreeType(Long studentId, Long newDegreeTypeId);
}
