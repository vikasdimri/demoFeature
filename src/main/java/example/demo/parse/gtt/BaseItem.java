package example.demo.parse.gtt;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseItem {
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ItemIdentifier> itemIdentifier;
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Reference> reference;
    private String quantity;
    private String unitOfMeasureCode;
}
