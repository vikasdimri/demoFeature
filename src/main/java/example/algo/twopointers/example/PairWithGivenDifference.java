package example.algo.twopointers.example;

import java.util.Arrays;

/*
* Problem Description

Given an one-dimensional unsorted array A containing N integers.
You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.
Return 1 if any such pair exists else return 0.

Problem Constraints
1 <= N <= 105
-103 <= A[i] <= 103
-105 <= B <= 105

Input Format
First argument is an integer array A of size N.

Second argument is an integer B.

Output Format
Return 1 if any such pair exists else return 0.

Example Input
Input 1:

 A = [5, 10, 3, 2, 50, 80]
 B = 78
Input 2:

 A = [-10, 20]
 B = 30

Example Output
Output 1:

 1
Output 2:

 1

Example Explanation
Explanation 1:

 Pair (80, 2) gives a difference of 78.
Explanation 2:

 Pair (20, -10) gives a difference of 30 i.e 20 - (-10) => 20 + 10 => 30
* */
public class PairWithGivenDifference {

    public static void main(String[] args) {
//        int[] arr = {-533, -666, -500, 169, 724, 478, 358, -38, -536, 705, -855, 281, -173, 961, -509, -5, 942, -173, 436, -609, -396, 902, -847, -708, -618, 421, -284, 718, 895, 447, 726, -229, 538, 869, 912, 667, -701, 35, 894, -297, 811, 322};
//        System.out.println(solve(arr, 369));

//        int[] arr = {-259, -825, 459, 825, 221, 870, 626, 934, 205, 783, 850, 398};
//        System.out.println(solve(arr, -42));

        int[] arr = {20, 500, 1000, 200};
        System.out.println(solve(arr, 0));

    }

    public static int solve(int arr[], int target) {
        arr = Arrays.stream(arr).sorted().toArray();
        int start = 0, end = 1;
        while (start < arr.length && end < arr.length) {
            if (start != end &&
                    (arr[end] - arr[start] == target || arr[start] - arr[end] == target)) {
                return 1;
            } else if (arr[end] - arr[start] < target) {
                end++;
            } else {
                start++;
            }
        }
        return 0;
    }
}
