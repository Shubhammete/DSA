package Class.Examples.BasicExamples;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        System.out.println(checkPrime(no));
    }

    static String checkPrime(int no) {
        int c = 2;
        while(c<no){
            if(no%c == 0){
                return "Not Prime";
            }
            c++;
        }
        return "Prime";
    }
}
