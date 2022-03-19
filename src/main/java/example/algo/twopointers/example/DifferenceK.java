package example.algo.twopointers.example;

public class DifferenceK {
    public static void main(String[] args) {
        //int[] arr = new int[]{1, 3, 5};
        //int k = 4;
        int[] arr = new int[]{1, 2, 2, 3, 4};
        int k = 0;
        System.out.println(diffPossible(arr, k));
    }

    public static int diffPossible(int[] arr, int k) {
        int ptr1 = 0, ptr2 = 0;
        while (ptr1 < arr.length && ptr2 < arr.length) {
            int result = arr[ptr2] - arr[ptr1];
            if (result == k && ptr1 != ptr2) {
                return 1;
            } else if (result <= k) {
                ptr2++;
            } else {
                ptr1++;
            }
        }
        return 0;
    }
}
