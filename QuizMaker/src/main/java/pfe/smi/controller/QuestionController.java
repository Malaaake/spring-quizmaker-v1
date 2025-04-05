package pfe.smi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pfe.smi.model.Answer;
import pfe.smi.model.Question;
import pfe.smi.service.QuestionService;
@RestController
@CrossOrigin(origins="*")
public class QuestionController {
	@Autowired QuestionService questionService;
	@GetMapping ("answers/{idQuestion}")
	  public List<Answer>getAllAnswersByQuestion(@PathVariable Long idQuestion){
	      return questionService.getAllAnswersByQuestion(idQuestion);
	     }
	     
	 
	    @PostMapping("answers/{idQuestion}")
	    public Answer addAnswerToQuestion(@RequestBody Answer answer,@PathVariable Long idQuestion) {
	    return questionService.addAnswerToQuestion(answer,idQuestion);
	   }
	   
		@GetMapping ("Questions")
		public List<Question>getAllQuestions(){
		  return questionService.getAllQuestions();
		}
		@PostMapping("questions")
		public Question addQuestion(@RequestBody Question question) {
		  return questionService.addQuestion(question);
		}
		@GetMapping("questions/{id}")
		public Optional<Question> getQuestionById(@PathVariable Long id) {
		  return questionService.getQuestionById(id);
		}
		@DeleteMapping("questions/{id}")
		  public void deleteQuestionById(@PathVariable Long id) {
		  questionService.deleteQuestionById(id);
		}
}
