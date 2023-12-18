package Class.Examples.ArrayExamples.Searching.BinarySearch;

public class BSinRotatedSortedArray {
    public static void main(String[] args) {
//        int[] arr = {4,4,4,5,6,23,0,1,1,2,2,2,3};
//        int target = 4;
        int[] arr = {5,6,0,1,2,3,4};
        int target = 2;
        System.out.println(ans(arr,target));


    }

    static int ans(int[] arr,int target){
        int pivot = findPivot(arr);
        if(arr[pivot] == target){
            return pivot;
        }
        if(pivot == -1){
            return BS(arr,target,0, arr.length - 1);
        }

        if(arr[0]<=arr[target]){
            return BS(arr,target,0,pivot-1);
        }else{
            return BS(arr,target,pivot+1, arr.length-1);
        }

    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=start){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    static int BS(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                }else{
                    end = mid -1;
                }
            }else{
                if (arr[mid] < target) {
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
