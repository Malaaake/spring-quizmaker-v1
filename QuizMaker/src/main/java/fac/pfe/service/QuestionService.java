package fac.pfe.service;



import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fac.pfe.model.Answer;

import fac.pfe.model.Question;
import fac.pfe.repositories.AnswerRepository;
import fac.pfe.repositories.QuestionRepository;


@Service
public class QuestionService {

 @Autowired QuestionRepository questionRepository;
 @Autowired AnswerRepository answerRepository;
 

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
 
  public List<Answer>getAllAnswersByQuestion(Long idQuestion) {
      return answerRepository.findAllAnswersByQuestionId(idQuestion);
    }
    
 
 public Answer addAnswerToQuestion (Answer answer , Long idQuestion) {
  Optional<Question> question=questionRepository.findById(idQuestion);
  answer.setQuestion(question.get());
  return answerRepository.save(answer);
 }

}