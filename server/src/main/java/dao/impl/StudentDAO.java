package dao.impl;

import dao.IStudentDAO;
import model.Student;

import java.util.List;

public class StudentDAO implements IStudentDAO {
    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public List<Student> getStudentsByDepartmentId(Long departmentId) {
        return null;
    }

    @Override
    public List<Student> getStudentsByDegreeType(Long degreeTypeId) {
        return null;
    }

    @Override
    public Student getStudentById(Long studentId) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public Boolean archiveStudent(Long studentId) {
        return null;
    }

    @Override
    public Boolean changeDegreeType(Long studentId, Long newDegreeTypeId) {
        return null;
    }
}
