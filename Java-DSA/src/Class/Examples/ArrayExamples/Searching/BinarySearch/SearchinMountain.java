package Class.Examples.ArrayExamples.Searching.BinarySearch;

public class SearchinMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,3,2};
        int target = 2;
        int peakelem = BS(arr);
        int firsthalf = findindex(arr,target,0,peakelem);
        if(firsthalf!=-1){
            System.out.println(firsthalf);
        }else{
            System.out.println(findindex(arr,target,peakelem,arr.length - 1));;
        }
    }
    private static int BS(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start<end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                // here mid can be possible answer so not mid -1
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    static int findindex(int[] arr, int target, int start,int end){
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}


