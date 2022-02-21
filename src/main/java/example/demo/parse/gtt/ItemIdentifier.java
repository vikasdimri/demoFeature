package example.demo.parse.gtt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class ItemIdentifier {
    @JacksonXmlProperty(localName = "itemIdentifierTypeCode")
    private String itemIdentifierTypeCode;
    @JacksonXmlProperty(localName = "itemIdentifierValue")
    private String itemIdentifierValue;

}
