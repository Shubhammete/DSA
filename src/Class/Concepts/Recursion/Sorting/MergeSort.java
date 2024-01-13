package Class.Concepts.Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{2,7,4,3,55,7,56,333,5,455})));
    }

    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length /2;
        int[] left = sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length+right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        // remaining elements
        while (i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j<right.length){
            mix[k] = right[j];
            j++;
            k++;
        }

        return mix;
    }
}
