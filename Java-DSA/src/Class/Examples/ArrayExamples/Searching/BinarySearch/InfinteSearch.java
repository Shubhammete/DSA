package Class.Examples.ArrayExamples.Searching.BinarySearch;

public class InfinteSearch {
    public static void main(String[] args) {
        // assume this has unknown size
        int[] arr= {1,3,5,9,88};
        int target = 3;
        System.out.println(ans(arr,target));
     }

     static int ans(int[] arr, int target){
        // here start with range of two
        int start = 0;
        int end = 1;
        // condition for target find in range
         while(target > arr[end]){
             // new start
             int newStart = end + 1;
             // new end
             // end = previous-end + (prev box of size) * 2
             end = end + (end - start + 1) *2;
             start = newStart;
         }
         return BinarySearch(arr, target, start, end);
     }

     static int BinarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
     }
}
