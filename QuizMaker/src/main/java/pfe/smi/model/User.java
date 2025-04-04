package pfe.smi.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Setter @Getter
@Entity
@Table(name = "users")
public class User {
	  

	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String fullname;

	    @Column(unique = true)
	    private String username;

	   
	    @Column(unique = true)
	    private String email;

	    private String password;
}
