package Class.Concepts.Recursion.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9,6,3,2,6,4};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr,int low, int high){
        if(low>=high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];

        while(start<=end) {
            // if pivot is greater than starting elements then just increment start
            while (arr[start] < pivot) {
                    start++;
            }
            // if pivot is smaller than end elements then just decrement end
            while (arr[end] > pivot){
                end--;
            }
            // swap the elements if above conditions break and swap them
            if(start<=end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // now pivot is at correct position so sort two halves
        sort(arr,low,end);  // end will be mid - 1  i.e. low == 0 and end == 0 will be no before pivot
        sort(arr,start,high);  // start will be mid + 1 i.e. start == no after pivot and high == arr.length
    }
}
