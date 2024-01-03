package Class.Examples.ArrayExamples.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2};
        System.out.println(Arrays.toString(MisMatch(nums)));
    }

    static int[] MisMatch(int[] nums){

            int[] ans = new int[2];
            int i = 0;
            while(i<nums.length){

                if(nums[i] != nums[nums[i]-1]){
                    swap(nums,i,nums[i]-1);
                }else{
                    i++;
                }
            }
            for(int j = 0; j< nums.length;j++){
                if(nums[j] != j+1   ){
                    return new int[]{nums[j],j+1};
                }
            }

        return new int[]{-1};
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = arr[first];
    }
}
