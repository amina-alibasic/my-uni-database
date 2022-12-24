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
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Column(name = "department_id")
    public Long getDepartmenId() {
        return departmentId;
    }
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
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


    private Long userId;


    private Long departmentId;


    private Long enuDegreeTypeId;

}
