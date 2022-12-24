package com.example.myunidatabase.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="departments")
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long headOfDepartment;

}
