package example.algo.slidingwindow;

public class FlexibleSizeSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        maxSum(arr,15);
    }

    private static void maxSum(int[] arr, int K) {
        int n = arr.length;
        int answer = 0;
        int sum = 0;
        int R = 1;
        int L = 1;
        for (L=1; L < n; L++) {
            if (L > 1) {
                sum = sum - arr[L - 1];
            }
            while (R <= n && sum + arr[R] <= K) {
                sum = sum + arr[R];
                R = R + 1;
            }

        }
        System.out.println(R + " " + L);
    }
}
