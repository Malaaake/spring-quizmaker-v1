package pfe.smi.controller;

import org.springframework.http.MediaType;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.nio.file.Path;
import pfe.smi.model.Exam;
import pfe.smi.model.Creator;
import pfe.smi.service.ExamService;
import pfe.smi.service.CreatorService;
@RestController
@CrossOrigin(origins="*")
@RequestMapping
public class CreatorController{

	@Autowired CreatorService creatorService;
	 @Autowired ExamService examService;
	 
	 
	 
	 @GetMapping ("creators")
	 public List<Creator>getAllCreators(){
	  return creatorService.getAllCreators();
	 }
	 @PostMapping("creators")
	 public Creator addCreator(
	  @RequestParam Long id,
	  @RequestParam String fullname,
	  @RequestParam String username,
	  @RequestParam  String email,
	  @RequestParam  String password,
	  @RequestParam MultipartFile file)
	 throws IllegalStateException, IOException, InterruptedException{
	  String path="src/main/resources/static/photos/"+id+".png";
	  file.transferTo(Path.of(path));
	  String url="http://localhost:8080/photos/"+id;
	  Creator creator= new Creator(id,fullname,username,email,password,url,null);
	   return creatorService.addCreator(creator);
	 }
	 
	 /*@GetMapping("creators/{id}")
	 public Optional<Creator> getCreatorById(@PathVariable Long id) {
	  return creatorService.getCreatorById(id);
	 }
	 */
	 
	 @GetMapping("/photos/{id}")
	 public ResponseEntity<Resource> getImage(@PathVariable String id ){
	  String path="src/main/resources/static/photos/"+id+".png";
	  FileSystemResource file =new FileSystemResource (path);
	  if (!file.exists()) {
	   return ResponseEntity.notFound().build();
	  
	  }
	  return ResponseEntity.ok()
	    .contentType(MediaType.IMAGE_PNG)
	    .body(file);
	 }
	 

	 @DeleteMapping("creators/{id}")
	  public void deleteCreatorById(@PathVariable Long id) {
	  String path="src/main/resources/static/photos/"+id+".png";
	  File f=new File(path);
	  if (f.exists())f.delete();
	 creatorService.deleteCreatorById(id);
	}
	 
	 @PutMapping ("creators")
	 public Creator updateCreator(@RequestBody Creator creator) {
	  return creatorService.updateCreator(creator);
	 }
	 
	 //get all Exam by creator
	 @GetMapping("exams/creator")
	  public List<Exam> getAllExamByCreator(@PathVariable String nameCreator){
	  return examService.getAllExamByCreator(nameCreator);
	  }


}