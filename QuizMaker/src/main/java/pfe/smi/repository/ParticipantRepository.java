package pfe.smi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.smi.model.Creator;
import pfe.smi.model.Exam;
import pfe.smi.model.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
	
    List<Participant> findAll();
}
