package example.demo.parse.gtt;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class OrderDetail {
    private String messageFunctionCode;
    private String poNumber;
    private String orderFunctionCode;
    OrderTerms orderTerms;
    @JacksonXmlElementWrapper(useWrapping = false)
    List<Party> party;
    OrderItem orderItem;
}