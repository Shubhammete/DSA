package Class.Concepts.Maths;

public class SqrtBinarySearch {
    public static void main(String[] args) {
        int no = 36;
        int start = 0;
        int end = no;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid*mid == no){
                System.out.println(mid);
            }
            if(mid*mid<no){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }
    }
}
