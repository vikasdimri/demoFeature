package example.hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers and a value, determine if there are any two integers in the array
 * whose sum is equal to the given value. Return true if the sum exists and return false if it does not.
 *  Consider this array and the target sums:
 * 5 7 1 2 8 4 3
 * Target Sum
 * 10 -> 7+3=10, 2+8=10
 * Target Sum
 * 19-> No 2 values sum up to 19
 */
public class DetermineIfTheSumOfTwoIntegersIsEqualToTheGivenValue {
    public static void main(String[] args) {
        int[] array = {5, 7, 1, 2, 8, 4, 3};
        System.out.println(checkSum(array, 10));
        System.out.println(checkSum(array, 19));
    }

    public static boolean checkSum(int[] array, int targetSum) {
        Set<Integer> set = new HashSet<>();
        for (int e : array) {
            if (set.contains(targetSum - e)) {
                return true;
            }
            set.add(e);
        }
        return false;
    }
}
