package pfe.smi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import pfe.smi.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
  
 
   
    List<Answer> findAll();
 List<Answer>   findAllAnswersByQuestionId(Long idQuestion);
}
