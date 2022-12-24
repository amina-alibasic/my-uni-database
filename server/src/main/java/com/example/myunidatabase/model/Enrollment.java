package com.example.myunidatabase.model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name="enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long classId;
    private Long studentId;
    Integer grade;
}
