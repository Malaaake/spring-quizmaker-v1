package pfe.smi.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@EqualsAndHashCode(callSuper=false)                             //?

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter                                                          //? 
@Entity
@Data
public class Creator {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)    
	 Long id ;
	 
	 String fullname;
	 String username;
	 @Column(unique=true)     
	 String email ;
	 
	 String password;
	 String photoUrl;
	 
	 @OneToMany(mappedBy = "creator")
	 @JsonIgnore
	 List<Exam> exams;
	 
	 
  }