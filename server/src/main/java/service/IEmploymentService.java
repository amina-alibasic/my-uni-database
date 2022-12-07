package service;

import model.Employment;
import model.EnuEmploymentType;

public interface IEmploymentService {
    Employment addNewEmployment(Employment employment);
    boolean deleteEmployment(Long employmentId);
    boolean updateEmploymentType(EnuEmploymentType employmentType);
    Employment updateEmployment(Employment employment);
}
