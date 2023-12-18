package Assignmnents.Java_Basics;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean isEven = checkEven(num);
        if(isEven){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
    static boolean checkEven(int num){
        return num%2 == 0;
    }
}
