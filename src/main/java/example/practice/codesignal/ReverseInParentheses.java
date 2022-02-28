package example.practice.codesignal;

/*
* Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

* For inputString = "(bar)", the output should be
solution(inputString) = "rab";
* For inputString = "foo(bar)baz", the output should be
solution(inputString) = "foorabbaz";
* For inputString = "foo(bar)baz(blim)", the output should be
solution(inputString) = "foorabbazmilb";
* For inputString = "foo(bar(baz))blim", the output should be
solution(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
* */
public class ReverseInParentheses {
    public static void main(String[] args) {
        String inputString = "foo(bar(baz))blim";
        //String inputString = "foo(bar)baz(blim)";
        System.out.println(inputString.lastIndexOf("&"));
        solution(inputString);
    }

    static String solution(String inputString) {
        while (inputString.lastIndexOf("(") > -1) {
            int beginIndex = inputString.lastIndexOf("(");
            int endIndex = inputString.substring(beginIndex,inputString.length()).indexOf(")")+beginIndex;
            String substring = inputString.substring(beginIndex + 1, endIndex);
            System.out.println("Sub " + substring);
            String reverse = reverse(substring);
            inputString = inputString.replace(inputString.substring(beginIndex, endIndex+1), reverse);
            System.out.println(inputString);
        }
        return inputString;
    }

    static String reverse(String s) {
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
