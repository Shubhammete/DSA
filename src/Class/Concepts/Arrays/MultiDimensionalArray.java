package Class.Concepts.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] demoarr = new int[3][];// here no of columns are not necessary to specify
        int[][] arr = new int[3][2];
        int [][] arr1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // input
        for (int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        }

        //output
        for (int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //1 2
        //3 4
        //5 6

        for (int i = 0;i<arr.length;i++){
                System.out.println(Arrays.toString(arr[i]));
        }
        for(int[] ar: arr){
            System.out.println(Arrays.toString(ar));
        }
        //[1, 2]
        //[3, 4]
        //[5, 6]

    }
}
