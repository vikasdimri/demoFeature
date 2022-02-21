package example.demo.parse.gtt;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class OrderDate {
    private String orderDateTypeCode;
    private String orderDateValue;
}
