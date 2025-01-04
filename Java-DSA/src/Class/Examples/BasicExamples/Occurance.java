package Class.Examples.BasicExamples;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1237647567;

        int length = Integer.toString(num).length(); // no need of this in case of num>0

        int check = input.nextInt();
        int count = 0;
        while(length>=0){  // num>0
            if(num%10 == check) {  // num%10 gives last no
                count++;
            }
            num = num/10;   // num/10 removes last no
            length--;   // remove in case of num>0
        }
        System.out.print(count);
    }
}
