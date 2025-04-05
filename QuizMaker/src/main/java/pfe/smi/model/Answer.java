package pfe.smi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@EqualsAndHashCode(callSuper=false)                             //?

@AllArgsConstructor
@NoArgsConstructor
@Data                                                          //? 
@Entity

public class Answer {
@Id
Long id;
String content;
Integer timer;
@ManyToOne
@JoinColumn(name = "question_id")  
Question question;
@ManyToMany
List<Participant> participants;
@ManyToOne
@JoinColumn(name = "exam_id")
private Exam exam;
}
