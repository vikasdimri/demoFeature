package example.practice.codesignal;

import java.util.Arrays;
import java.util.List;

/*
* Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
solution(n) = true;
For n = 239017, the output should be
solution(n) = false.
* */
public class IsLucky {

    public static void main(String[] args) {
        int n = 1230;
        System.out.println(solution(n));
    }

    static boolean solution(int n) {
        List<String> nString = Arrays.asList(String.valueOf(n).split(""));
        int inHalfStringLength = nString.size() / 2;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        for (int i = 0; i < nString.size(); i++) {
            if (i < inHalfStringLength) {
                firstHalfSum = firstHalfSum + Integer.parseInt(nString.get(i));
            } else {
                secondHalfSum = secondHalfSum + Integer.parseInt(nString.get(i));
            }
        }
        return firstHalfSum == secondHalfSum;
    }
}
