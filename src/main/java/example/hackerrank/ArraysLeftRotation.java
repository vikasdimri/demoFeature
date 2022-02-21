package example.hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
/*
* A left rotation operation on an array shifts each of the array's elements  unit to the left. For example, if  left rotations are performed on array , then the array would become . Note that the lowest index item moves to the highest index in a rotation. This is called a circular array.

Given an array  of  integers and a number, , perform  left rotations on the array. Return the updated array to be printed as a single line of space-separated integers.

Function Description

Complete the function rotLeft in the editor below.

rotLeft has the following parameter(s):

int a[n]: the array to rotate
int d: the number of rotations
Returns

int a'[n]: the rotated array
Input Format

The first line contains two space-separated integers  and , the size of  and the number of left rotations.
The second line contains  space-separated integers, each an .

Constraints

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform  left rotations, the array undergoes the following sequence of changes:


* */
public class ArraysLeftRotation {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(rotLeft(integerList, 54));

    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        List<Integer> roatedIntegerList = new LinkedList<>();
        int rotations = d;
        if (d >= a.size()) {
            rotations = d % 4 - 1;
        }
        int firstElement = a.get(rotations);
        for (int i = 0; i < a.size(); i++) {
            if (rotations == a.size()) {
                rotations = 0;
            }
            roatedIntegerList.add(a.get(rotations));
            rotations++;
        }
        return roatedIntegerList;
    }
}
