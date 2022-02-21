package example.demo.array;

import java.util.Arrays;

/*
 * Given an array of integers, print all sub-arrays with 0 sum.
 * For example,
 * Input:
 *   { 4, 2, -3, -1, 0, 4 }
 * Sub-arrays with 0 sum are
 *   { -3, -1, 0, 4 }
 *   { 0 }
 *
 * Input:
 *   { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 * Sub-arrays with 0 sum are
 *   { 3, 4, -7 }
 *   { 4, -7, 3 }
 *   { -7, 3, 1, 3 }
 *   { 3, 1, -4 }
 *   { 3, 1, 3, 1, -4, -2, -2 }
 *   { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 }
 * */
public class SubArrayWithSumZero {

    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 2, -3, -1, 0, 4};
        int[][] subArrays = findZeroSumSubArrays(arr1);

        Arrays.stream(subArrays).forEach(e -> printArray(e));
        System.out.println("==================================");
        int[] arr2 = new int[]{3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
        subArrays = findZeroSumSubArrays(arr2);
        Arrays.stream(subArrays).forEach(e -> printArray(e));
    }

    private static int[][] findZeroSumSubArrays(int[] arr) {
        int[][] resultArray = {};
        for (int i = 0; i < arr.length; i++) {
            int[] subArr;
            if (arr[i] == 0) {
                subArr = new int[]{arr[i]};
                resultArray=appendInResultArray(resultArray, subArr);
            } else {
                subArr = new int[arr.length];
                int index = 0;
                subArr[index] = arr[i];
                index++;
                int sum = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    sum = sum + arr[j];
                    subArr[index] = arr[j];
                    if (sum == 0) {
                        subArr = Arrays.copyOfRange(subArr, 0, index + 1);
                        resultArray=appendInResultArray(resultArray, subArr);
                        break;
                    }
                    index++;
                }
            }
        }
        return resultArray;
    }

    private static int[][] appendInResultArray(int[][] resultArray, int[] subArr) {
        int limit = resultArray.length + 1;
        int temp[][] = new int[limit][limit];
        int i;
        for (i = 0; i < resultArray.length; i++) {
            temp[i] = resultArray[i];
        }
        temp[limit-1]=subArr;
        return temp;
    }

    private static void printArray(int[] pArr) {
        for (int i : pArr) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }
}
