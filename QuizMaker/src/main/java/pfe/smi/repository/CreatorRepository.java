package pfe.smi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.smi.model.Creator;

public interface CreatorRepository extends JpaRepository<Creator, Long>{
	Creator findByusername(String username);
    boolean existsByusername(String username);
    boolean existsByEmail(String email);
    Optional<Creator> findByEmail (String email);
    List<Creator> findAll();
    
}
