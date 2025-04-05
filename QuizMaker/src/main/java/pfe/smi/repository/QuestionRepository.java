package pfe.smi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import pfe.smi.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{
    
  
    List<Question> findAll();
;
}
