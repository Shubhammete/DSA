package Class.Examples.ArrayExamples.Basic_Examples;

public class MaxValueinArray {
    public static void main(String[] args) {
        int[] arr = {2,74,68,73,8};
        System.out.println("Max Value is "+max(arr));
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for(int item : arr){
            if(item>max){
                max = item;
            }
        }
        return max;
    }
}
