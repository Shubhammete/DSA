package Class.Concepts.Arrays.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {45,6,-9};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        for(int i = 0;i< arr.length - 1;i++){  // i<= arr.len-2 coz j=i+1 and if i = 0 array is sorted up to index 1, so we need only n-1 indices
            // j keeps checking to left, and strictly it must be less than 0
            for (int j = i+1; j>0;j--){
                // check only once as array on left side is already sorted
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
