package in.org.cutm.quizbackend.Service;

import in.org.cutm.quizbackend.Entity.Quizinfo;
import in.org.cutm.quizbackend.Repository.QuizRepository;
import in.org.cutm.quizbackend.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImpl implements QuizServices {

    private final QuizRepository quizRepository;
    @Autowired
    public QuizServiceImpl(QuizRepository quizRepository){
        this.quizRepository=quizRepository;
    }
    @Override
    public Quizinfo saveQuiz(Quizinfo qna) {
        return quizRepository.save(qna);
    }

    @Override
    public List<Quizinfo> getAllQuiz() {
        return quizRepository.findAll();
    }

    @Override
    public void deleteQuiz(long qid) {
        Optional<Quizinfo> qns = quizRepository.findById(qid);
        if(qns.isPresent()){
            quizRepository.deleteById(qid);
        }else{
            throw new ResourceNotFoundException("Question","id",qid);
        }
    }

    @Override
    public Quizinfo updateQuiz(Quizinfo prevQuizinfo, Long qid) {
        Quizinfo quizinfo = quizRepository.findById(qid).orElseThrow(()-> new ResourceNotFoundException("Question","id",qid));
        quizinfo.setQuestion(prevQuizinfo.getQuestion());
        quizinfo.setAnswer(prevQuizinfo.getAnswer());
        quizinfo.setCategory(prevQuizinfo.getCategory());
        quizRepository.save(quizinfo);
        return quizinfo;
    }

    @Override
    public Quizinfo getQuizInfoById(Long qid) {
        Optional<Quizinfo> quizinfo2 = quizRepository.findById(qid);
        if(quizinfo2.isPresent()){
            return quizinfo2.get();
        }else{
            throw new ResourceNotFoundException("Question","id",qid);
        }

    }
}

