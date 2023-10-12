package in.org.cutm.quizbackend.Service;

import in.org.cutm.quizbackend.Entity.Quizinfo;

import java.util.List;

public interface QuizServices {

    //insert question and answer
    Quizinfo saveQuiz(Quizinfo qna);

    //Get the all quiz's questiono
    List<Quizinfo> getAllQuiz();


    //Delete qna
    void deleteQuiz(long qid);

    //updating existed quiz info
    Quizinfo updateQuiz(Quizinfo qna,Long qid);


    //Get quiz info by id
    Quizinfo getQuizInfoById(Long qid);

}
