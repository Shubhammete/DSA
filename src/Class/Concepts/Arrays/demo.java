package Class.Concepts.Arrays;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] arr = {2,6,7,8};
        reverseanotherarray(arr);
    }
    static void reverseanotherarray(int[] arr){
        int[] revarr = new int[arr.length];
        for(int i = arr.length - 1;i>=0;i--){
            arr[(arr.length -1) - i] = arr[i];
        }
    }
}
