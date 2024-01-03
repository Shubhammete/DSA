package Class.Concepts.Recursion;

public class Printno {
    public static void main(String[] args) {
        fxn(1);
    }
    static void fxn(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fxn(n+1);
    }
}
