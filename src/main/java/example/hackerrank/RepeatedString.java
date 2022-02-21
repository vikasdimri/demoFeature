package example.hackerrank;

import java.util.Arrays;
/*
* There is a string, , of lowercase English letters that is repeated infinitely many times. Given an integer, , find and print the number of letter a's in the first  letters of the infinite string.

Example


The substring we consider is , the first  characters of the infinite string. There are  occurrences of a in the substring.

Function Description

Complete the repeatedString function in the editor below.

repeatedString has the following parameter(s):

s: a string to repeat
n: the number of characters to consider
Returns

int: the frequency of a in the substring
Input Format

The first line contains a single string, .
The second line contains an integer, .

Constraints

For  of the test cases, .
Sample Input

Sample Input 0

aba
10
Sample Output 0

7
Explanation 0
The first  letters of the infinite string are abaabaabaa. Because there are  a's, we return .

Sample Input 1

a
1000000000000
Sample Output 1

1000000000000
Explanation 1
Because all of the first  letters of the infinite string are a, we return .
* */
public class RepeatedString {
    public static void main(String[] args) {
        //System.out.println(repeatedString("aba", 10));
        //System.out.println(2147483648l % 2147483647);
        //System.out.println(totalList());
        //System.out.println(repeatedString("a", 1000000000000l));
        //System.out.println(repeatedString("d", 590826798023l));
        System.out.println(repeatedString("kmretasscityylpdhuwjirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxuarabssvqdnktqadhyktagjxoanknhgilnm",
               736778906400l));

    }

    public static long repeatedString(String s, long n) {
        long extraCount = 0l;
        String strArray[] = s.split("");
        long countPerString = Arrays.stream(strArray).filter(e -> e.equalsIgnoreCase("a")).count();
        int lengthPerString = strArray.length;
        long total = n / lengthPerString;
        long extra = n % lengthPerString;
        if (extra != 0) {
            String substring = s.substring(0, Math.toIntExact(extra));
            String[] split = substring.split("");
            extraCount = Arrays.stream(split).filter(e -> e.equalsIgnoreCase("a")).count();
        }
        return (total * countPerString) + extraCount;
    }

}
