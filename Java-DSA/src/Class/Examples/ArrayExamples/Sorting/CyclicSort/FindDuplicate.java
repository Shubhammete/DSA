package Class.Examples.ArrayExamples.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3,3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
//        int i = 0;
//        while (i < nums.length) {
//            if (nums[i] != nums[nums[i] - 1]) {
//                swap(nums, i, nums[i]-1);
//            } else {
//                i++;
//            }
//        }
//        for(int j = 0;j<nums.length;j++){
//            if(nums[j] != j+1){
//                return nums[j];
//            }
//        }

        // do all things in one loop
        int i = 0;
        while(i<nums.length){
            // check if element is at correct index
            if(nums[i] != i+1){
                // if not check correct index of element has element
                if(nums[i] != nums[nums[i]-1]){
                    swap(nums,i,nums[i]-1);
                    // if yes then it is duplicate
                }else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}