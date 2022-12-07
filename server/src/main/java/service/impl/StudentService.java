package service.impl;

import model.Student;
import service.IStudentService;

public class StudentService implements IStudentService {
    @Override
    public Student addNewStudent(Student student) {
        return null;
    }

    @Override
    public boolean deleteStudent(Long studentId) {
        return false;
    }

    @Override
    public Student updateStudentDepartment(Long studentId, Long newDepartmentId) {
        return null;
    }
}
