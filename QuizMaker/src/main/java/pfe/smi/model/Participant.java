package pfe.smi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@EqualsAndHashCode(callSuper=false)                            //?

@AllArgsConstructor
@NoArgsConstructor
@Data                                                          //? 
@Entity
public class Participant {

      @Id
      Long id;
    String fullName;
    String CIN;
    
    @ManyToMany
    List<Answer>  answers;
  }
