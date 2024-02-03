package Class.Examples.ArrayExamples.Searching.BinarySearch;

public class FindCeilElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,13,14,15,23,26,27,33,36,40};
        int target = 17;
        // ceil number is the smallest element which is greater than equal to target
        System.out.println(findCeil(arr,target));
    }
    static int findCeil(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        // corner case for ceiling number: if target number is larger that greatest number in array no ceiling no
        if(target>arr[arr.length-1]){
            return -1;
        }



        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            if(isAsc)
            if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }else{
                if(arr[mid] > target){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return arr[start];   // return end in case of floor
    }
}
