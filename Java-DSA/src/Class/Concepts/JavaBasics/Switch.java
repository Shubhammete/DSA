package Class.Concepts.JavaBasics;

import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char opr = input.next().trim().charAt(0);

        switch (opr){
            case '+':
                System.out.println("Addition");
                break;
            case '-':
                System.out.println("Subtraction");
                break;
            default:
                System.out.println("Default");
        }

        System.out.print(switch (opr) {
            case '+' -> "Addition";
            case '-' -> "Subtraction";
            case '*' -> "Multiplication";
            case '/' -> "Division";
            default -> "Enter Valid Operations";
        });
        int day = input.nextInt();
        System.out.println(switch(day){
            case 1, 2, 3, 4, 5-> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Enter Valid Operations";
        });
    }
}
