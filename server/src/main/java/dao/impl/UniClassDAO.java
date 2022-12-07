package dao.impl;

import dao.IUniClassDAO;
import model.UniClass;

import java.util.List;

public class UniClassDAO implements IUniClassDAO {
    @Override
    public List<UniClass> getAllClasses() {
        return null;
    }

    @Override
    public List<UniClass> getClassesByDepartmentId(Long departmentId) {
        return null;
    }

    @Override
    public Boolean changeDepartment(Long classId, Long newDepartmentId) {
        return null;
    }

    @Override
    public UniClass updateClass(UniClass updatedUniClass) {
        return null;
    }

    @Override
    public Boolean archiveClass(Long classId) {
        return null;
    }
}
