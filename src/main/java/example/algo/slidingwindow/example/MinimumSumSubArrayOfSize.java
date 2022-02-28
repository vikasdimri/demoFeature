package example.algo.slidingwindow.example;

/*
*
* Given an integer array, find the minimum sum subarray of size k, where k is a positive integer.

For example,

Input:  {10, 4, 2, 5, 6, 3, 8, 1}, k = 3

Output: Minimum sum subarray of size 3 is (1, 3)
*
* */
public class MinimumSumSubArrayOfSize {
    public static void main(String[] args) {
        int[] arr = {10, 4, 2, 5, 6, 3, 1, 1};
        int k = 3;
        findSubArray(arr, k);
    }

    public static void findSubArray(int[] arr, int k) {
        int minSum = 0;
        int windowSum = 0;
        int start = 0, end = k - 1;
        for (int i = 0; i < k; i++) {
            minSum = minSum + arr[i];
        }
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            if (windowSum < minSum) {
                minSum = windowSum;
                start = i - k + 1;
                end = i;
            }
        }
        System.out.println("Minimum sum subarray of size " + k + " is (" + start + ", " + end + ")");
    }

}
