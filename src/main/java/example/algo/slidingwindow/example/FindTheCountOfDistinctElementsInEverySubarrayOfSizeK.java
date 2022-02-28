package example.algo.slidingwindow.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
* Given an array and an integer k, find the count of distinct elements in every subarray of size k.

For example,

Input:

arr[] = { 2, 1, 2, 3, 2, 1, 4, 5 };
k = 5;

Output:

The count of distinct elements in subarray { 2, 1, 2, 3, 2 } is 3
The count of distinct elements in subarray { 1, 2, 3, 2, 1 } is 3
The count of distinct elements in subarray { 2, 3, 2, 1, 4 } is 4
The count of distinct elements in subarray { 3, 2, 1, 4, 5 } is 5
* */
public class FindTheCountOfDistinctElementsInEverySubarrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 2, 1, 4, 5};
        int k = 5;

        findDistinctCount(arr, k);
    }

    public static void findDistinctCount(int[] arr, int k) {
        List<Integer> window = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            window.add(arr[i]);
            if (window.size() > k) {
                window.remove(0);
            }
            if (window.size() == k) {
                Set<Integer> collect = window.stream().collect(Collectors.toSet());
                System.out.println("The count of distinct elements in subarray [" + (i - k + 1) + ", " + (k - 1) + "] is " + collect.size());
            }

        }
    }
}
