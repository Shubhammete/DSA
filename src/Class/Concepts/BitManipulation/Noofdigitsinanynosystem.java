package Class.Concepts.BitManipulation;

public class Noofdigitsinanynosystem {
    public static void main(String[] args) {
        int number = 345;
        int base = 10;
        int len = (int)(Math.log(number)/Math.log(base)) + 1;
        System.out.println(len);
    }
}
