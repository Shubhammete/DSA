package Class.Concepts.OOP.Static;

public class Person {
    int age;
    String name;
    static int population;  // static var is used to create var which is not dependable on object and is same for each object
    // we cannot use this in static as this represents objects and static is object independent
    static void greet(){
        System.out.println("Hello");
//        System.out.println(this.age);   here it throws error
    }

    void greet2(){
        System.out.println(this.age);
    }
    public Person(int age, String name){
        this.age = age;
        this.name = name;
        // static var is reference using original class and not objects
        Person.population +=1;
    }

}



