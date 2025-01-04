package Assignmnents.Java_Basics;

import java.util.Scanner;

public class GreetingMsg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        greetme(name);
    }
    static void greetme(String name){
        System.out.println("Hello "+name);
    }
}
