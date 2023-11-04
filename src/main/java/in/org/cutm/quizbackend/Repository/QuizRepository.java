package in.org.cutm.quizbackend.Repository;
import in.org.cutm.quizbackend.Entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    // Custom methods for quiz-related operations
}