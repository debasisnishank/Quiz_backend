package in.org.cutm.quizbackend.Controller;


import in.org.cutm.quizbackend.Entity.Questions;
import in.org.cutm.quizbackend.Entity.UserAnswers;
import in.org.cutm.quizbackend.Entity.UserAnswersDto;
import in.org.cutm.quizbackend.Entity.Users;
import in.org.cutm.quizbackend.Repository.QuestionRepository;
import in.org.cutm.quizbackend.Repository.UserAnswerRepository;
import in.org.cutm.quizbackend.Repository.UserRepository;
import in.org.cutm.quizbackend.Service.UserAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-answers")
@CrossOrigin(origins = "http://localhost:3000")
public class UserAnswerController {
    private final UserAnswerService userAnswerService;
    
    @Autowired
    private UserRepository userRepository;


    @Autowired
    private QuestionRepository questionRepository;
    

    @Autowired
    private UserAnswerRepository userAnswerRepository;
    
    
    public UserAnswerController(UserAnswerService userAnswerService) {
        this.userAnswerService = userAnswerService;
    }


}
