package in.org.cutm.quizbackend.Controller;

import in.org.cutm.quizbackend.Entity.Quizinfo;
import in.org.cutm.quizbackend.Service.QuizServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizController {
    private QuizServices quizServices;
    @Autowired
    public QuizController(QuizServices quizServices){
        this.quizServices=quizServices;
    }
    //save quiz
    @PostMapping("/cutm/quizes")
    public ResponseEntity<Quizinfo> saveQuizDetails(@RequestBody Quizinfo quizinfo){
        return
                new ResponseEntity<Quizinfo>(quizServices.saveQuiz(quizinfo), HttpStatus.CREATED);
    }

    //Get quiz
    @GetMapping("/cutm/getquizes")
    public List<Quizinfo> getAllQuiz(){
        return quizServices.getAllQuiz();
    }

    //get quiz by id
    @GetMapping("/cutm/getquiz/{qid}")
    public Quizinfo getQuizById(@PathVariable("qid") Long id){
        return
        quizServices.getQuizInfoById(id);
    }

    //Update the quiz  info
    @PutMapping("/cutm/quiz/{qid}")
    public ResponseEntity<String> updateQuizinfo(@RequestBody Quizinfo quizinfo,@PathVariable("qid") Long qid){
        quizServices.updateQuiz(quizinfo,qid);
        return new ResponseEntity<String>("Quiz information updated",HttpStatus.NOT_FOUND);
    }

    //delete quiz by id
    @DeleteMapping("/cutm/quiz/{qid}")
    public ResponseEntity<String> deleteQuiz(@PathVariable("qid") Long qid){
        quizServices.deleteQuiz(qid);
        return ResponseEntity.ok("Quizid" +qid+ " deleted successfully");
    }


}
