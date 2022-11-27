package model;
import lombok.Data;
import javax.persistence.*;


@Data
@Entity
@Table(name="user_credentials")
public class UserCredentials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private String username;
    private String password;
    private String emailAddress;
}
