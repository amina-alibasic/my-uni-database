package dao.impl;

import dao.IDepartmentDAO;
import model.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO implements IDepartmentDAO {
    @Override
    public List<Department> getAllDepartments() {
        return new ArrayList<>();
    }
}
