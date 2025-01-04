package Class.Concepts.Recursion.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,2,5,6,7,8,7,55,4,333,45,5,53};
        sort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int row, int col,int max) {
        if(row==0){
            return;
        }
        if(row>col){
            // finds max element in array and pass it as max in argument
            if(arr[col]>arr[max]){
                sort(arr,row,col+1,col);
            }else {
                // else keep first max as it is
                sort(arr, row, col+1, max);
            }
        }else{
            // swap and set last index as max
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;
            // reduce the row
            sort(arr,row-1,0,0);
        }
    }
}
