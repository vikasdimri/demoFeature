package example.demo.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Place {
    String city;
    String state;
    String country;
}
