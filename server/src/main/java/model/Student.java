package model;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private User user;

    @Column(name = "department_id")
    private Department department;

    @Column(name = "degree_type_id")
    private Long enuDegreeTypeId;

}
