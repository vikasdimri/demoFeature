package example.demo.parse.gtt;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Party {
    private String partyRoleCode;
    private Identification identification;
    private String name;
    private Address address;
}
