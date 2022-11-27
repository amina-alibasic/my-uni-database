package service;

import model.Department;

public interface IDepartmentService {
    Department addNewDepartment(String departmentName);
    boolean deleteDepartment(Long departmentId);
    Department updateDepartmentName(String departmentName);
}
