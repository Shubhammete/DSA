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
            start = Math.max(start,arr[i]);
            end +=arr[i];
        }



        while(start<end){
            int mid = start + (end - start) /2;
            int sum = 0;
            int pieces = 1;
            for(int num : arr){
                if(sum+num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum+=num;
                }
            }

            if(pieces > n){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }
}


