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

import pfe.smi.model.Exam;
import pfe.smi.model.Question;
import pfe.smi.service.ExamService;
@RestController
@CrossOrigin(origins="*")
public class ExamController {

    @Autowired ExamService examService;
    
    @GetMapping("exams")
    public List<Exam>getAllExams() {
      return examService.getAllExams();
    }

    @PostMapping("exam")
    public Exam addExam(@RequestBody Exam exam) {
      return  examService.addExam(exam);
    }
    
    @GetMapping("exams/{idExam}")
    public Optional<Exam> getExamById(@PathVariable Long idExam) {
      return examService.getExamById(idExam);
    }
    public Exam addExamToCreator(@RequestBody String userName , Exam exam) {
    	return examService.addExamToCreator(userName , exam);
    }
    public Question addQuestionToExam(Question question , Long idExam) {
    return examService.addQuestionToExam(question, idExam);
    }
public List<Exam> getAllExamByCreator(String userName) {
	    
	    return examService.getAllExamByCreator(userName);
	  }
    
    
    @DeleteMapping("exam/{idExam}")
    public void deleteExamById(@PathVariable Long idExam) {
      examService.deleteExamById(idExam);
    }
    //ANSWER////////////////////////////////////////////////////
    
    
    ///QUESTION/////////////////////////////////////////////////////
    
	
  
}
