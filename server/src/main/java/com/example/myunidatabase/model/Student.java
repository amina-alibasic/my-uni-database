package com.example.myunidatabase.model;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="students")
public class Student {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "user_id")
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "department_id")
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    @Column(name = "degree_type_id")
    public Long getEnuDegreeTypeId() {
        return enuDegreeTypeId;
    }
    public void setEnuDegreeTypeId(Long enuDegreeTypeId) {
        this.enuDegreeTypeId = enuDegreeTypeId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private User user;


    private Department department;


    private Long enuDegreeTypeId;

}
