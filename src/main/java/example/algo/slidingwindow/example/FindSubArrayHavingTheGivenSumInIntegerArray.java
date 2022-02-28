package example.algo.slidingwindow.example;

/*
* Given an integer array, find a subarray having a given sum in it.

For example,

Input:  nums[] = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10}, target = 15
Output: {6, 0, 9}


Input:  nums[] = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10}, target = 15
Output: {1, -4, 7, 6, 1, 4} or {4, 1, 10}


Input:  nums[] = {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10}, target = -3
Output: {1, -4}
*
* */
public class FindSubArrayHavingTheGivenSumInIntegerArray {
    public static void main(String[] args) {
        // an array of positive integers
        int[] nums = {2, 6, 0, 9, 7, 3, 1, 4, 1, 10};
        int target = 15;

        findSubarray(nums, target);
    }


    public static void findSubarray(int[] nums, int target) {
        int windowSum = 0;
        for (int windowStart = 0, windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum = windowSum + nums[windowEnd];
            while (windowSum > target) {
                windowSum = windowSum - nums[windowStart];
                windowStart++;
            }
            if (windowSum == target) {
                System.out.println("Subarray found "+ windowStart +" "+ (windowEnd));
                //return;
            }

        }

    }
}
