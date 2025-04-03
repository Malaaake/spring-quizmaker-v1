package fac.pfe.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fac.pfe.model.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

 List<Answer> findAllAnswersByQuestionId(Long idQuestion);

}
