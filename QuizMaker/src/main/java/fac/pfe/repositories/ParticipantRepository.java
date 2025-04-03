package fac.pfe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fac.pfe.model.Participant;
@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
