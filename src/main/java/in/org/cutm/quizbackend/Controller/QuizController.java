package in.org.cutm.quizbackend.Controller;


import in.org.cutm.quizbackend.Entity.Questions;
import in.org.cutm.quizbackend.Entity.Quiz;
import in.org.cutm.quizbackend.Entity.QuizQuestion;
import in.org.cutm.quizbackend.Service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
@CrossOrigin(origins = "http://localhost:5173")
public class QuizController {
	private final QuizService quizService;

	public QuizController(QuizService quizService) {
		this.quizService = quizService;
	}

//  public Quiz createQuiz(@RequestBody Quiz quiz) {
//  return quizService.createQuiz(quiz);
//}

	@PostMapping
	public Quiz createQuiz(@RequestBody Quiz quiz) {
		List<QuizQuestion> quizQuestions = quiz.getQuizQuestions();
		for (QuizQuestion quizQuestion : quizQuestions) {
			quizQuestion.setQuiz(quiz); // Set the quiz for each quiz question
		}
		return quizService.createQuiz(quiz);
	}

	@GetMapping("/{id}")
	public Quiz getQuizById(@PathVariable Long id) {
		return quizService.getQuizById(id);
	}

	@PutMapping("/{id}")
	public Quiz updateQuiz(@PathVariable Long id, @RequestBody Quiz quiz) {
		return quizService.updateQuiz(id, quiz);
	}

	@DeleteMapping("/{id}")
	public void deleteQuiz(@PathVariable Long id) {
		quizService.deleteQuiz(id);
	}

	@GetMapping
	public List<Quiz> getAllQuizzes() {
		return quizService.getAllQuizzes();
	}

	@GetMapping("/getQuizQuestById/{id}")
	public List<Questions> getQuizQuestById(@PathVariable Long id){
		System.out.println("Inside Get Quiz quest by Id");
		return quizService.getQuizQuestById(id);
	}

}
