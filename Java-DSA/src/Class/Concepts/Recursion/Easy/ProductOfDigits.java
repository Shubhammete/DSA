package Class.Concepts.Recursion.Easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(product(1234));
    }

    static int product(int no){
        if(no%10==no){
            return no;
        }
        System.out.println(no%10);
        return product(no/10) * (no%10);

    }
}
