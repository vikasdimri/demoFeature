package example.algo.twopointers.example;

import java.util.Arrays;

/*
 * You are given an array of N non-negative integers, A0, A1 ,…, AN-1.
 * Considering each array element Ai as the edge length of some line segment,
 * count the number of triangles which you can form using these array values.

 * Notes:
 * 1). You can use any value only once while forming each triangle.
 * Order of choosing the edge lengths doesn’t matter.
 * Any triangle formed should have a positive area.
 * 2). Return answer modulo 109 + 7.

 * For example,
 * A = [1, 1, 1, 2, 2]
 * Return: 4
 * */
public class CountingTriangles {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 7, 6};
        Arrays.stream(arr).sorted().forEach(value -> System.out.print(value + ", "));
        System.out.println();
        System.out.println(nTriang(arr));
    }

    public static int nTriang(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        long count = 0;
        arr = Arrays.stream(arr).sorted().toArray();
        for (long i = arr.length - 1; i >= 1; i--) {
            long ptr1 = 0, ptr2 = i - 1;
            while (ptr1 < ptr2) {
                long ab = (long) arr[(int) ptr1];
                long bc = (long) arr[(int) ptr2];
                long ca = (long) arr[(int) i];
                if (ab + bc > ca) {
                    count = count + (ptr2 - ptr1);
                    ptr2--;
                } else {
                    ptr1++;
                }
            }
        }
        return (int) count;
    }
}
