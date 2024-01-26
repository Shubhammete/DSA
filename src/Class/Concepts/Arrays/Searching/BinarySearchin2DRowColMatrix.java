package Class.Concepts.Arrays.Searching;

import java.util.Arrays;

public class  BinarySearchin2DRowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10,12,23},
                {11,13,25},
                {13,15,27}
        };
        int target = 13;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr,int target){
        int row = 0;
        int col = arr.length -1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == target){
                return new int[]{row,col};
            }

            // target is greater skip col as all ahead elements are greater
            if(arr[row][col] > target){
                col--;
            }else{
                // target is smaller search in same column just increase row
                row++;
            }
        }

        return new int[]{-1,-1};
    }

}
