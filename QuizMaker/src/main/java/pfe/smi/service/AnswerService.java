package pfe.smi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pfe.smi.model.Answer;
import pfe.smi.repository.AnswerRepository;

@Service
public class AnswerService {
	  @Autowired AnswerRepository answerRepository;
	  
	  public List<Answer>getAllAnswers(){
	    return answerRepository.findAll();
	  }

	  public Answer addAnswer(Answer answer) {
	    return answerRepository.save(answer);
	  }

	  public Optional<Answer> getAnswerById(Long id){
	    return answerRepository.findById(id);
	  }
	  
	  public void deleteAnswerById(Long id){
	    answerRepository.deleteById(id);
	  }
}
