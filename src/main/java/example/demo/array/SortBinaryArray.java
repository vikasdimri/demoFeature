package example.demo.array;

public class SortBinaryArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 4};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("================="+arr[i]);
                }
            }

        }
    }
}
