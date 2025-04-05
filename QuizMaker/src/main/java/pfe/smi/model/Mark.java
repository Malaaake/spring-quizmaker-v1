package pfe.smi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@EqualsAndHashCode(callSuper=false)                             //?

@AllArgsConstructor
@NoArgsConstructor
@Data                                                          //? 
@Entity

public class Mark {
@Id
Long id;
Long mark;
String feedback;
}
