package com.example.myunidatabase.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="classes")
public class UniClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long departmentId;
    private Long professorId;
}
