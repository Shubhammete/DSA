package Class.Concepts.Arrays.Sorting;
// exchange sort and sinking sort
// space complexity O(1) = no extra space required i.e. no copying array etc. these type of are called as inplace sorting algorithms
import java.util.Arrays;

public class BubbleSortusingWhile {
    public static void main(String[] args) {
        int[] arr = {3,1,5,43,2};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr){
        int count = 0;
        int pass = 0;
        boolean flag = true;
        while(flag) {
            count = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i-1] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    count++;
                }

                if(count == 0){
                    flag = false;
                }

            }
            pass++;
        }
        System.out.println(pass+1);


            return arr;


    }
}
