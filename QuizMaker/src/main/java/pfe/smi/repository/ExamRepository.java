package pfe.smi.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pfe.smi.model.Answer;
import pfe.smi.model.Exam;
import pfe.smi.model.Question;

@Repository
public interface ExamRepository extends JpaRepository<Exam  , Long> {

	 @Query("SELECT e FROM Exam e WHERE e.creator.userName = :username")
		  List<Exam> findByCreatoruserName(@Param("username") String username);

	 @Query("SELECT q FROM Question q WHERE q.exam.id = :examId")
	    List<Question> findAllQuestionsByExamId(@Param("examId") Long examId);
		     
		     @Query("SELECT a FROM Answer a JOIN a.question q JOIN q.exam e WHERE e.id = :examId")
		     List<Answer> findAllAnswersByExamId(@Param("examId") Long examId);
		 
		 }
	 

