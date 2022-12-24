package com.example.myunidatabase.service;

import com.example.myunidatabase.model.Department;

import java.util.List;

public interface IDepartmentService {
    Department addNewDepartment(String departmentName);
    boolean deleteDepartment(Long departmentId);
    Department updateDepartmentName(String departmentName);
    List<Department> getAllDepartments();
}
