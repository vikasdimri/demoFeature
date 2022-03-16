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
        Arrays.stream(arr).sorted().forEach(value -> System.out.print(value+", "));
        System.out.println();
        System.out.println(nTriang(arr));
        CountTriangles(arr);
    }

    static void CountTriangles(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        System.out.println("CountTriangles");
        for (int i = arr.length - 1; i >= 1; i--) {
            int ptr1 = 0, ptr2 = i - 1;
            while (ptr1 < ptr2) {
                if (arr[ptr1] + arr[ptr2] > arr[i]) {
                    System.out.println("[" + arr[ptr1] + ", " + arr[ptr2] + ", " + arr[i] + "]");
                    count = count + (ptr2 - ptr1);
                    ptr2--;
                } else {
                    ptr1++;
                }
            }
        }
        System.out.print("No of possible solutions: " + count);
    }

    public static int nTriang(int[] arr) {
        System.out.println("nTriang");
        int count = 0;
        arr = Arrays.stream(arr).sorted().toArray();
        for (int i = 0; i < arr.length; i++) {
            int ptr1 = i + 1;
            int ptr2 = arr.length - 1;
            while (ptr1 < ptr2) {
                int ab = arr[i], bc = arr[ptr1], ca = arr[ptr2];
                if (ab + bc > ca) {
                    System.out.println("[" + ab + ", " + bc + ", " + ca + "]");
                    count++;
                    ptr2--;
                } else if (ab + bc < ca) {
                    ptr1++;
                } else {
                    ptr2--;
                }
            }
        }

        return count;
    }
}
