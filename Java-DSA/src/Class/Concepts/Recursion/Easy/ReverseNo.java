package Class.Concepts.Recursion.Easy;

public class ReverseNo {
    public static void main(String[] args) {
        Rev(123473);
        System.out.println(sum);
        System.out.println(revNum(23464));
    }
  static int sum = 0;
    private static void Rev(int i) {
        if(i == 0){
            return;
        }
        sum = (sum)*10 + i%10;
        Rev(i/10);
    }

    static int revNum(int n){
        int digits = (int)Math.log10(n)+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*((int)Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }


}
