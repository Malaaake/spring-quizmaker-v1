package fac.pfe.model;

import java.util.List;

import jakarta.persistence.Entity;
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
	    private Long id;
	    
	    private String text;
	    
	    @OneToMany(mappedBy="question")
	    private List<Answer> answers;
	    
	    @ManyToOne
	    @JoinColumn(name = "exam_id")
	    private Exam exam;

}
