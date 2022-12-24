package com.example.myunidatabase.service;

import com.example.myunidatabase.model.Employment;
import com.example.myunidatabase.model.EnuEmploymentType;

public interface IEmploymentService {
    Employment addNewEmployment(Employment employment);
    boolean deleteEmployment(Long employmentId);
    boolean updateEmploymentType(EnuEmploymentType employmentType);
    Employment updateEmployment(Employment employment);
}
