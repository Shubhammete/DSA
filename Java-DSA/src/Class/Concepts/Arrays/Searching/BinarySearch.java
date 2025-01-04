package Class.Concepts.Arrays.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,14,21,23,45,66,90};
        int target = 23;
        System.out.println(binarySearch(arr,target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
//            int mid = (start + end) / 2;
            // this can give error of large value as int has limit to store values
            int mid = start + (end - start)/2;  // this can handle large values
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return  -1;
    }
}
