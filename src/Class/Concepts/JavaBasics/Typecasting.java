package Class.Concepts.JavaBasics;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Type Conversion you can do it from big to small ex-> float to int and not vice versa
        //float num = input.nextInt() ;   This is possible
        //        int num = input.nextFloat() ;   This is not possible

        // Typecasting
        int number = (int)(234.46f);

        //Automatic Type promotion in expressions
        byte c = 24;
        byte d = 24;
        int e = c*d;  // you cannot store value into byte as it exceeds limit -> byte e so automatically java promotes intermediate value to int
// small data type is promoted to bigger one if such case encounters
        byte b = 23;
        char r = 'a';
        short s = 1024;
        int i = 450000;
        float f = 5.67f;
        double g = 0.2345;
        double result = (f*b) + (i/r)-(g-s);
        // f*b byte will promote to float, in i/r char to int, in g-s short to double
        // float + int - double = double
        System.out.println(result);

        //
        int a = 258;
        byte j = (byte)(a);  // byte can store upto 256 so 257 exceeds is limit so output is
        System.out.println(b); // 257 % 256 = 1
        int wierd = 'A';
        System.out.print(wierd); // prints ASCII value of char

    }
}
