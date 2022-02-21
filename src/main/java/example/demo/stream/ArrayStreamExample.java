package example.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStreamExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(list);

        List<Integer> collect = list.stream().filter(e -> e < 5).collect(Collectors.toList());

        List<Integer> newList =new ArrayList<>();
        for (Integer e:list) {
            if(e<5){
                newList.add(e);
            }

        }
        System.out.println(newList);
        System.out.println(collect);





    }


}
