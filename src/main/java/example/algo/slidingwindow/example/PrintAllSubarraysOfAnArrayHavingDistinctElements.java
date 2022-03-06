package example.algo.slidingwindow.example;

import java.util.ArrayList;
import java.util.List;

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
        int[] A = {5, 2, 3, 5, 4, 3, 1, 1, 1, 1, 1, 3, 5, 8, 2,5,9,4,2,0,3};
        calculate(A);
    }

    public static void calculate(int[] arr) {
        int start = 0, end = 0;
        List<Integer> window = new ArrayList<>();
        for (int windowStart = 0, windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            int currentNumber = arr[windowEnd];
            window.add(currentNumber);
            if (window.stream().filter(e -> e == currentNumber).count() > 1) {
                start = windowStart;
                end = windowEnd - 1;
                int indexOf = window.indexOf(currentNumber);
                for (int i = 0; i <= indexOf; i++) {
                    window.remove(0);
                    windowStart++;
                }
                printSubarray(start, end, arr);
            }
            if (windowEnd == arr.length - 1) {
                start = windowStart;
                end = windowEnd;
                printSubarray(start, end, arr);
            }
        }
    }

    private static void printSubarray(int start, int end, int[] arr) {
        StringBuilder sb = new StringBuilder("[" + start + ":" + end + "]");
        sb.append(" {");
        for (int i = start; i <= end; i++) {
            sb.append(" ").append(arr[i]);
        }
        sb.append("}");
        System.out.println(sb.toString());
    }
}
