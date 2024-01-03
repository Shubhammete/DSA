package Class.Concepts.BitManipulation;

public class NoofSetBits {
    public static void main(String[] args) {
        int a = 23;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(count(a));
    }
    static int count(int n){
        int count = 0;
        while(n>0){

//            if((n&1)==1){
//                count++;
//            }
//            n>>=1;

//            n = n-(n&-n);
//            count++;

            n = n & (n-1);
            count++;
        }
        return count;
    }
}
