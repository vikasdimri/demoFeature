package example;

import java.util.Arrays;

public class Sample
{

    // Return the minimum number
    // of swaps required to sort the array
    public int minSwaps(int[] arr)
    {
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(temp);
        Arrays.stream(temp).forEach(System.out::println);
        System.out.println("---------");
        for (int i = 0; i < arr.length; i++)
        {

            // This is checking whether
            // the current element is
            // at the right place or not
            if (arr[i] != temp[i])
            {
                ans++;

                // Swap the current element
                // with the right index
                // so that arr[0] to arr[i] is sorted
                swap(arr, i, indexOf(arr, temp[i]));
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int indexOf(int[] arr, int ele)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }
}
// Driver class
class Main
{

    // Driver program to test
    // the above function
    public static void main(String[] args)
            throws Exception
    {
        //int[] a = {7, 1, 3, 2, 4, 5, 6 };
        int[] a = {2, 3, 4, 1, 5};
        // Output will be 5
        System.out.println(new Sample().minSwaps(a));
    }
}
// This code is contributed by Satvik Nema
