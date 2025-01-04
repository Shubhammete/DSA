package Assignmnents.Java_Basics;

import java.util.Scanner;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("The sum of two numbers is "+sum(num1,num2));
    }
    static int sum(int a, int b){
        return a+b;
    }
}
