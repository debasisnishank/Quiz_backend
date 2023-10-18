package in.org.cutm.quizbackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "admin_info")
public class AdminInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;
    private String adminName;
    private String adminPassword;
    private String adminEmail;
}
