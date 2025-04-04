package pfe.smi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.smi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
}

