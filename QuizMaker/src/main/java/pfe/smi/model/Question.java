package pfe.smi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor @NoArgsConstructor @Data                                                         

public class Question {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String text;
    
  @OneToMany(mappedBy="question")
  
    List<Answer> answer;
  @ManyToOne
  @JoinColumn(name = "exam_id")
  private
    Exam exam;

}
