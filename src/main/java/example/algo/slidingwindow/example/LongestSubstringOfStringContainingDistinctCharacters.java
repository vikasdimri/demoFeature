package example.algo.slidingwindow.example;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/*
* Given a string, find the longest substring containing distinct characters.

The problem differs from the problem of finding the longest subsequence with distinct characters. Unlike subsequences, substrings are required to occupy consecutive positions within the original string.


For example,

Input:  findlongestsubstring

Output: The longest substring with all distinct characters is dlongest or ubstring


Input:  longestsubstr

Output: The longest substring with all distinct characters is longest


Input:  abbcdafeegh

Output: The longest substring with all distinct characters is bcdafe


Input:  aaaaaa

Output: The longest substring with all distinct characters is a
* */
public class LongestSubstringOfStringContainingDistinctCharacters {

    public static void main(String[] args) {
        String str = "abbcdafeegh";
        System.out.print(findLongestSubstring(str));
    }

    public static String findLongestSubstring(String str) {
        int start = 0, end = 0;
        for (int windowStart = 0, windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            String window = str.substring(windowStart, windowEnd+1);
            //check distinct if not then increase window start
            if (isNotDistinct(window)) {
                windowStart++;
            }
            if (end - start < windowEnd - windowStart) {
                start = windowStart;
                end = windowEnd;
            }
        }
        return str.substring(start, end + 1);
    }

    private static boolean isNotDistinct(String window) {
        Set<Character> set = new HashSet<>();
        char[] chars = window.toCharArray();
        for (Character c : chars) {
            if (!set.add(c)) {
                return true;
            }
        }
        return false;
    }


}
