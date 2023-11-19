package in.org.cutm.quizbackend.Repository;


import in.org.cutm.quizbackend.Entity.Quiz;
import in.org.cutm.quizbackend.Entity.QuizQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long> {
    // Custom methods for quiz question-related operations
	public List<QuizQuestion> findByQuiz(Quiz quiz);
}
