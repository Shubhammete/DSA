package Assignmnents.Java_Basics;
import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Table of "+num);
        for(int i = 1; i<=10;i++){
            System.out.print(num+"*"+i+ ": ");
            System.out.println(num*i);
        }
    }
}
