package Assignmnents.Java_Basics;

import java.util.Scanner;

public class StopAtX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(in.hasNext()){
            if(in.hasNextInt()){
                int num = in.nextInt();
                sum += num;
            }else{
                String xin = in.next();
                if(xin.equals("x")){
                    System.out.println(sum);
                    break;
                }
            }
        }

    }
}
