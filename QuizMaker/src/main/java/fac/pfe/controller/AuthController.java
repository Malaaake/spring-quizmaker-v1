package fac.pfe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fac.pfe.model.Creator;
import fac.pfe.repositories.CreatorRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")  
public class AuthController {

    @Autowired
    private CreatorRepository creatorRepository;

    @PostMapping("/signup")
    public ResponseEntity<String> registerUser(
            @RequestParam("fullname") String fullname,
            @RequestParam("username") String username,
            @RequestParam("email") String email,
            @RequestParam("password") String password) {
        
        if (creatorRepository.findByEmail(email).isPresent()) {
            return ResponseEntity.badRequest().body("Email already exists");
        }
        
        Creator creator = new Creator();
        creator.setFullname(fullname);
        creator.setUsername(username);
        creator.setEmail(email);
        creator.setPassword(password);
        
        creatorRepository.save(creator);
        return ResponseEntity.ok("creator registered successfully");
    }


    
}












