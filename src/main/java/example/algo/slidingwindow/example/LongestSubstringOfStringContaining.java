package example.algo.slidingwindow.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
* Find the longest substring of a string containing `k` distinct characters
Given a string and a positive number k, find the longest substring of the string containing k distinct characters. If k is more than the total number of distinct characters in the string, return the whole string.

The problem differs from the problem of finding the longest subsequence with k distinct characters. Unlike subsequences, substrings are required to occupy consecutive positions within the original string.


For example, consider string abcbdbdbbdcdabd.

For k = 2, o/p is ‘bdbdbbd’
For k = 3, o/p is ‘bcbdbdbbdcd’
For k = 5, o/p is ‘abcbdbdbbdcdabd’
* */
public class LongestSubstringOfStringContaining {

    public static final int CHAR_RANGE = 128;

    public static void main(String[] args) {
        String str = "abdbdbabd";
        int k = 2;
        System.out.print(findLongestSubstring(str, k));
    }

    public static String findLongestSubstring(String str, int k) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] chars = str.toCharArray();
        Set<Character> window = new HashSet<>();
        int begin = 0;
        int end = 0;
        Map<Character, Integer> windowCharCount = new HashMap<>();

        for (int windowStart = 0, windowEnd = 0; windowEnd < chars.length; windowEnd++) {
            window.add(chars[windowEnd]);
            while (window.size() > k) {
                window.remove(chars[windowStart]);
                windowStart++;
            }
            if (end - begin < windowEnd - windowStart) {
                begin = windowStart;
                end = windowEnd;
            }
        }

        return str.substring(begin, end + 1);
    }
}
