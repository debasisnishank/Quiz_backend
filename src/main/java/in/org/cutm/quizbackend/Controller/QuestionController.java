package in.org.cutm.quizbackend.Controller;


import in.org.cutm.quizbackend.Entity.Questions;
import in.org.cutm.quizbackend.Service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
@CrossOrigin(origins = "http://localhost:5173")
public class QuestionController {
    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/addquestion")
    public Questions createQuestion(@RequestBody Questions question) {
        return questionService.createQuestion(question);
    }

    @GetMapping("/{id}")
    public Questions getQuestionById(@PathVariable Long id) {
        return questionService.getQuestionById(id);
    }

    @PutMapping("/{id}")
    public Questions updateQuestion(@PathVariable Long id, @RequestBody Questions question) {
        return questionService.updateQuestion(id, question);
    }

    @DeleteMapping("/{id}")
    public void deleteQuestion(@PathVariable Long id) {
        System.out.println("ID"+id);
        questionService.deleteQuestion(id);
    }

    @GetMapping("/getAllQuestion")
    public List<Questions> getAllQuestions() {
        System.out.println("Inside Get all question");
        return questionService.getAllQuestions();
    }
}
