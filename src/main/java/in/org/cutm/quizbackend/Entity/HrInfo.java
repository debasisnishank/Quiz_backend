package in.org.cutm.quizbackend.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hr_info")
public class HrInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hrid;
    private String hrName;
    private String hrPassword;
    private String hrEmail;


}
