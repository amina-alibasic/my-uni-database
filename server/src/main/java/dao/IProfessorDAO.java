package dao;

import model.Professor;

import java.util.List;

public interface IProfessorDAO {
    List<Professor> getAllProfessors();
    Professor getProfessorById(Long id);
    List<Professor> getProfessorsByDepartmentId(Long id);
    List<Professor> getProfessorsByEmploymentType(Long employmentTypeId);
    Professor updateProfessor(Professor professor);
    Boolean archiveProfessor(Long professorId);
    Boolean changeEmploymentType(Long professorId, Long newEmploymentTypeId);
}
