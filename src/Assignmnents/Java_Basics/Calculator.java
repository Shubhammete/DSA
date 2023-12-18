package Assignmnents.Java_Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the operation symbol +,-,*,/");
        char opr = in.next().charAt(0);
        System.out.println("Enter both numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if(opr == '+'){
            System.out.println("Sum is "+(num1+num2));
        }
        if(opr == '-'){
            System.out.println("Difference is "+(num1-num2));
        }
        if(opr == '*'){
            System.out.println("Product is "+(num1*num2));
        }
        if(opr == '/'){
            System.out.println("Division is "+(num1/num2));
        }
    }
}
