package fac.pfe.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fac.pfe.model.Creator;

@Repository
public interface CreatorRepository extends JpaRepository<Creator, Long>{

  Creator findByUsername(String username);

  Optional<Creator> findByEmail (String email);
  Boolean existsByEmail(String email);
 

}