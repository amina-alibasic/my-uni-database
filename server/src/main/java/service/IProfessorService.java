package service;

import model.Professor;
import model.User;

public interface IProfessorService {
    Professor addNewProfessor(User newUser);
    boolean deleteProfessor(Long professorId);
}
