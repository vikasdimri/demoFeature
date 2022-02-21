package example.hackerrank;

import java.util.Arrays;

/* Task - Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.

Example
Print 4 3 2 1. Each integer is separated by one space.

Input Format
The first line contains an integer,  (the size of our array).
The second line contains  space-separated integers that describe array 's elements.
  */
public class FindTheMissingNumberInTheArray {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 1};
        StringBuffer sb = new StringBuffer();
        for (int i = array.length-1; i >= 0; i--) {
            sb.append(array[i]).append(" ");
        }
        System.out.println(sb.toString());
    }
}
