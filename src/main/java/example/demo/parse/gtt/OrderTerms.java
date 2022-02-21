package example.demo.parse.gtt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class OrderTerms {
    OrderDate orderDate;
    @JacksonXmlElementWrapper(useWrapping = false)
    List<Reference> reference;
    private String shipmentMethodCode;
}
