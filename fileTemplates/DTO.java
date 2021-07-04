#parse("Class Header.java")

import java.io.Serializable;
import lombok.*;

#parse("File Header.java")
@Data @Builder @NoArgsConstructor @AllArgsConstructor @ToString(callSuper = true)
public class ${NAME}DTO implements Serializable {

}