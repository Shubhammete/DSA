package Assignmnents.Conditionals_and_Loops;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pie = 3.14;
        System.out.println("Select shape to find area of \n" +
                "1) Circle " +
                "2) Triangle " +
                "3) Rectangle " +
                "4) Isoceles triangle " +
                "5) Parallelogram " +
                "6) Rhombus "+
                "7) Equilateral triangle \n");
        int choice = in.nextInt();
        if(choice == 1){
            System.out.println("Enter the radius of circle \n");
            int radius = in.nextInt();
            System.out.println("The Area of circle is "+(pie*radius*radius));
        }
        if(choice == 2){
            System.out.println("Enter base and height");
            int base = in.nextInt();
            int height = in.nextInt();
            System.out.println("The area of triangle is "+ (0.5*base*height));
        }
        if(choice == 3){
            System.out.println("Enter length and breadth of rectangle ");
            int length = in.nextInt();
            int breadth = in.nextInt();
            System.out.println("The area of rectangle is "+(length*breadth));
        }
        if(choice == 4){
            System.out.println("Enter base and height");
            int base = in.nextInt();
            int height = in.nextInt();
            System.out.println("The area of triangle is "+ (0.5*base*height));
        }
        if(choice == 5){
            System.out.println("Enter base and height");
            int base = in.nextInt();
            int height = in.nextInt();
            System.out.println("The area of parallelogram is "+ (base*height));
        }
        if(choice == 6){
            System.out.println("Enter both diagonals ");
            int dig1 = in.nextInt();
            int dig2 = in.nextInt();
            System.out.println("The area of rhombus is "+ (dig1*dig2*0.5));
        }
        if(choice == 7){
            System.out.println("Enter side of triangle ");
            int side = in.nextInt();
            System.out.println("The area of triangle is "+(0.433*side*side));
        }
    }
}
