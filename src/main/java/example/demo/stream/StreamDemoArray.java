package example.demo.stream;

import java.util.Arrays;

public class StreamDemoArray {
    public static void main(String[] args) {
        Arrays.stream(new int[] {2,4,6,8,11})
                .map(x->x*x).forEach(System.out::println);
    }
}
