package service;

import model.Enrollment;

public interface IEnrollmentService {
    Enrollment addNewEnrollment(Enrollment enrollment);
    boolean deleteEnrollment(Long enrollmentId);
    boolean updateEnrollmentClass(Long enrollmentId);
    boolean updateEnrollmentStudent(Long enrollmentId);
    boolean editGrade(Integer newGrade, Long enrollmentId);
    boolean addGrade (Integer newGrade, Long enrollmentId);
}
