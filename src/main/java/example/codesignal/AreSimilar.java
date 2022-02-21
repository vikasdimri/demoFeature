package example.codesignal;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
* Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.

Given two arrays a and b, check whether they are similar.

Example

For a = [1, 2, 3] and b = [1, 2, 3], the output should be
solution(a, b) = true.

The arrays are equal, no need to swap any elements.

For a = [1, 2, 3] and b = [2, 1, 3], the output should be
solution(a, b) = true.

We can obtain b from a by swapping 2 and 1 in b.

For a = [1, 2, 2] and b = [2, 1, 1], the output should be
solution(a, b) = false.

Any swap of any two elements either in a or in b won't make a and b equal.


* */
public class AreSimilar {
    public static void main(String[] args) {
        //int[] a = {4, 6, 3};
        //int[] b = {3, 4, 6};
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 4, 3, 2};
        System.out.println(solution(a, b));
    }

    static boolean solution(int[] a, int[] b) {
        int err = 0, sum = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                err++;
                if (sum == -1) {
                    sum = a[i] + b[i];
                } else if (sum != a[i] + b[i]) {
                    return false;
                }
            }
        }
        if (err > 2) return false;
        return true;
    }

}
