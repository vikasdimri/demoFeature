package example.leetcode;

import java.util.Arrays;
/*
* Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
* */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int target = 6;
        //int[] arr = {11, 2, 7, 15};
        //int target=9;
        //int[] arr = {2,7,11,15};
        //int target=9;
        Arrays.stream(twoSum(arr, target)).forEach(e -> System.out.print(e + ", "));
    }

    public static int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    first = i;
                    second = j;
                    break;
                }
            }
            if (first != second && nums[first] + nums[second] == target) {
                break;
            }
        }
        return new int[]{first, second};
    }
}
