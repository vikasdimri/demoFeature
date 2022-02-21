package example.demo.array;

import java.util.Arrays;

/*
* Given an unsorted array of integers, find a pair with a given sum in it.
*
* For example,
*   Input:
*       arr = [8, 7, 2, 5, 3, 1]
        sum = 10
*   Output:
*       Pair found at index 0 and 2 (8 + 2)
*       Pair found at index 1 and 4 (7 + 3)
*
* 87 82 85 83 81
* 72 75 73 71
* 25 23 21
* 53 51
* 31
*/
public class FindPairWithGivenSum {
    private static int[] arr = new int[]{8, 7, 2, 5, 3, 1};
    private static int sum = 10;

    public static void main(String[] args) {
        System.out.println("<===================Start===================>");
        int[][] pair = findPair();
        for (int[] pArr : pair) {
            if (pArr[0] != 0 && pArr[1] != 0) {
                System.out.println("Pair :: [" + pArr[0] + " , " + pArr[1] + "]");
            }
        }
        System.out.println("---Stream--");
        Arrays.stream(pair)
                .filter(fl -> fl[0] > 0 && fl[1] > 0)
                .forEach(e -> System.out.println("Pair :: [" + e[0] + " , " + e[1] + "]"));
        System.out.println("<====================End====================>");
    }

    private static int[][] findPair() {
        int[][] pair = new int[limit()][limit()];
        int index = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    int[] match = {arr[i], arr[j]};
                    pair[index] = match;
                    index++;
                }
            }
        }
        return pair;
    }

    private static int limit() {
        int limit = 0;
        for (int i = 1; i <= arr.length; i++) {
            limit = limit + arr.length - i;
        }
        return limit;
    }
}
