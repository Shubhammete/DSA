package Class.Examples.BasicExamples;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number up to which we have to find Fibonacci sequence: ");
        int n = input.nextInt();
        int first =0;
        int second = 1;
        int result = 0;
        for(int i = 2; i<=n;i++){
            result= first + second;
            first = second;
            second = result;
        }
        System.out.print(result);
    }
}
