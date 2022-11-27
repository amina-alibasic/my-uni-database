package service;

import model.Class;

public interface IClassService {
    Class addNewClass(String className, String departmentName);
    boolean deleteClass(Long classId);
    Class updateClass(Class updatedClass);
    boolean assignClassToNewProfessor(Long classId, Long professorId);
    boolean moveToAnotherDepartment(Long classId, Long departmentId);
}
