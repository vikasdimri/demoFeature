package example.algo.slidingwindow.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindMaximumLengthSequenceOfContinuousOnes {
    public static void main(String[] args) {
        int[] A = {0, 0, 1, 0, 1, 1, 1, 0, 1, 1};
        int index = findIndexOfZero(A);
        if (index != -1) {
            System.out.print("Index to be replaced is " + index);
        } else {
            System.out.print("Invalid input");
        }
    }

    public static int findIndexOfZero(int[] arr) {
        int start = 0, end = 0;
        for (int windowStart = 0, windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            int totalZero = countZero(Arrays.copyOfRange(arr, windowStart, windowEnd + 1));
            if (totalZero >= 2) {
                windowStart++;
            }
            if (end - start < windowEnd - windowStart) {
                start = windowStart;
                end = windowEnd;
            }
        }
        return getZeroPosition(arr, start, end);
    }

    private static int getZeroPosition(int[] arr, int start, int end) {
        int[] subArray = Arrays.copyOfRange(arr, start, end+1);
        int zerosPositionInSubArray = Arrays.stream(subArray).boxed().collect(Collectors.toList()).indexOf(0);
        if (zerosPositionInSubArray!=-1){
            return start+zerosPositionInSubArray;
        }
        return -1;
    }

    private static int countZero(int[] arr) {
        long count = Arrays.stream(arr).filter(e -> e == 0).count();
        return (int) count;
    }
}
