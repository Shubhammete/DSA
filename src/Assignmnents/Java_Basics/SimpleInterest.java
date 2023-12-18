package Assignmnents.Java_Basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principal amount");
        int principal_amount = in.nextInt();
        System.out.println("Enter the Rate");
        int rate = in.nextInt();
        System.out.println("Enter time");
        int time = in.nextInt();
        System.out.println("The simple interest is "+findSI(principal_amount,rate,time));
    }

    static int findSI(int amount, int rate, int time){
        return (amount*rate*time)/100;
    }
}
