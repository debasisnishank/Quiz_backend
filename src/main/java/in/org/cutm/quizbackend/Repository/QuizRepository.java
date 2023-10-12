package in.org.cutm.quizbackend.Repository;

import in.org.cutm.quizbackend.Entity.Quizinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quizinfo,Long> {

}
