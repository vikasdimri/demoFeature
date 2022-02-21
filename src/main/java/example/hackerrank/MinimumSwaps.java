package example.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumSwaps {
    public static void main(String[] args) {

        /*
        * i   arr                     swap (indices)
0             [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
1             [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
2             [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
3             [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
4             [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
5             [1, 2, 3, 4, 5, 6, 7]
        * */

        //int[] arr = {7, 1, 3, 2, 4, 5, 6};
        int[] arr = {2, 3, 4, 1, 5};
        System.out.println(minimumSwaps(arr));
    }

    static int minimumSwaps(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length;) {
            if (arr[i] != i + 1) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
                count++;
            }else{
                i++;
            }
        }
        return count;
    }

    static int minimumSwaps1(int[] arr) {
        int swapCount = 0;
        int[] sortedArr = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(sortedArr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != sortedArr[i]) {
                swapCount++;
                int swapElementIndexOf = Arrays.stream(arr).boxed().collect(Collectors.toList()).indexOf(sortedArr[i]);
                int temp = arr[i];
                arr[i] = arr[swapElementIndexOf];
                arr[swapElementIndexOf] = temp;
            }
        }
        return swapCount;
    }


}
