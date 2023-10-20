package in.org.cutm.quizbackend.Repository;

import in.org.cutm.quizbackend.Entity.Facultyinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Facultyinfo,Integer> {
}
