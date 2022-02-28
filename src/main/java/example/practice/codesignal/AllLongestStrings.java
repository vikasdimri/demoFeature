package example.practice.codesignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
* Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
solution(inputArray) = ["aba", "vcd", "aba"].
* */
public class AllLongestStrings {
    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        Arrays.stream(solution(inputArray)).forEach(System.out::println);
    }

    static String[] solution(String[] inputArray) {
        List<String> maxString = new ArrayList<>();
        int length = 0;
        for (String s : inputArray) {
            if (s.length() > length) {
                length = s.length();
                maxString.removeAll(maxString);
            }
            if (s.length() == length) {
                maxString.add(s);
            }
        }
        return maxString.toArray(new String[0]);
    }

}
