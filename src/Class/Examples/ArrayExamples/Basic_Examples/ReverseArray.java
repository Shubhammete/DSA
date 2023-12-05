package Class.Examples.ArrayExamples.Basic_Examples;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2,6,7,9, 8};
        System.out.println("Reversed Array "+ Arrays.toString(reverse(arr)));
    }
    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
