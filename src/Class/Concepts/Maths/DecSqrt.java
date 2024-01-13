package Class.Concepts.Maths;

public class DecSqrt {
    public static void main(String[] args) {
        int no = 40;
        int precision = 3;
        System.out.printf("%3f",sqrt(no,precision));
    }

    static double sqrt(int no, int precision){
        int start = 0;
        int end = no;
        double root = 0.0;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid*mid ==no){
                return mid;
            }
            if(mid*mid<no){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        double increment = 0.1;
        for(int i = 0; i<precision;i++){
            while(root*root<no){
                root += increment;  // add 0.1 here
            }
            root -= increment;  // delete one extra 0.1
            increment /=10;   // 0.1 to 0.01 and so on
        }
        return root;
    }
}

