package example.algo.sorting;

import java.util.Arrays;
/*
* Bubble Sort is the simplest sorting algorithm that works by repeatedly
* swapping the adjacent elements if they are in wrong order.
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        Arrays.stream(sort(arr)).forEach(System.out::println);
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        return arr;
    }
}
