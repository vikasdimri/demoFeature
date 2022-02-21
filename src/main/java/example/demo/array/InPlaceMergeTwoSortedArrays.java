package example.demo.array;

import java.util.Arrays;

/*
 * Given two sorted arrays X[] and Y[] of size m and n each, merge elements of X[] with elements of array Y[] by
 * maintaining the sorted order. i.e. fill X[] with first m smallest elements and fill Y[] with remaining elements.
 *
 * Input:
 *   X[] = { 1, 4, 7, 8, 10 }
 *   Y[] = { 2, 3, 9 }
 *
 * Output:
 *   X[] = { 1, 2, 3, 4, 7 }
 *   Y[] = { 8, 9, 10 }
 *
 * */
public class InPlaceMergeTwoSortedArrays {


    public static void main(String[] args) {
        int[] x = new int[]{1, 4, 7, 8, 10};
        int[] y = new int[]{2, 3, 9};

        int[] xy = getSortedOneArray(x, y);
        int index;
        index = 0;
        for (int i = 0; i < x.length; i++) {
            x[i] = xy[index];
            index++;
        }
        for (int i = 0; i < y.length; i++) {
            y[i] = xy[index];
            index++;
        }


        Arrays.stream(x).forEach(e->{
            System.out.print(e+", ");
        });
        System.out.println("");
        Arrays.stream(y).forEach(e->{
            System.out.print(e+", ");
        });

    }

    private static int[] getSortedOneArray(int[] x, int[] y) {
        int[] xy = new int[x.length + y.length];
        int index = 0;
        for (int i = 0; i < x.length; i++) {
            xy[index] = x[i];
            index++;
        }
        for (int i = 0; i < y.length; i++) {
            xy[index] = y[i];
            index++;
        }
        Arrays.sort(xy);
        return xy;
    }

}
