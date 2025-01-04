package Class.Concepts.OOP.Static;

public class InnerClass {
    // here inner class is dependent on parent class as so, we have to keep it static

    static class Demo{
        String name;
        Demo(String _name){
            this.name = _name;
        }
    }

    public static void main(String[] args) {
        Demo a = new Demo("");
    }
}
