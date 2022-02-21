package example.searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        System.out.println(searching(arr,110));
    }

    public static int searching(int[] arr, int element){
        int position=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
               position=i;
               break;
            }
        }
        return position;
    }
}
