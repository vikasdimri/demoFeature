package example.algo.slidingwindow.example;

import java.util.*;

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
        String str = "abcbdbdbbdcdabd";
        int k = 2;
        System.out.println(findLongestSubstring(str, k));
        System.out.println("bdbdbbd");
        //bdbdb
    }

    public static String findLongestSubstring(String str, int k) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int maxLength = 0;
        int start = 0, end = 0;
        for (int windowStart = 0, windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            Character currentChar = str.charAt(windowEnd);
            map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);
            while (map.size() > k) {
                Character charFromFront = str.charAt(windowStart);
                map.put(charFromFront, map.get(charFromFront) - 1);
                if (map.get(charFromFront) == 0) {
                    map.remove(charFromFront);
                }
                windowStart++;
            }
            if (end - start < windowEnd - windowStart) {
                start = windowStart;
                end = windowEnd;
            }
        }
        return str.substring(start, end + 1);
    }
}
