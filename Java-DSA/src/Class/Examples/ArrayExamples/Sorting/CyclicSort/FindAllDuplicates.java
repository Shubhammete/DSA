package Class.Examples.ArrayExamples.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
        public static void main(String[] args) {
            int[] nums = {1, 3,3, 4, 2, 2};
            System.out.println(findDuplicate(nums));
        }

        static List<Integer> findDuplicate(int[] nums) {
            List<Integer> ans = new ArrayList<>();
            int i = 0;
            while(i<nums.length){

                    if(nums[i] != nums[nums[i]-1]){
                        swap(nums,i,nums[i]-1);
                    }else{
                        i++;
                    }
            }
            for(int j = 0; j< nums.length;j++){
                if(nums[j] != j+1){
                    ans.add(nums[j]);
                }
            }
            return ans;
        }

        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }
