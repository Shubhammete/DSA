package Class.Concepts.Arrays.Sorting.InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {45,6,-9};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        for(int i = 0;i< arr.length - 1;i++){  // i<= arr.len - 2
            for (int j = i+1; j>0;j--){
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
