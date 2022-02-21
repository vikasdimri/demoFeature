package example.demo.mix;

public class EnumExampleMain {

    public static void main(String[] args) {
        System.out.println(Source.getSource(null));
        System.out.println(Source.getSource(""));
        System.out.println(Source.getSource("abc"));
        System.out.println(Source.getSource("ShipmentGeofence"));
    }
}

enum Source {
    CLIENT("Client"),
    SHIPMENTGEOFENCE("ShipmentGeofence"),
    EQUIPMENTGEOFENCE("EntityGeofence");

    String value;

    Source(String key) {
        this.value = key;
    }

    public static Source getSource(String value) {
        for (Source source : Source.values()) {
            if (source.value.equalsIgnoreCase(value)) {
                return source;
            }
        }
        return null;
    }
}
