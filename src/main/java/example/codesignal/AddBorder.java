package example.codesignal;

import java.util.Arrays;
/*
* Given a rectangular matrix of characters, add a border of asterisks(*) to it.

Example

For

picture = ["abc",
           "ded"]
the output should be

solution(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
* */
public class AddBorder {
    public static void main(String[] args) {
        //String[] picture = {"abc", "ded"};
        String[] picture = {"a"};
        //String[] picture = {"aa", "**", "zz"};
        Arrays.stream(solution(picture)).forEach(System.out::println);
    }

    static String[] solution(String[] picture) {
        int length = 0;
        String border = "**";
        String[] result = new String[picture.length + 2];
        for (int i = 0; i < picture.length; i++) {
            if (length < picture.length) {
                length = picture[i].length();
            }
        }

        for (int i = 0; i < length; i++) {
            border = border + "*";
        }

        for (int i = 0; i < picture.length + 2; i++) {
            if (i == 0) {
                result[0] = border;
            } else if (i == picture.length + 1) {
                result[picture.length + 1] = border;
            } else {
                result[i] = "*" + picture[i - 1] + "*";
            }
        }
        return result;

    }

}
