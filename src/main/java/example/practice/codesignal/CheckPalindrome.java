package example.practice.codesignal;

public class CheckPalindrome {
    public static void main(String[] args) {
        String inputString= "aaabaaaa";
        solution(inputString);
    }

    static boolean solution(String inputString) {
        char[] is=inputString.toCharArray();
        boolean isPalindrome=false;
        for(int i=0;i<is.length;i++){
            if(is[i]==is[(is.length-1)-i]){
                isPalindrome=true;
            }else{
                isPalindrome=false;
            }
        }
        return isPalindrome;
    }
}
