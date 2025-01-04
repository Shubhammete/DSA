package Class.Examples.BasicExamples;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        System.out.println(checkArmstrongNo(no));
        AllArmstrongNo();
    }

     static void AllArmstrongNo() {
        for(int i = 100;i<1000;i++){
            if(checkArmstrongNo(i)){
                System.out.println(i+"is an ArmStrong No");
            }
        }
    }

    static boolean checkArmstrongNo(int no) {
        int sum = 0;
        int original = no;
        while(no>0){
            int rem = no%10;
            int cube = rem*rem*rem;
            sum += cube;
            no /= 10;
        }
        if (sum == original){
            return true;
        }
        return false;
    }
}
