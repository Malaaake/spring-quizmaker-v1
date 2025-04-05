package pfe.smi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.smi.model.Answer;
import pfe.smi.model.Question;
import pfe.smi.repository.AnswerRepository;
import pfe.smi.repository.QuestionRepository;

@Service
public class QuestionService {
	 @Autowired QuestionRepository questionRepository;
	  
	  public List<Question>getAllQuestions(){
	    return questionRepository.findAll();
	  }

	  public Question addQuestion(Question question) {
	    return questionRepository.save(question);
	  }

	  public Optional<Question> getQuestionById(Long id){
	    return questionRepository.findById(id);
	  }
	  
	  public void deleteQuestionById(Long id){
	    questionRepository.deleteById(id);
	  }
	  @Autowired AnswerRepository answerRepository;
	  public Answer addAnswerToQuestion(Answer answer , Long id) {
		    Optional<Question> question=questionRepository.findById(id);
		    ((Answer) questionRepository).setQuestion(question.get());
		    return answerRepository.save(answer);
	  
}
	  public List<Answer> getAllAnswersByQuestion(Long idQuestion){
		  return answerRepository.findAllAnswersByQuestionId(idQuestion);
	  }
}
