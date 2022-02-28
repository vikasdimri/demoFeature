package example.practice.codesignal;

public class MakeArrayConsecutive {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 2, 3, 8};
        System.out.println(solution(arr));
    }

    static int solution(int[] statues) {
        statues = MakeArrayConsecutive.sort(statues);
        //Arrays.stream(statues).forEach(System.out::println);
        int missing = 0;
        for (int i = 0; i < statues.length - 1; i++) {
            if (statues[i + 1] != statues[i] + 1) {
                missing = missing + (statues[i + 1] - statues[i] - 1);
            }
        }
        return missing;
    }

    private static int[] sort(int[] statues) {
        for (int i = 0; i < statues.length; i++) {
            int min = i;
            for (int j = i + 1; j < statues.length; j++) {
                if (statues[min] > statues[j]) {
                    min = j;
                }
            }
            if (statues[i] > statues[min]) {
                int temp = statues[i];
                statues[i] = statues[min];
                statues[min] = temp;
            }
        }

        return statues;
    }
}
