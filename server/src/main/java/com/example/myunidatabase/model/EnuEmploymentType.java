package com.example.myunidatabase.model;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="enu_employment_type")
public class EnuEmploymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
