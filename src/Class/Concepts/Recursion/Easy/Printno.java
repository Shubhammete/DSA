package Class.Concepts.Recursion.Easy;

public class Printno {
    public static void main(String[] args) {

        fxn(1);
        System.out.println();
        fxn2(5);
        System.out.println(
        );
        fxn3(5 );
    }

    //reverse no print
    private static void fxn2(int i) {
        if(i==0){
            return ;
        }
        System.out.println(i);
        fxn2(i-1);
    }

    // print no normally
    static void fxn(int n){
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fxn(n+1);
    }

    // print no normally by removing functions from callstack
    static void fxn3(int n){
        if(n==0){
            return;
        }
        fxn3(n-1);
        System.out.println(n);
    }
}
