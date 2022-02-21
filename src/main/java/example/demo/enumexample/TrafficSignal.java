package example.demo.enumexample;

public enum TrafficSignal {
    // This will call enum constructor with one
    // String argument
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

    // declaring private variable for getting values
    private String action;

    // getter method
    public String getAction() {
        return this.action;
    }

    // enum constructor - cannot be public or protected
    private TrafficSignal(String action) {
        this.action = action;
    }

    public static String getDetails(String reqSignal) {

        TrafficSignal[] signals = TrafficSignal.values();
        String action = "";
        for (TrafficSignal signal : signals) {
            // use getter method to get the value
            System.out.println("name : " + signal.name() +
                    " action: " + signal.getAction() );
            if (reqSignal.equalsIgnoreCase(signal.name())) {
                action = signal.getAction();
            }
        }
        return action;
    }
}


class EnumConstructorExample {
    public static void main(String args[]) {
        System.out.println("result :: " + TrafficSignal.getDetails("RED"));
    }
}