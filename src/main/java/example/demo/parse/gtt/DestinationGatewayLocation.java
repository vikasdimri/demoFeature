package example.demo.parse.gtt;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class DestinationGatewayLocation {
    private String name;
    private String longName;
    private Address address;
}
