package com.example.myunidatabase.repository;

import com.example.myunidatabase.model.UniClass;

import java.util.List;

public interface UniClassRepository {
    List<UniClass> getAllClasses();
    List<UniClass> getClassesByDepartmentId(Long departmentId);
    Boolean changeDepartment(Long classId, Long newDepartmentId);
    UniClass updateClass(UniClass updatedUniClass);
    Boolean archiveClass(Long classId);
}
