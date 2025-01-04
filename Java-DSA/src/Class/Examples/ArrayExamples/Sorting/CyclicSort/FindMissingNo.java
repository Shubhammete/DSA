package Class.Examples.ArrayExamples.Sorting.CyclicSort;

import java.util.Arrays;

public class FindMissingNo {
    public static void main(String[] args) {
        int[] arr = {1,3,4,0};

        System.out.println(missingNo(arr));

    }

    static int missingNo(int[] arr){
        
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int j = 0; j<arr.length;j++){
            if(j !=arr[j]){
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr,int i,int ele){
        int temp = arr[i];
        arr[i] = arr[ele];
        arr[ele] = temp;
    }
}
