package example.practice.hackerrank;

import java.util.*;

public class HourGlassSum {

    public static void main(String[] args) {
        /*List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[]{1, 2, 3, 0, 0, 0}));
        arr.add(Arrays.asList(new Integer[]{0, 4, 0, 0, 0, 0}));
        arr.add(Arrays.asList(new Integer[]{5, 6, 7, 0, 0, 0}));
        arr.add(Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0}));
        arr.add(Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0}));
        arr.add(Arrays.asList(new Integer[]{0, 0, 0, 0, 0, 0}));
        arr.stream().forEach(e -> {
            System.out.println(e);
        });*/

        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(new Integer[]{-1 , -1 , 0 , -9 , -2 , -2}));
        arr.add(Arrays.asList(new Integer[]{-2 , -1 , -6 , -8 , -2 , -5}));
        arr.add(Arrays.asList(new Integer[]{-1 , -1 , -1 , -2 , -3 , -4}));
        arr.add(Arrays.asList(new Integer[]{-1 , -9 , -2 , -4 , -4 , -5}));
        arr.add(Arrays.asList(new Integer[]{-7 , -3 , -3 , -2 , -9 , -9}));
        arr.add(Arrays.asList(new Integer[]{-1 , -3 , -1 , -2 , -4 , -5}));
        arr.stream().forEach(e -> {
            System.out.println(e);
        });




        System.out.println("The highest hourglass sum is " + hourglassSum(arr));

    }

    public static int hourglassSum(List<List<Integer>> arr) {
        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < arr.size() - 2; i++) {
            List<Integer> row = arr.get(i);
            for (int j = 0; j < row.size() - 2; j++) {
                System.out.print(row.get(j) + " " + row.get(j + 1) + " " + row.get(j + 2));
                System.out.println();
                System.out.print(arr.get(i + 1).get(j + 1));
                System.out.println();
                System.out.print(arr.get(i + 2).get(j) + " " + arr.get(i + 2).get(j + 1) + " " + arr.get(i + 2).get(j + 2));
                System.out.println("--------------");
                int sum = row.get(j) + row.get(j + 1) + row.get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                sumList.add(sum);
            }

        }

        return Collections.max(sumList);
    }
}
