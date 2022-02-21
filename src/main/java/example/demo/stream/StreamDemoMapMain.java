package example.demo.stream;

import java.util.*;

public class StreamDemoMapMain {
    public static void main(String[] args) {
        System.out.println("<====================Map======================>");
        mapDemo();
    }

    private static void mapDemo() {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        System.out.println("Stream :: ");
        items.entrySet().stream().forEach(e -> {
            System.out.println("Key : " + e.getKey() + " :: value : " + e.getValue());
        });
        System.out.println("forEach :: ");
        items.forEach((k, v) -> {
            System.out.println("Key : " + k + " :: value : " + v);
        });
    }
}
