package example.practice.codesignal;

import java.util.Arrays;

/*
* Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

Input/Output

[execution time limit] 3 seconds (java)

[input] array.integer a

If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in the ith position.
* */
public class SortByHeight {
    public static void main(String[] args) {
        int[] a = {-1, 150, 190, 170, -1, -1, 180, 160};
        Arrays.stream(solution(a)).forEach(System.out::println);
    }

    static int[] solution(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] != -1 && a[j] > a[j + 1]) {
                        if (a[j + 1] == -1) {
                            for (int k = j + 1; k < a.length; k++) {
                                if (a[k] != -1 && a[j] > a[k]) {
                                    int temp = a[j];
                                    a[j] = a[k];
                                    a[k] = temp;
                                    break;
                                }
                            }
                        } else {
                            if (a[j] > a[j + 1]) {
                                int temp = a[j];
                                a[j] = a[j + 1];
                                a[j + 1] = temp;
                            }
                        }
                    }
                }
            }
        }
        return a;
    }

}
