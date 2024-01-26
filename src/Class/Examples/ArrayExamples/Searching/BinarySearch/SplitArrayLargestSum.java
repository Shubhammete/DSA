package Class.Examples.ArrayExamples.Searching.BinarySearch;



public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 10, 8};
        int n = 2;
        System.out.println(findans(arr, n));

    }

//    private static int findans(int[] arr, int n) {
//        int max = 0;
//        for(int i =0;i<arr.length;i++){
//            max += arr[i];
//        }
//        int min = Integer.MAX_VALUE;
//        for(int i = 0;i<arr.length;i++){
//            if(min>arr[i]){
//                min = arr[i];
//            }
//        }
//        return BS(arr,min,max,n);
//    }

    // instead you can find max by using math function
    private static int findans(int[] arr, int n) {
        int start = 0;
        int end = 0;

        for(int i = 0;i<arr.length;i++){
            start = Math.max(start,arr[i]);  // min value of range i.e. max of array
            end +=arr[i];                    // max value of range i.e. sum of array
        }



        while(start<end){
            int mid = start + (end - start) /2;
            int sum = 0;
            int pieces = 1;    // no of partitions
            for(int num : arr){
                // if sum exceeds the mid them start from next element and increment pieces else keep adding elements
                if(sum+num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }

            // we divided array into few parts or equal to given limit, so we have to decrease the sum in range so end = mid and not -1 as it could be answer
            if(pieces <= n){
                end = mid;
            }else{
                // we divided array into more parts than given, so we have to increase the sum in range so start = mid + 1
                start = mid + 1;
            }
        }
        // At last start = end and this is final answer
        return end;
    }
}


