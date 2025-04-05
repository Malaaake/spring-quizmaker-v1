package pfe.smi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pfe.smi.model.Answer;
import pfe.smi.service.AnswerService;
@RestController
@CrossOrigin(origins="*")
public class AnswerController {
	@Autowired
    AnswerService answerService;
    @GetMapping ("Answers")
    public List<Answer>getAllAnswers(){
      return answerService.getAllAnswers();
    }
    @PostMapping("answers")
    public Answer addAnswer(@RequestBody Answer answer) {
      return answerService.addAnswer(answer);
    }
    @GetMapping("answers/{id}")
    public Optional<Answer> getAnswerById(@PathVariable Long id) {
      return answerService.getAnswerById(id);
    }
    @DeleteMapping("answers/{id}")
      public void deleteAnswerById(@PathVariable Long id) {
      answerService.deleteAnswerById(id);
    }
}

