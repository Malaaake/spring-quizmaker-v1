package fac.pfe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import fac.pfe.model.Question;

public interface QuestionRepository  extends JpaRepository <Question, Long>{

	
}
