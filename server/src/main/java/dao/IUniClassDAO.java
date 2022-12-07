package dao;

import java.util.List;
import model.UniClass;

public interface IUniClassDAO {
    List<UniClass> getAllClasses();
    List<UniClass> getClassesByDepartmentId(Long departmentId);
    Boolean changeDepartment(Long classId, Long newDepartmentId);
    UniClass updateClass(UniClass updatedUniClass);
    Boolean archiveClass(Long classId);
}
