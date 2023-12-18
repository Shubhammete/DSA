package Assignmnents.Java_Basics;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ex = in.next();
        boolean isPalindrome = checkPalindrome(ex);
        if(isPalindrome){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }

    static boolean checkPalindrome(String ex){
        for(int i = 0; i<ex.length();i++){
            if(ex.charAt(i) != ex.charAt((ex.length() - 1) - i)){
                return false;
            }
        }
        return true;
    }
}
