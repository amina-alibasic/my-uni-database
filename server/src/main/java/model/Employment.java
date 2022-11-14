package model;

import lombok.Data;
import javax.persistence.*;
@Entity
@Data
@Table(name="employments")
public class Employment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Professor professor;
    private Department department;
    private EnuEmploymentType employmentType;
}
