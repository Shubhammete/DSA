package Class.Examples.BasicExamples;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); // input no
        String revNum = "";  // rev string
        int length = Integer.toString(num).length();  // length of no
        while (length>0){
            int revdigit = num%10;  // retuns last no
            num = num/10;  // removes last digit
            revNum += Integer.toString(revdigit);   // adds last no to revNum string
            length--;
            // also we can use pure math and no conversion
        }
        int finalout = Integer.parseInt(revNum);  // conversts to num
        System.out.print(finalout);
    }
}
