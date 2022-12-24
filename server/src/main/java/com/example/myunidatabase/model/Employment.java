package com.example.myunidatabase.model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Data
@Table(name="employments")
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long professorId;
    private Long departmentId;
    private Long employmentTypeId;
}
