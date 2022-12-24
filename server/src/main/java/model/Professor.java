package model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name="professors")
public class Professor extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private User user;
}
