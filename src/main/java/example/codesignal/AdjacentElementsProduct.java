package example.codesignal;

public class AdjacentElementsProduct {

    public static void main(String[] args) {
        int[] arr = {-23, 4, -3, 8, -12};
        System.out.println(solution(arr));
    }

    static int solution(int[] inputArray) {
        int product = 0;
        int result = 0;
        for (int n : inputArray) {
            if (product == 0 && n != 0) {
                product = n;
            } else {
                product = product * n;
                if (result < product || result == 0) {
                    result = product;
                }
                product = n;
            }
        }
        return result;
    }
}
