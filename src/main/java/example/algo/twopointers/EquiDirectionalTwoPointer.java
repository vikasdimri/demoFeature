package example.algo.twopointers;

import java.util.Arrays;

public class EquiDirectionalTwoPointer {
    public static void main(String[] args) {
        int[] arr = {-259,-825,459,825,221,870,626,934,205,783,850,398};
        arr=Arrays.stream(arr).sorted().toArray();
        Arrays.stream(solve(arr, -42)).forEach(System.out::println);
    }

    public static int[] solve(int arr[], int target) {
        int start = 0, end = 1;
        while (start < arr.length && end < arr.length) {
            int numberOne = arr[start], numberTwo = arr[end];
            if (start != end &&
                    (numberOne - numberTwo == target || numberTwo - numberOne == target)) {
                return new int[]{numberOne, numberTwo};
            } else if (numberTwo - numberOne < target) {
                end++;
            } else {
                start++;
            }
        }
        return new int[]{};
    }
}
