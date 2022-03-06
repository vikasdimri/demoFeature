package example.algo.slidingwindow.example;

import java.util.HashSet;
import java.util.Set;

/*
* Given an array of sorted integers that may contain several duplicate elements,
* count the total number of distinct absolute values in it.

For example,

Input:  { -1, -1, 0, 1, 1, 1 }
Output: The total number of distinct absolute values is 2 (0 and 1)


Input:  { -2, -1, 0, 1, 2, 3 }
Output: The total number of distinct absolute values is 4 (0, 1, 2 and 3)


Input:  { -1, -1, -1, -1 }
Output: The total number of distinct absolute values is 1 (only 1)
* */
public class CountDistinctAbsoluteValuesInSortedArray {

    public static void main(String[] args) {
        int[] input = {-1, -1, 0, 1, 1, 1};

        System.out.println("The total number of distinct absolute values is "
                + findDistinctCount(input));
    }

    public static int findDistinctCount(int[] arr) {
        Set<Integer> absolute=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            absolute.add(Math.abs(arr[i]));
        }
        return absolute.size();
    }
}
