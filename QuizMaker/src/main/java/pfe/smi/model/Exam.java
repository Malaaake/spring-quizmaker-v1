package pfe.smi.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@EqualsAndHashCode(callSuper=false)                             //?

@AllArgsConstructor
@NoArgsConstructor

@Setter @Getter
@Entity
public class Exam {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

	Long id;
	String title;
	Integer duration;
	String description;
	Float passingScore;
	


	@ManyToOne
	  @JoinColumn(name = "creator_id")
	Creator creator;
	 public void  setCreator(Creator creator) {
	        this.creator= creator;
	    }
	@OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Question> questions;

    @OneToMany(mappedBy = "exam", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Answer> answers;
}
