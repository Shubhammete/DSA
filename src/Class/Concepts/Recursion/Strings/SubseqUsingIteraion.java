package Class.Concepts.Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubseqUsingIteraion {
    public static void main(String[] args) {
        System.out.println(subset(new int[]{8,4,9}));
        System.out.println(duplicatesubset(new int[]{8,4,8}));
    }

    static List<List<Integer>> subset(int[] arr){
        // contains all lists that are basically combinations
        List<List<Integer>> outer = new ArrayList<>();
        // added empty array list
        outer.add(new ArrayList<>());
        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i<n;i++){
                // copy of ith array
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // adding elemetns in copy
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    // duplicate elements in array
    static List<List<Integer>> duplicatesubset(int[] arr){
        // sort the array
        Arrays.sort(arr);
        // contains all lists that are basically combinations
        List<List<Integer>> outer = new ArrayList<>();
        // added empty array list
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int j = 0;j<arr.length;j++){
            start = 0;
            // if current nad previous element is same, start = end + 1
            if(j>0 && arr[j]==arr[j-1]){
                start = end+1;
            }
            // to exclude duplicate element in each set i.e last set id [4,8] and not [4,8,8]
            end = outer.size()-1;
            int n = outer.size();
            for(int i = start; i<n;i++){
                // copy of ith array
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // adding elemetns in copy
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
