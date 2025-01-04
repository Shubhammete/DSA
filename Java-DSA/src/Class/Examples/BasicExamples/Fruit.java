package Class.Examples.BasicExamples;

import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        // .equals vs ==, "==" checks reference also like String a = "aaa" and String b = "aaa" if a and b are pointing to different aaa then it gives false and .equals checks only value and not reference
        if(fruit.equals("Mango")){
            System.out.println("Mango");
        }else{
            System.out.println("Other Fruit");
        }
    }
}
