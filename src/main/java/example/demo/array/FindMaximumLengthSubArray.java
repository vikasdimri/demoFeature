package example.demo.array;

import java.util.Arrays;

/*
 * Find maximum length sub-array having equal number of 0 and 1.
 * Given a binary array containing 0 and 1, find maximum length sub-array having equal number of 0’s and 1’s.
 *
 * For example,
 * Input:
 *   { 0, 0, 1, 0, 1, 0, 0 }
 *
 * Output:
 *   { 0, 1, 0, 1 }
 *   { 1, 0, 1, 0}
 *
 *
 *  0, 0, 1, 0, 1, 0
 *  0, 1, 0, 1, 0, 0
 *  0, 0, 1, 0
 *  0, 1, 0, 1
 *  1, 0, 1, 0
 *  0, 1, 0, 0
 *  0, 0
 *  0, 1
 *  1, 0
 *  0, 1
 *  1, 0
 *  0, 0
 * */
public class FindMaximumLengthSubArray {
    private static int[] arr = new int[]{0, 0, 1, 0, 1, 0, 1, 0, 0};

    public static void main(String[] args) {
        int[][] resultArr = getAllEvenLengthArray();
        int maxLength = 0;
        for (int[] subArr : resultArr) {
            int zeroCount = 0;
            int oneCount = 0;

            for (int value : subArr) {
                if (value == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
            if (oneCount == zeroCount) {
                if (maxLength == 0) {
                    maxLength = subArr.length;
                }
                if (maxLength>subArr.length){
                    break;
                }
                Arrays.stream(subArr).forEach(System.out::print);
                System.out.println("");

            }
        }
    }

    private static int[][] getAllEvenLengthArray() {
        int[][] resultArr = {};
        int maxArrSize = arr.length;
        if (arr.length % 2 != 0) {
            maxArrSize = arr.length - 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (0 != maxArrSize) {
                int[] subArr = Arrays.copyOfRange(arr, i, i + maxArrSize);
                resultArr = appendInResultArray(resultArr, subArr);
                if (arr.length - i <= maxArrSize) {
                    maxArrSize = maxArrSize - 2;
                    i = -1;
                }
            }
        }
        return resultArr;
    }

    private static int[][] appendInResultArray(int[][] resultArray, int[] subArr) {
        int limit = resultArray.length + 1;
        int temp[][] = new int[limit][limit];
        int i;
        for (i = 0; i < resultArray.length; i++) {
            temp[i] = resultArray[i];
        }
        temp[limit - 1] = subArr;
        return temp;
    }
}
