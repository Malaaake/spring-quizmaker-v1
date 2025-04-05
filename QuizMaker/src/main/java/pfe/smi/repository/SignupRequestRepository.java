package pfe.smi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.smi.model.User;

public interface SignupRequestRepository extends JpaRepository<User, Long>  {

	    Optional<User> getfullname(String fullname);
	    Optional<User> getusername(String username);
	    Optional<User> getEmail(String email);

}
