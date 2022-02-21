package example.demo.parse.gtt;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class OriginGatewayLocation {
    private String name;
    private String longName;
    private Address address;
}
