package fac.pfe.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fac.pfe.model.Exam;
import fac.pfe.model.Question;
import fac.pfe.repositories.AnswerRepository;
import fac.pfe.repositories.CreatorRepository;
import fac.pfe.repositories.ExamRepository;
import fac.pfe.repositories.QuestionRepository;

@Service
public class ExamService {

 @Autowired ExamRepository examRepository;
@Autowired CreatorRepository creatorRepository;
@Autowired QuestionRepository questionRepository;
@Autowired AnswerRepository answerRepository; 

 public List<Exam>getAllExams() {
  return examRepository.findAll();
 }

 public Exam addExam(Exam exam) {
  return examRepository.save(exam);
 }
 
 public Optional<Exam> getExamById(Long id) {
  return examRepository.findById(id);
 }

 public void deleteExamById(Long id) {
  examRepository.deleteById(id);
  
 }

 public List<Exam> getAllExamByCreator(String userNameCreator) {
  return examRepository.findByCreator_Username(userNameCreator);
 }

 public Exam addExamToCreator(String username, Exam exam) {
  exam.setCreator(creatorRepository.findByUsername(username));
  examRepository.save(exam);
  return exam;
 }
  
  public List<Question>getAllQuestionsByExam(Long idExam) {
      return examRepository.findAllQuestionsByExamId(idExam);
    }
    
 
 public Question addQuestionToExam (Question question , Long idExam) {
  Optional<Exam> exam=examRepository.findById(idExam);
  question.setExam(exam.get());
  return questionRepository.save(question);
 }

 
 

}