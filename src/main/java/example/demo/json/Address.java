package example.demo.json;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Address {
     String addresLine1;
     String addresLine2;
     String city;
     String state;
     String country;
     String postalCode;
}
