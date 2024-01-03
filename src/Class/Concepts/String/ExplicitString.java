package Class.Concepts.String;

public class ExplicitString {
    public static void main(String[] args) {
        String a = "Shubh";
        String b = "Shubh";

        String a1 = new String("Shubh");
        String b1 = new String("Shubh");
        System.out.println(a == b);  // true
        System.out.println(a1 == b);  // false
        System.out.println(a1 == b1);  // false
        System.out.println(a.equals(b));  // true
        System.out.println(a1.equals(b));  // true
        System.out.println(a1.equals(b1)); // true

        // Wrapper Class
        Integer num;
        num = new Integer(3);
        System.out.println(num.toString());
    }
}
