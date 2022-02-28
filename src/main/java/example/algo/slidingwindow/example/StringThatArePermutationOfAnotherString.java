package example.algo.slidingwindow.example;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/*
* Find all substrings of a string that contains all characters of another string.
* In other words, find all substrings of the first string that are anagrams of the second string.

Please note that the problem specifically targets substrings that are contiguous
* (i.e., occupy consecutive positions) and inherently maintains the order of elements.


For example,

The first string is 'XYYZXZYZXXYZ'
The second string is 'XYZ'

Anagram 'YZX' present at index 2
Anagram 'XZY' present at index 4
Anagram 'YZX' present at index 6
Anagram 'XYZ' present at index 9
* */
public class StringThatArePermutationOfAnotherString {

    public static void main(String[] args) {
        String firstString = "XYYZXZYZXXYZ";
        String secondString = "XYZ";
        findAllAnagrams(firstString, secondString);
    }

    public static void findAllAnagrams(String firstString, String secondString) {
        int k = secondString.length();
        String window = "";
        int start = 0;
        for (int i = k; i <= firstString.length(); i++) {
            window = firstString.substring(start, start + k);
            if (isContains(secondString, window)) {
                System.out.println("Anagram " + window + " present at index " + start);
            }
            start++;
        }
    }

    private static boolean isContains(String secondString, String window) {
        List<String> windowStringList = Arrays.asList(window.split(""));
        AtomicBoolean contains = new AtomicBoolean(true);
        for (String e : secondString.split("")) {
            boolean b = windowStringList.contains(e);
            if (!b) {
                contains.set(b);
                break;
            }
        }
        return contains.get();
    }
}
