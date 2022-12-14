package com.example.myunidatabase.model;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Long userTypeId;
    private int isAdmin;
}
