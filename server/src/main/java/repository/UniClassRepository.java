package repository;

import java.util.List;
import model.UniClass;

public interface UniClassRepository {
    List<UniClass> getAllClasses();
    List<UniClass> getClassesByDepartmentId(Long departmentId);
    Boolean changeDepartment(Long classId, Long newDepartmentId);
    UniClass updateClass(UniClass updatedUniClass);
    Boolean archiveClass(Long classId);
}
