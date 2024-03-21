package Class.Concepts.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        BoxWeight newBox = new BoxWeight(1,2,3,5,45); // here we cannot initialize the parent class variables directly so, we have to pass all values including l b h and weight
        System.out.println(newBox.h+" ");
//        System.out.println(newBox.secret);   we cannot access it as it is private only we can initialize it


        Box demo = new BoxWeight(1,2,3,4,5); // here we create obj demo of Box with class BoxWeight instance
//        System.out.println(demo.weight); we cannot access the child class as we have created type Box and not BoxWeight

        // BoxWeight not_possible = new Box(1,2,3) // we cannot assign child class object to parent class instance and parent class has no idea about variables in child class

        BoxWeight demo2 = new BoxWeight(newBox,3);
    }
}
