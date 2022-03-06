package example.algo.slidingwindow.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
* Given an array and a positive number k, check whether the array contains
* any duplicate elements within the range k. If k is more than the array’s size,
* the solution should check for duplicates in the complete array.

For example,

Input:

nums[] = { 5, 6, 8, 2, 4, 6, 9 }
k = 4

Output: Duplicates found

(element 6 repeats at distance 4 which is <= k)


Input:

nums[] = { 5, 6, 8, 2, 4, 6, 9 }
k = 2

Output: No duplicates were found

(element 6 repeats at distance 4 which is > k)


Input:

nums[] = { 1, 2, 3, 2, 1 }
k = 7

Output: Duplicates found

(element 1 and 2 repeats at distance 4 and 2, respectively which are both <= k)
* */
public class FindDuplicatesWithinRangeKInAnArray {
    public static void main(String[] args) {
        int[] nums = {5, 6, 5};
        int k = 4;

        if (hasDuplicate(nums, k)) {
            System.out.println("Duplicates found");
        } else {
            System.out.println("No duplicates were found");
        }
    }

    public static boolean hasDuplicate(int[] nums, int k) {
        List<Integer> window = new ArrayList<>();
        for (int windowStart = 0, windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            int currentNumber = nums[windowEnd];
            boolean duplicate = isDuplicate(window);
            if (duplicate) {
                return duplicate;
            }
            if (window.size() > k) {
                window.remove(0);
            }
            window.add(currentNumber);
        }
        return isDuplicate(window);
    }

    private static boolean isDuplicate(List<Integer> window) {
        Set<Integer> set = window.stream().collect(Collectors.toSet());
        return set.size() != window.size();
    }
}
