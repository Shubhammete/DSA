package Class.Concepts.Arrays.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,5,2,3,1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] != arr[arr[i] -1]){
                swap(arr,i,arr[i]-1);
            }else{
                i++;
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
