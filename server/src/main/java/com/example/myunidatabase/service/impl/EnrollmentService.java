package com.example.myunidatabase.service.impl;

import com.example.myunidatabase.model.Enrollment;
import com.example.myunidatabase.service.IEnrollmentService;

public class EnrollmentService implements IEnrollmentService {
    @Override
    public Enrollment addNewEnrollment(Enrollment enrollment) {
        return null;
    }

    @Override
    public boolean deleteEnrollment(Long enrollmentId) {
        return false;
    }

    @Override
    public boolean updateEnrollmentClass(Long enrollmentId) {
        return false;
    }

    @Override
    public boolean updateEnrollmentStudent(Long enrollmentId) {
        return false;
    }

    @Override
    public boolean editGrade(Integer newGrade, Long enrollmentId) {
        return false;
    }

    @Override
    public boolean addGrade(Integer newGrade, Long enrollmentId) {
        return false;
    }
}
