package Class.Concepts.OOP.Static;

public class StaticBlocks {
    static int a = 2;
    static int b ;

    // gets executed as we created object and only run once i.e. only when first object is created
    static {
        System.out.println("I am executed as we create object");
        b = a*5;
    }

    public static void main(String[] args) {
        // executes static block as soon as object is created
        StaticBlocks obj = new StaticBlocks();
        System.out.println(obj.a + " "+ obj.b);
    }
}
