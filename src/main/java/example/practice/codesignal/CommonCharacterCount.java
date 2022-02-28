package example.practice.codesignal;

import java.util.*;

public class CommonCharacterCount {
    public static void main(String[] args) {
        String s1 = "aabcc";
        String s2 = "adcaa";
        System.out.println(solution(s1, s2));
    }

    static int solution(String s1, String s2) {
        long sum = 0;
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        Set<String> distinct = new HashSet<>();
        for (char c : s1.toCharArray()) {
            distinct.add(String.valueOf(c));
        }
        for (String c : distinct) {

            long count1 = new ArrayList<String>(Arrays.asList(s1.split(""))).stream().filter(e -> c.equals(e)).count();
            long count2 = new ArrayList<String>(Arrays.asList(s2.split(""))).stream().filter(e -> c.equals(e)).count();
            if (count1 > count2) {
                sum = sum + count2;
            } else {
                sum = sum + count1;
            }

        }
        return (int) sum;
    }

}
