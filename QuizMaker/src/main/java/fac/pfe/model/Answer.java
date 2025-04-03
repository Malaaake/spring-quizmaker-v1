package fac.pfe.model;



import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor @NoArgsConstructor @Data                                                         

public class Answer {

	@Id
		Long id;
		String content;
		int timer;
	@ManyToOne
		Question question;
	@ManyToMany
		List<Participant> participants;

}
