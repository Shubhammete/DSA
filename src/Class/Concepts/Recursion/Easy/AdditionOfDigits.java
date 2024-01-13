package Class.Concepts.Recursion.Easy;

public class AdditionOfDigits {
    public static void main(String[] args) {
        System.out.println(addd(1345));
    }

    private static int addd(int n) {
        if(n==0){
            return 0;
        }
        return addd(n/10)+n%10;
    }
}
