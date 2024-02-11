package Class.Examples.ArrayExamples.Searching.BinarySearch;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class PeakinMountainArray {
    public static void main(String[] args) {
        // in bitonic array its like {5,6,7,8,9,4,3,2,1}  increasing and decreasing type here peak element is 9
        int[] arr = {1,2,3,5,7,4,3,2,1};
        System.out.println(BS(arr));
    }

    private static int BS(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int i = 0;
        while(start<end){
            i++;
            int mid = start + (end - start) / 2;

            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                System.out.println(i);
                return arr[mid];
            }
            if(arr[mid] > arr[mid + 1]){
                // here mid can be possible answer so not mid -1
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(i);
        return arr[end];
    }
}
