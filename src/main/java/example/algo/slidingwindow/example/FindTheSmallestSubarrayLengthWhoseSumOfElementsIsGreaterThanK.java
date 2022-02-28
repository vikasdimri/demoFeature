package example.algo.slidingwindow.example;

import java.util.Arrays;

/*
* Given an array of positive integers, find the smallest subarray’s length whose sum of elements is greater than a given number k.

For example,

Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 20
Output: The smallest subarray length is 3
Explanation: The smallest subarray with sum > 20 is {6, 7, 8}


Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 7
Output: The smallest subarray length is 1
Explanation: The smallest subarray with sum > 7 is {8}


Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 21
Output: The smallest subarray length is 4
Explanation: The smallest subarray with sum > 21 is {5, 6, 7, 8}


Input:  {1, 2, 3, 4, 5, 6, 7, 8}, k = 40
Output: No subarray exists
* */
public class FindTheSmallestSubarrayLengthWhoseSumOfElementsIsGreaterThanK {

    public static void main(String[] args) {
        // an array of positive numbers
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 20;

        // find the length of the smallest subarray
        int len = findSmallestSubarrayLen(A, k);
        System.out.print("The smallest subarray length is " + len);

    }

    public static int findSmallestSubarrayLen(int[] arr, int k) {
        int start = 0, end = 0;
        int windowSum = 0;
        for (int windowStart = 0, windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum = windowSum + arr[windowEnd];
            while (windowSum > k) {
                if (windowSum > k) {
                    start = windowStart;
                    end = windowEnd;
                }
                windowSum = windowSum - arr[windowStart];
                windowStart++;
            }
        }
        Arrays.stream(Arrays.copyOfRange(arr, start, end + 1)).forEach(System.out::println);
        return end - start + 1;
    }
}

























