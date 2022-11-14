package model;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name="classes")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Department department;
    private Professor professor;
}
