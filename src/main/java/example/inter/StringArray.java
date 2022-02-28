//Chewy

package example.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArray {

    public static void main(String[] args) {
        List<String> strArr = Arrays.asList(new String[]{"aba", "ece", "bc", "o", "iab"});
        List<String> range = Arrays.asList(new String[]{"1-3", "3-5"});
        List<Integer> vowelsCount = findVowels(strArr, range);
        vowelsCount.stream().forEach(System.out::println);
    }

    private static List<Integer> findVowels(List<String> strArr, List<String> range) {
        List<Integer> result = new ArrayList<>();
        range.stream().forEach(r -> {
            String[] splitRange = r.split("-");
            int start = Integer.valueOf(splitRange[0]);
            int end = Integer.valueOf(splitRange[1]);
            List<String> subStrArr = strArr.subList(start - 1, end);
            long count = subStrArr.stream().filter(f -> isVowels(f)).count();
            result.add((int) count);
        });
        return result;
    }
//2048 x 1152
    private static boolean isVowels(String str) {
        List<String> vowelsList = Arrays.asList(new String[]{"a", "e", "i", "o", "u"});
        if (vowelsList.contains(String.valueOf(str.charAt(0)))
                && vowelsList.contains(String.valueOf(str.charAt(str.length() - 1)))) {
            return true;
        }
        return false;
    }

}
