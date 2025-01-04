package Class.Concepts.Recursion.Easy;

public class n__vs__n {
    public static void main(String[] args) {
        System.out.println(fxn(5));
    }

    private static int fxn(int i) {
        return fxn(i--);  // it will form infinite loo
    }
}
