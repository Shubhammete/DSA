package Assignmnents.Java_Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int finalyear = year;
        int count = 0;
        // check if year is in format of yyyy
        while(year>0){
            year /= 10;
            count++;
        }
        if(count == 4){
        if(finalyear%4 == 0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }}else{
            System.out.println("Enter Correct Year");
        }
    }
}
