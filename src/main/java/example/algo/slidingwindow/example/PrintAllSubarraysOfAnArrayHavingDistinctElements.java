package example.algo.slidingwindow.example;

import java.util.*;

/*
* Given an integer array, print all maximum size subarrays having all
* distinct elements in them.

For example,

Input:  A[] = { 5, 2, 3, 5, 4, 3 }

Output: The largest subarrays with all distinct elements are:

{ 5, 2, 3 }
{ 2, 3, 5, 4 }
{ 5, 4, 3 }
* */
public class PrintAllSubarraysOfAnArrayHavingDistinctElements {
    public static void main(String[] args) {
        int[] A = {5, 2, 3, 5, 4, 3};
        calculate(A);
    }

    public static void calculate2(int[] arr) {
        List<Integer> window = new ArrayList<>();
        int start = 0, end = 0;
        for (int windowStart = 0, windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            int currentElement = arr[windowEnd];
            window.add(currentElement);
            if (window.stream().filter(e -> currentElement == e).count() > 1) {
                for (int i = windowStart; i == 0; i--) {
                    window.remove(windowStart);
                }
                Arrays.stream(Arrays.copyOfRange(arr, windowStart, windowEnd)).forEach(System.out::print);
                System.out.println();
                windowStart++;
            }
        }
    }

}
