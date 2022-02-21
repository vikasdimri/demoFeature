package example.algo.slidingwindow;

public class FixedSizeSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, k));
    }

    private static int maxSum(int[] arr, int k) {
        int max_sum = 0;
        for (int i = 0; i < k; i++) {
            max_sum = max_sum + arr[i];
        }
        int window_sum = max_sum;
        for (int i = k; i < arr.length; i++) {
            window_sum = window_sum + (arr[i] - arr[i - k]);
            if (max_sum < window_sum) {
                max_sum = window_sum;
            }
        }
        return max_sum;
    }

}
