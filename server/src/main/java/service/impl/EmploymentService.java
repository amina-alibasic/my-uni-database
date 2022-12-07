package service.impl;

import model.Employment;
import model.EnuEmploymentType;
import service.IEmploymentService;

public class EmploymentService implements IEmploymentService {
    @Override
    public Employment addNewEmployment(Employment employment) {
        return null;
    }

    @Override
    public boolean deleteEmployment(Long employmentId) {
        return false;
    }

    @Override
    public boolean updateEmploymentType(EnuEmploymentType employmentType) {
        return false;
    }

    @Override
    public Employment updateEmployment(Employment employment) {
        return null;
    }
}
