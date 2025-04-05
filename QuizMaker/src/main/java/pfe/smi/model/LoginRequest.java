package pfe.smi.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@EqualsAndHashCode(callSuper=false)                             //?

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter                                                          //? 

public class LoginRequest {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 private String email; 
	 private String password;
}
