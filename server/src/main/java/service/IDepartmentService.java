package service;

import model.Department;

import java.util.List;

public interface IDepartmentService {
    Department addNewDepartment(String departmentName);
    boolean deleteDepartment(Long departmentId);
    Department updateDepartmentName(String departmentName);
    List<Department> getAllDepartments();
}
