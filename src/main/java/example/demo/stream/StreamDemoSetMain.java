package example.demo.stream;

import java.util.*;

public class StreamDemoSetMain {
    public static void main(String[] args) {
        System.out.println("<====================Set======================>");
        setDemo();
    }

    private static void setDemo() {
        Set<String> items = new HashSet<>();
        items.add("A");
        items.add("B");
        items.add("A");
        items.add("C");
        items.add("D");
        items.add("E");
        items.add("F");
        items.add("G");
        items.add("H");

        System.out.println("Stream :: ");
        items.stream().forEach(e -> {
            System.out.println("Elements :: " + e);
        });

        System.out.println("forEach :: ");
        items.forEach(v -> {
            System.out.println("Elements :: " + v);
        });
    }
}
