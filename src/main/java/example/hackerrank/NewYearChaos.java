package example.hackerrank;

import java.util.Arrays;
import java.util.List;

public class NewYearChaos {

    public static void main(String[] args) {
            List<Integer> q = Arrays.asList(new Integer[]{5, 1, 2, 3, 7, 8, 6, 4});
        //  List<Integer> q = Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});

        minimumBribes(q);
    }

    public static void minimumBribes(List<Integer> q) {
        // System.out.println("Too chaotic");
        for (int i = 0; i < q.size(); i++) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println(q.get(i) - (i + 1));
                System.out.println("Too chaotic" + q.get(i));
            }

        }
    }
}
