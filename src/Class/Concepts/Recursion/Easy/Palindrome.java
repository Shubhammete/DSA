package Class.Concepts.Recursion.Easy;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palin(12345432));
    }


    static boolean palin(int n){
        return n == revNum(n);
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
