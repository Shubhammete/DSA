package Class.Concepts.Recursion.Easy;

public class FibonacciNo {
    public static void main(String[] args) {
        System.out.println(printFbNo(4));
    }
    static int printFbNo(int n){
        if(n<2){
            return n;
        }
        return printFbNo(n-1)+printFbNo(n-2);
    }
}
