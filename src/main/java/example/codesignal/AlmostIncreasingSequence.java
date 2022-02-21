package example.codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3};

        System.out.println(solution(arr));
    }



    static boolean solution(int[] sequence) {
        int before;
        int current;
        int after;
        int swap = 0;
        List<Integer> swapedArrayList = new ArrayList<>();
        for (int i = 1; i < sequence.length - 1; i++) {
            before = sequence[i - 1];
            current = sequence[i];
            after = sequence[i + 1];

            if (i == 1) {
                swapedArrayList.add(sequence[0]);
                if (current + 1 == after) {
                    swap = swap + 1;
                }
            } else {
                if (before + 1 == after) {
                    swap = swap + 1;
                } else {
                    swapedArrayList.add(sequence[i]);
                }
                if (i == sequence.length - 2) {
                    swapedArrayList.add(sequence[i + 1]);
                }
            }
        }
        boolean isInSequence = true;
        current = swapedArrayList.get(0);
        for (int i = 1; i < swapedArrayList.size(); i++) {
            if (current + 1 != swapedArrayList.get(i)) {
                isInSequence = false;
            }
            current = swapedArrayList.get(i);
        }
        if (swap == 0 && isInSequence) {
            return true;
        } else if (swap == 1 && isInSequence) {
            return true;
        }
        return false;
    }

}
