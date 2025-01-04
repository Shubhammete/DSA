package Class.Examples.BasicExamples;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Choose the following option\n1) Celsius to Fahrenheit\n2) Fahrenheit to Celsius\n");
            System.out.println("Your Choice: ");
            int choice = in.nextInt();
            System.out.println("Enter the Temperature");
            float temp = in.nextFloat();
            if (choice == 1) {
                temp = (temp * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit is " + temp);
            }
            if (choice == 2) {
                temp = (temp - 32) * 5 / 9;
                System.out.println("Temperature in Celsius is " + temp);
            }
        }
}}
