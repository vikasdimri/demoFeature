package example.demo.parse.gtt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Reference {
    @JacksonXmlProperty(localName = "type")
    private String type;

    @JacksonXmlProperty(localName = "value")
    private String value;

}
