package example.demo.stream;

import java.util.*;

public class StreamDemoListMain {
    public static void main(String[] args) {
        System.out.println("<====================List======================>");
        //listDemo();
        listFlatmapDemo();
    }

    private static void listFlatmapDemo() {
        List<Integer> list1 = Arrays.asList(4, 5, 7);
        List<Integer> list2 = Arrays.asList(3, 6, 8);
        List<Integer> list3 = Arrays.asList(2, 9, 1);

        List<List<Integer>> listOfList = Arrays.asList(list1, list2, list3);
        System.out.println("Before flat :: " + listOfList);


    }


    private static void listDemo() {
        List<String> items = new ArrayList<>();
        items.add("A");
        items.add("B");
        items.add("C");
        items.add("D");
        items.add("E");

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
