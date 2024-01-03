package Class.Concepts.Recursion;

public class BSwithRecursion {
    public static void main(String[] args) {
        int target = 23;
        int[] arr = {2,4,7,13,19,23,45,66,89,93};
         System.out.println(BS(arr,target,0,arr.length-1));
    }
    static int BS(int[] arr,int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]<target){
            BS(arr,target,mid+1,end);
        }else{
             BS(arr,target,start,mid-1);
        }
        return -2;
    }
}
