package Assignmnents.Java_Basics;

import java.util.Scanner;

public class PythogoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input variables
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        // finds max number
        int maxno = max(a,b,c);
        // store number other than max
        int num1 = 0;
        int num2 = 0;
        if(maxno!= a && num1 == 0){
            num1 = a;
        }else if(maxno!= a){
            num2 = a;
        }
        if(maxno!= b && num1 == 0){
            num1 = b;
        }else if(maxno!= b){
            num2 = b;
        }
        if(maxno!= c && num1 == 0){
            num1 = c;
        }else if(maxno!= c){
            num2 = c;
        }
        System.out.println(num1+"  "+num2);
        //checks for Triplet condition
        boolean isTriplet = checkTriplet(maxno,num1,num2);
        if(isTriplet){
            System.out.println("Triplet");
        }else{
            System.out.println("No Triplet");
        }
    }

    static int max(int a,int b,int c){
        int maxno = a;
        if(maxno<b){
            maxno = b;
        } if(maxno < c){
            maxno = c;
        }

        return maxno;
    }

    static boolean checkTriplet(int max, int num1,int num2){
        return (max*max) == (num1*num1) + (num2*num2);
    }
}
