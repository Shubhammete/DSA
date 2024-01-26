public class demo {
    public static void main(String[] args) {
        int[] arr = {5,6,7,1,2,3,4,5};
        int pivot = findpivot(arr);
        System.out.println(pivot);
    }

    private static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                return arr[mid];
            }
//            if(arr[mid]<arr[mid-1]){
//                return arr[mid-1];
//            }
            if(arr[mid]>arr[start]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
    return -1;
    }
}
