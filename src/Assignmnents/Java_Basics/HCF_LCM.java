package Assignmnents.Java_Basics;
// remember HCF * LCM = Product of numbers
import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int max = 0;
        int min = 0;
        if (num1 > num2) {
            max = num1;
            min = num2;
        }else{
            max = num2;
            min = num1;
        }
        int gcd = GCD(max,min,num1,num2);
        System.out.println(gcd);
        System.out.println(LCM(max,min,num1,num2,gcd));
    }

    static int GCD(int max, int min, int num1,int num2) {
//       take smaller no equal to i
//            for (int i = min; i >= 2; i--) {
//                if (num1 % i == 0 && num2 % i == 0) {
//                    return i;
//                }
//    }
//
//

        while(num1%num2 != 0){
            int rem = num1%num2;
            num1 = num2;
            num2 = rem;
        }
        return num2;
    }

    static int LCM(int max,int min,int num1,int num2,int gcd){
        return num1 % num2 / gcd;

//        while(true){
//            if(max % num1 == 0 && max % num2 == 0){
//                return max;
//            }
//            max += 1;
//        }
    }
}
