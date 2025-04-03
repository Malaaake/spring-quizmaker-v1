package fac.pfe.controller;



import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fac.pfe.model.Answer;
import fac.pfe.model.Question;
import fac.pfe.service.QuestionService;



@RestController
@RequestMapping
public class QuestionController {

@Autowired QuestionService questionService;
 
 
 @GetMapping ("questions")
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
 
  @GetMapping ("answers/{idQuestion}")
  public List<Answer>getAllAnswersByQuestion(@PathVariable Long idQuestion){
      return questionService.getAllAnswersByQuestion(idQuestion);
     }
     
 
    @PostMapping("answers/{idQuestion}")
    public Answer addAnswerToQuestion(@RequestBody Answer answer,@PathVariable Long idQuestion) {
    return questionService.addAnswerToQuestion(answer,idQuestion);
   }
    
}