package Class.Examples.ArrayExamples.Searching.BinarySearch;

public class FindFloorElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,13,14,15,23,26,27,33,36};
        int target = 37;
        // floor number is the greatest element which is smaller than equal to target
        System.out.println(findFloor(arr,target));
    }

    private static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start]<arr[end];

        // corner case: if target is smaller than the smallest element in array
        if(target < arr[0]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return arr[end];
    }
}
