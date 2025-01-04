package Class.Concepts.JavaBasics;
import java.util.Arrays;

public class Methods {

    static int global = 23;
    public static void main(String[] args) {

        String name = "Shubham";
        changeName(name);  // here we pass value and make naam pointing to "Shubham" but in function we are not changing original value, but we are creating a new object "Kunal"
        // in primitive data types we pass value and not reference so the value is not modified
        System.out.println(name);
        // in non-primitive expect String as it is not mutable we pass value by reference so the value gets modified as reference is passed
        int[] arr = {1,3,4};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
        int num1 = 23;
        {
//            int num1 = 23; // we cannot reinitialise the value in block
            num1 = 44; // it changes global value as it does not create new object original object is changed
            int ha = 23; //but you cannot access block value outside block and can be used in block only
        }
        System.out.println(num1); // gives 44 output
        //System.out.println(ha); // cannot use ha outside block scope

        System.out.println(global); // output 23
        int global = 45;  // reinitialise global variable called shadowing
        System.out.println(global); // output 45

        // var agrs
        varSum(3,5,7,7,5,32,2,4,5);

        // method overloading
        // function with same name but different data types arguments or same datatype but diff no of arguments
        fun(23);
        fun("Shubham");
        fun(2,4);
    }

    private static void varSum(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    private static void changeArr(int[] arra) {
        arra[0] = 3;
    }

    static void changeName(String naam) {
        // naam has local scope and cannot use outside function
        naam = "Kunal";
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(int a, int b){
        System.out.println(a+b);
    }
    static void fun(String a){
        System.out.println(a);
    }
}
