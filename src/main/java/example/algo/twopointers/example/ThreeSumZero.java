package example.algo.twopointers.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)

The solution set must not contain duplicate triplets.
For example, given array S = {-1 0 1 2 -1 -4},
A solution set is:
  (-1, 0, 1)
  (-1, -1, 2)
* */
public class ThreeSumZero {

    public static void main(String[] args) {
        //int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        /*
        * The expected return value:
[-5 0 5 ] [-5 1 4 ] [-4 -1 5 ] [-4 0 4 ] [-4 1 3 ] [-3 -2 5 ] [-3 -1 4 ] [-3 0 3 ] [-2 -1 3 ] [-2 1 1 ] [-1 0 1 ] [0 0 0 ]
Your function returned the following:
[-5 0 5 ] [-5 1 4 ] [-5 1 4 ] [-4 1 3 ] [-2 1 1 ] [-2 1 1 ] [-1 0 1 ] [0 0 0 ]
        * */
        //int[] arr = new int[]{1, -4, 0, 0, 5, -5, 1, 0, -2, 4, -4, 1, -1, -4, 3, 4, -1, -1, -3};
        int[] arr = new int[]{2147483647, -2147483648, -2147483648, 0, 1};
        int[][] ints = threeSum(arr);
        Arrays.stream(ints).forEach(value -> {
            Arrays.stream(value).forEach(e -> System.out.print(e + ", "));
            System.out.println();
        });
    }

    public static int[][] threeSum(int[] arr) {
        arr = Arrays.stream(arr).sorted().toArray();
        //-2147483648, -2147483648, 0, 1, 2147483647
        Arrays.stream(arr).forEach(value -> System.out.print(value + ", "));
        System.out.println();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int ptr1 = i + 1;
            int ptr2 = arr.length - 1;
            while (ptr1 < ptr2) {
                long sum = (long)arr[i] + (long)arr[ptr1] + (long)arr[ptr2];
                if (sum == 0) {

                    List<Integer> element = new ArrayList<>();
                    element.add(arr[i]);
                    element.add(arr[ptr1]);
                    element.add(arr[ptr2]);
                    if (!result.contains(element)) {
                        result.add(element);
                    }
                    ptr2--;
                } else if (sum < 0) {
                    ptr1++;
                } else {
                    ptr2--;
                }
            }
        }
        return result.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

    }
}
