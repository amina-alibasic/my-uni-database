package service;

import model.Student;

public interface IStudentService {
    Student addNewStudent(Student student);
    boolean deleteStudent(Long studentId);
    Student updateStudentDepartment(Long studentId, Long newDepartmentId);
}
