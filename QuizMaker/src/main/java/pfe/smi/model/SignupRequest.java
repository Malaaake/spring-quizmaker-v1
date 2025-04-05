package pfe.smi.model;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@EqualsAndHashCode(callSuper=false)                             //?

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter                                                          //? 

public class SignupRequest {
	 private String fullname;
	    private String username;
	    private String email;
	    private String password;

		}

