package Assignmnents.Conditionals_and_Loops;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Factorial is "+findFactorial(num));
    }

    static int findFactorial(int num){
        int ans = 1;
        if(num != 0 ){
            for(int i = num; i>=1; i--){
                ans *= i;
            }
            return ans;
        }
        return 1;
    }
}
