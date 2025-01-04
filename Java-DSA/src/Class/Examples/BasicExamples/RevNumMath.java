package Class.Examples.BasicExamples;

import java.util.Scanner;

public class RevNumMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int ans = 0;

        while(num>0){
            int rem = num%10;  // gives last no
            num /=10;          // removes last digit
            ans = ans*10 + rem;   //
        }

        System.out.println(ans);
    }
}
