package Class.Concepts.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // initialization
        int[] arr = new int[5];
        int[] arr1 = {23,45,66};


        // array input
        for(int i = 0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        // array output
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

        // enhanced for loop element here is array element and not index
        for(int element : arr){
            System.out.println(element);
        }

        // to print array direct
        System.out.println(Arrays.toString(arr));
    }
}
