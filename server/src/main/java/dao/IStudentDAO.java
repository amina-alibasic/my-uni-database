package dao;

import model.Student;

import java.util.List;

public interface IStudentDAO {
    List<Student> getAllStudents();
    List<Student> getStudentsByDepartmentId(Long departmentId);
    List<Student> getStudentsByDegreeType(Long degreeTypeId);
    Student getStudentById(Long studentId);
    Student updateStudent(Student student);
    Boolean archiveStudent(Long studentId);
    Boolean changeDegreeType(Long studentId, Long newDegreeTypeId);
}
