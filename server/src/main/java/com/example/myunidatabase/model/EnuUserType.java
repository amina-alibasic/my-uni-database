package com.example.myunidatabase.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="enu_user_type")
public class EnuUserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String shortCode;
    private String description;
}
