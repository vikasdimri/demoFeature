package example.algo.slidingwindow.example;

import java.util.HashMap;
import java.util.Map;

/*
Problem Description

Given a binary array A and a number B, we need to find length of the
longest subsegment of ‘1’s possible by changing at most B ‘0’s.
Problem Constraints
 1 <= N, B <= 105
 A[i]=0 or A[i]=1

Input Format
First argument is an binary array A.
Second argument is an integer B.

Output Format
Return a single integer denoting the length of the longest subsegment of ‘1’s possible by changing at most B ‘0’s.

Example Input
Input 1:
 A = [1, 0, 0, 1, 1, 0, 1]
 B = 1
Input 2:
 A = [1, 0, 0, 1, 0, 1, 0, 1, 0, 1]
 B = 2
Example Output
Output 1: 4
Output 2: 5

Example Explanation
Explanation 1:
 Here, we should only change 1 zero(0). Maximum possible length we can get is by changing the 3rd zero in the array,
 we get a[] = {1, 0, 0, 1, 1, 1, 1}

Explanation 2:
 Here, we can change only 2 zeros. Maximum possible length we can get is by changing the 3rd and 4th (or) 4th and
 5th zeros.
*/
public class MaximumOnesAfterModification {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, 0, 1, 1, 0, 1};
        int b = 1;
        System.out.println(solve(nums, b));

        nums = new int[]{1, 0, 0, 1, 0, 1, 0, 1, 0, 1};
        b = 2;
        System.out.println(solve(nums, b));
    }

    public static int solve(int[] nums, int b) {
        int start = 0, end = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int windowStart = 0, windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            int currentNumber = nums[windowEnd];
            map.put(currentNumber, map.getOrDefault(currentNumber, 0) + 1);
            while (map.get(0) != null && map.get(0) > b) {
                map.put(nums[windowStart], map.get(nums[windowStart]) - 1);
                windowStart++;
            }
            if (end - start < windowEnd - windowStart) {
                start = windowStart;
                end = windowEnd;
            }
        }

        return end - start + 1;
    }
}
