package dao.impl;

import dao.IProfessorDAO;
import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO implements IProfessorDAO {
    @Override
    public List<Professor> getAllProfessors(){
        return new ArrayList<>();
    }
    @Override
    public Professor getProfessorById(Long id) {
        return new Professor();
    }
    @Override
    public List<Professor> getProfessorsByDepartmentId(Long id){
        return new ArrayList<>();
    }
    @Override
    public List<Professor> getProfessorsByEmploymentType(Long employmentTypeId){
        return new ArrayList<>();
    }

    @Override
    public Professor updateProfessor(Professor professor) {
        return null;
    }

    @Override
    public Boolean archiveProfessor(Long professorId) {
        return null;
    }

    @Override
    public Boolean changeEmploymentType(Long professorId, Long newEmploymentTypeId) {
        return null;
    }
}
