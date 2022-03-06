package example.algo.twopointers;

import java.util.Arrays;

public class OppositeDirectionalTwoPointer {
    public static void main(String[] args) {
        int[] arr = {-500, -396, -297, -284, -229, -173, -173, -38, -5, 35, 169, 281, 322, 358, 421, 436, 447};
        int[] result = solve(arr, 450);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] solve(int arr[], int target) {
        int start = 0, end = arr.length - 1;
        int[] result = null;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            } else {
                result = new int[]{arr[start], arr[end]};
                break;
            }
        }
        return result;
    }
}
