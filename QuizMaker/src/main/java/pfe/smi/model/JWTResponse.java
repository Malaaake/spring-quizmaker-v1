package pfe.smi.model;
import java.util.List;



import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class JWTResponse {
    private String token;
    private String type = "Bearer";  // Default value
    private String username;
    private String email;
    private List<String> roles;
}