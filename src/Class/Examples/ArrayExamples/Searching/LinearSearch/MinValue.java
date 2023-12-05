package Class.Examples.ArrayExamples.Searching.LinearSearch;

public class MinValue {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,4,33,-9,4,22,5};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min = arr[0];
        for(int i = 0; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
