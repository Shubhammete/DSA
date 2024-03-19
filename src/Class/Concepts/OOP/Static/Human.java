package Class.Concepts.OOP.Static;

public class Human {
    public static void main(String[] args) {
        Person kunal = new Person(23,"Kunal");
//        System.out.println(kunal.population);  here output is 1 as we have created person after this line
        Person shubham = new Person(22,"Shubham");
        System.out.println(kunal.population);
        System.out.println(shubham.population);

        // you can even call static variable without creating objects
        System.out.println(Person.population);
//        greeting();   cannot access non-static inside static
    }

    // static is dependent on object
    void greeting(){
        System.out.println("Greet");
    }

    // we use non-static in non-static
    void nonStat(){
        greeting();
    }
    static void callGreeting(){
//        greeting();
        // here we have to reference it to object
        Human obj = new Human();
        obj.greeting();
    }
}
