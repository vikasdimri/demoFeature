package example.demo.xtream;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@XStreamAlias("sample")
public class XtreamXmlSample2 {
     String firstName;
     String lastName;
     Set<String> address= new HashSet<String>();
}
