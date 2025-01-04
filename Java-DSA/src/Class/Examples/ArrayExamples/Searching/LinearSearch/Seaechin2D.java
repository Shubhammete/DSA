package Class.Examples.ArrayExamples.Searching.LinearSearch;

import java.util.Arrays;

public class Seaechin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,55,67},
                {22,5},
                {34,55,22,57}
        };
        int target = 55;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(target == arr[i][j]){
                    System.out.println(arr[i][j]+" Present at "+(int)(i+1)+"th row and "+(int)(j+1)+"th column");
                }
            }
        }
        System.out.println(Arrays.toString(search(arr,target)));
    }

    private static int[] search(int[][] arr, int target) {
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(target == arr[i][j]){
                return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
