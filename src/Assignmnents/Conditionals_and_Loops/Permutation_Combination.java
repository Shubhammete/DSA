package Assignmnents.Conditionals_and_Loops;

import java.util.Scanner;

public class Permutation_Combination {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n and r ");
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println("Permutation is "+ nPr(n,r));
        System.out.println("combination is "+ nCr(n,r));
    }

    static int nPr(int n,int r){
        return (fact(n)/fact(n-r));
    }

    static int nCr(int n, int r) {
        return (fact(n)/(fact(r)*fact(n-r)));
    }

    static int fact(int num){
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
