package model;

import lombok.Data;
import javax.persistence.*;
@Entity
@Data
@Table(name="enrollments")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Class enrollmentClass;
    private Student student;
    Integer grade;
}
