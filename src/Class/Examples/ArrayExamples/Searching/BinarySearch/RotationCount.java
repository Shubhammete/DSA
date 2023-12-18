package Class.Examples.ArrayExamples.Searching.BinarySearch;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {5,6,0,1,2,3,4};
        System.out.println(count(arr));
    }

    static int count(int[] arr){
        int pivot = findPivot(arr);
        return pivot+1;
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
            // skip duplicate elements if mid = end = start is duplicate
            if(arr[mid] == arr[start] || arr[mid] == arr[end]){
                // check if start and end are pivot or not
                // start condition
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                // end
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
                // check condition for start and end by comparing it with mid
            }else if(arr[start] <= arr[mid] ||(arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }else{
                end = mid  - 1;
            }
        }
        return -1;
    }

}
