package Class.Examples.ArrayExamples.Basic_Examples;

import java.util.Arrays;
import java.util.Scanner;

public class SwapNos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,4,6,7,8};
        System.out.println("Enter first index to swap");
        int index1 = in.nextInt();
        System.out.println("Enter second index to swap");
        int index2 = in.nextInt();
        System.out.println("original array is"+ Arrays.toString(arr));
        swap(arr,index1,index2);
        System.out.println("Changed array is"+ Arrays.toString(arr));
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
