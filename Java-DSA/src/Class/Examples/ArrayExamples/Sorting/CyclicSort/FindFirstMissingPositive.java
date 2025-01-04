package Class.Examples.ArrayExamples.Sorting.CyclicSort;

import java.util.Arrays;

public class FindFirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(MissingPositive(nums));
    }

    static int MissingPositive(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i]>0 && arr[i]<arr.length && arr[i] != arr[arr[i]-1]){
                swap(arr,i,arr[i]-1);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j = 0; j< arr.length; j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }
        return arr.length + 1;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
