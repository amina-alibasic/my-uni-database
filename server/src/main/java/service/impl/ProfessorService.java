package service.impl;

import model.Professor;
import model.User;
import service.IProfessorService;

import java.util.List;

public class ProfessorService implements IProfessorService {
    @Override
    public Professor addNewProfessor(User newUser) {
        return null;
    }

    @Override
    public boolean deleteProfessor(Long professorId) {
        return false;
    }

    @Override
    public List<Professor> getAllProfessors() {
        return null;
    }

    @Override
    public List<Professor> getProfessorsByDepartmentId(Long departmentId) {
        return null;
    }

    @Override
    public Professor getHeadOfDepartment(Long departmentId) {
        return null;
    }
}
