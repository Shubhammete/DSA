package Class.Examples.BasicExamples;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); // trim clears all space in front of string and charAt(index) gives char at given index
        System.out.println(ch);
        if(ch >='a' && ch<'z'){
            System.out.println("Small Case");
        }else if(ch>='A' && ch<'Z'){
            System.out.println("Upper Case");
        }


    }
}
