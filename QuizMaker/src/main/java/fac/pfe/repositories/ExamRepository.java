package fac.pfe.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fac.pfe.model.Answer;
import fac.pfe.model.Exam;
import fac.pfe.model.Question;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long>{
 

  List<Exam> findByCreator_Username(String username);

  
  
  
  @Query("SELECT q FROM Question q WHERE q.exam.id = :idExam")
  List<Question> findAllQuestionsByExamId(@Param("idExam") Long idExam);

  @Query("SELECT a FROM Answer a JOIN a.question q WHERE q.exam.id = :idExam")
  List<Answer> findAllAnswersByExamId(@Param("idExam") Long idExam);

     
     
    
 }

