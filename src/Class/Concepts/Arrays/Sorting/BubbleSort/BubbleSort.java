package Class.Concepts.Arrays.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        boolean swapped;
        int count = 0;
        // run the steps n-1 items
        for(int i = 0;i<arr.length;i++){
            swapped = false;
            count++;
                // for each step, max item will come at  the last index
            for(int j = 1; j <arr.length - i;j++){
                // swap the element if greater
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // stopping conditions
            if(!swapped){
                break;
            }
        }
        System.out.println(count);
        return arr;
    }
}
