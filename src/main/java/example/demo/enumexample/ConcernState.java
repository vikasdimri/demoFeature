package example.demo.enumexample;

public enum ConcernState {
    Open("Open"),
    Closed("Closed"),
    Pending("Open"),
    Closed_Not_Repaired("Closed"),
    Incomplete_Repair("Open");

    private String value;

    private String getValue() {
        return value;
    }

    private ConcernState(String value) {
        this.value = value;
    }

    public static String getConcernState(String state) {
        ConcernState[] concernStates = ConcernState.values();
        String stateValue = "";

        for (ConcernState concernState : concernStates) {
            if (state.equalsIgnoreCase(concernState.name())) {
                stateValue = concernState.getValue();
            }
        }
        return stateValue;
    }
}


class mainExample {
    public static void main(String[] args) {
        String state = ConcernState.getConcernState("Pending");
        System.out.println("result :: "+state);
    }
}