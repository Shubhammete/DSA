package Class.Concepts.Arrays.Searching;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {90,78,65,44,33,23,9,8,7,6,4,4,3,2,2,1};
        int target = 23;
        System.out.println(BS(arr, target));
    }

    static int BS(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        // instead of if else use direct boolean values
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
