package Class.Concepts.Recursion.Sorting;

import java.util.Arrays;

public class InplaceMergeSort {
    public static void main(String[] args) {
        int[] arr =new int[]{23,55,7,5,2};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int start, int end){
        if(end-start == 1){
            return;
        }
        int mid = start + (end-start)/2;
        sort(arr,start,mid);
        sort(arr,mid,end);

         merge(arr,start,mid,end);
    }

    static void merge(int[] arr, int start, int mid, int end){
        // new array of size of left + right
        int[] mix = new int[end-start];
        // pointers for original array
        int i = start;
        int j = mid;
        // pointer for mix
        int k = 0;

        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j<end){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int l = 0;l<mix.length;l++){
            arr[start+l] = mix[l];
        }
    }
}
