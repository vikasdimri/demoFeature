package example.demo.parse.gtt;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Builder
@AllArgsConstructor
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String stateOrProvince;
    private String postalCodeNumber;
    private String countryCode;
    private String locationQualifierCode;
    private String locationCode;
}
