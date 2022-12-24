package service;

import model.Professor;
import model.User;

import java.util.List;

public interface IProfessorService {
    Professor addNewProfessor(User newUser);
    boolean deleteProfessor(Long professorId);
    List<Professor> getAllProfessors();
    List<Professor> getProfessorsByDepartmentId(Long departmentId);
    Professor getHeadOfDepartment(Long departmentId);
}
