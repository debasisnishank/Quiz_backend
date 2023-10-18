package in.org.cutm.quizbackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "faculty_info")
public class Facultyinfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer facultyid;
    private String facultyName;
    private String facultyPassword;
    private String facultyEmail;
}
