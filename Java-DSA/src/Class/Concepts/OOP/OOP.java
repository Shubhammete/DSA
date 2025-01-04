package Class.Concepts.OOP;

import java.util.Arrays;
import Class.Concepts.OOP.demo.Greet;

import static Class.Concepts.OOP.demo.Greet.greeting;

public class OOP {
    public static void main(String[] args) {

        final int no = 23; // final does not let to change reference i.e. we cannot modify it and need to be initialized every time
        Student kunal = new Student(27,"Kunal");
        System.out.println(kunal.name + kunal.roll_no);

        Student shubh = new Student();
        System.out.println(shubh.name+shubh.roll_no);

        Student other = new Student(kunal);
        System.out.println(other.name+other.roll_no);

        final Student demo = new Student();
//        demo = new Student();   cannot assign new class
        demo.name = "";  // we can assign values to its variables

        // here we import the statement from another package using import static ......
        greeting();
    }

    static class Student {
        int roll_no = 23 ;
        String name = "Shubham";

        // default constructor which has no parameters
        // this binds the name to object
//        Student(){
//            this.roll_no = 01;
//            this.name = "default";
//        }
        // constructor with parameters
        Student(int roll_no, String naam){
//            roll_no = roll_no;  if name is same use this keyword to set the reference to object
            this.roll_no = roll_no;
            name = naam;  // here name is different, so we can assign name to naam
        }

        // constructor passing properties of another constructor
        Student(Student other){
            this.roll_no = other.roll_no;
            this.name = other.name;
        }

        // calling the constructor using this in default empty constructor

        Student(){
            // this will call another constructor form this constructer
            this(23,"default");
        }
    }
}
