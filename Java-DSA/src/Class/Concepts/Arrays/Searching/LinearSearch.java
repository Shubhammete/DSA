package Class.Concepts.Arrays.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8,4,33,6,4,22,5};
        int target = 4;
        System.out.println(linearSearch(arr,target));
    }

    private static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return -1;
        }
        for(int index = 0; index < arr.length;index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
