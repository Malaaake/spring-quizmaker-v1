package pfe.smi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import pfe.smi.model.Creator;
import pfe.smi.repository.CreatorRepository;
import pfe.smi.repository.ExamRepository;
import pfe.smi.repository.QuestionRepository;
@Service
public class CreatorService {
	@Autowired 
	CreatorRepository creatorRepository;
	@Autowired
	QuestionRepository questionRepository;

	public List<Creator>getAllCreators(){
		return creatorRepository.findAll();
	}

	public Creator addCreator(@RequestBody Creator Creator) {
		return creatorRepository.save(Creator);
	}

	public Optional<Creator> getCreatorById(Long id){
		return creatorRepository.findById(id);
	}
	
	public void deleteCreatorById(Long id){
		creatorRepository.deleteById(id);
	}
	 @Autowired ExamRepository examRepository;
	  
	  public Creator updateCreator(Creator creator) {
		  return creatorRepository.save(creator);}
	  
	  
	public Creator save(Creator creator) {
		return creatorRepository.save(creator);
	}

}
