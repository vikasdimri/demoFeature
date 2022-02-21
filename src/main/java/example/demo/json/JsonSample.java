package example.demo.json;

import lombok.*;

import java.io.Serializable;
import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class JsonSample implements Serializable {
     String firstName;
     String lastName;
     Set<String> address= new HashSet<String>();
}
