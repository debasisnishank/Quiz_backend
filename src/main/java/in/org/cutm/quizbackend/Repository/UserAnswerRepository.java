package in.org.cutm.quizbackend.Repository;

import in.org.cutm.quizbackend.Entity.UserAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswers, Long> {    
}
