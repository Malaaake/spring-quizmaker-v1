package pfe.smi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import pfe.smi.model.Role;
import pfe.smi.model.ERole;

public interface RoleRepository  extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}


