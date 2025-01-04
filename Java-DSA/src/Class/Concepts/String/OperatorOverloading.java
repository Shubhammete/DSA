package Class.Concepts.String;

import java.util.ArrayList;

public class OperatorOverloading {
    // overloading is not supported in Java like C++ and python as it results in poor code, so only it supports only string operations
    public static void main(String[] args) {
        System.out.println('a'+'z');  // char are converted into ASCII values, and they get added up
        // 219
        System.out.println("a"+"z");  // creates seperate object az
        //az
        System.out.println('a'+3);
        // 100
        System.out.println((char)('a'+3));
        //d
        System.out.println("a"+3); // int this int is converted into wrapper class and its toString method is used i.e. "a"+"3"
        //a3
        System.out.println("a"+'b');
        // ab
        System.out.println("Kunal" + new ArrayList<>());
        // Kunal[]
        System.out.println("Kunal" + new Integer(22));
        // Kunal22
//        System.out.println(new ArrayList<>()+new Integer(23));
        // inorder to do operation at least one of operand must be string
        System.out.println(new ArrayList<>() + ""+ new Integer(23));  // this will work coz here we add empty string
    }
}
