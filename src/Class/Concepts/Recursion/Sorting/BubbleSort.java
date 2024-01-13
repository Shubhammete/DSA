package Class.Concepts.Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= new int[]{2,35,2,5,99,2,5,6,4,2};
        sort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            if(arr[col]>arr[col+1]){
                swap(arr,col,col+1);
            }
                sort(arr,row,col+1);

        }else{
            sort(arr,--row,0);
        }

    }

    private static void swap(int[] arr, int col, int i) {
        int temp = arr[col];
        arr[col] = arr[i];
        arr[i] = temp;
    }
}
