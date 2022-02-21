package example.demo.parse.gtt;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class OrderItem {
    private String itemKey;
    private BaseItem baseItem;
    private OriginLocation originLocation;
    private OriginGatewayLocation originGatewayLocation;
    private DestinationLocation destinationLocation;
    private DestinationGatewayLocation destinationGatewayLocation;
}
