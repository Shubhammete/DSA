package Class.Concepts.String;


import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Shubham Mete";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
