package example.algo.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FlexibleSizeSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int[] ints = maxSum(arr, 15);
        Arrays.stream(ints).forEach(System.out::println);
    }

    private static int[] maxSum(int[] arr, int totalSum) {
        int maxSum = 0, windowSum = 0;
        int start = 0, end = 0;
        for (int windowStart = 0, windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            int currentElement = arr[windowEnd];
            windowSum = windowSum + currentElement;
            while (windowSum > totalSum) {
                int windowElementFromStart = arr[windowStart];
                windowSum = windowSum - windowElementFromStart;
                windowStart++;
            }
            if (windowSum > maxSum) {
                maxSum = windowSum;
                start = windowStart;
                end = windowEnd;
            }
        }
        return Arrays.copyOfRange(arr, start, end+1);
    }
}
