package Class.Examples.ArrayExamples.Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNos {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(AllMissingNo(arr));
    }

    static List<Integer> AllMissingNo(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] != arr[arr[i] - 1]){
                swap(arr,i,arr[i]-1);
            }else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int j = 0; j<arr.length;j++){
            if(j+1 != arr[j]){
                ans.add(j+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
