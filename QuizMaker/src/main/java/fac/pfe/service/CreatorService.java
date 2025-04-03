package fac.pfe.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fac.pfe.model.Creator;
import fac.pfe.repositories.CreatorRepository;

@Service
public class CreatorService {

 
@Autowired CreatorRepository creatorRepository;

 public List<Creator>getAllCreators(){
  return creatorRepository.findAll();
 }

 public Creator addCreator(Creator creator) {
  return creatorRepository.save(creator);
 }

 public Optional<Creator> getCreatorById(Long id){
  return creatorRepository.findById(id);
 }
 
 public void deleteCreatorById(Long id){
  creatorRepository.deleteById(id);
 }

 public Creator updateCreator(Creator creator) {
  return creatorRepository.save(creator);
 }
 

}














