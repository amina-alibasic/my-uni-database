package service.impl;

import model.Student;
import service.IStudentService;

import java.util.List;

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

    @Override
    public List<Student> getAllStudents() {
        return null;
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
