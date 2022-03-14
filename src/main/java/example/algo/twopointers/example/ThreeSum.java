package example.algo.twopointers.example;

import java.util.Arrays;

/*
* Given an array S of n integers, find three integers in S such that
* the sum is closest to a given number, target.
Return the sum of the three integers.
Assume that there will only be one solution

Example:

given array S = {-1 2 1 -4},

and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)

* */
public class ThreeSum {
    public static void main(String[] args) {
        //int[] arr = new int[]{-1, 2, 1, -4};
        //int x = 1;
        int[] arr = new int[]{-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3};
        int x = -1;
        System.out.println(threeSumClosest(arr, x));
    }

    public static int threeSumClosest(int[] arr, int target) {
        arr = Arrays.stream(arr).sorted().toArray();
        long minimSum = arr[0] + arr[1] + arr[arr.length - 1];

        for (int i = 0; i < arr.length - 2; i++) {
            int ptr1 = i + 1;
            int ptr2 = arr.length - 1;
            while (ptr1 < ptr2) {
                long windowSum = arr[i] + arr[ptr1] + arr[ptr2];
                if (Math.abs(target - windowSum) < Math.abs(minimSum - target)) {
                    minimSum = windowSum;
                }
                if (windowSum > target) {
                    ptr2--;
                } else {
                    ptr1++;
                }
            }
        }
        return (int)minimSum;
    }
}
