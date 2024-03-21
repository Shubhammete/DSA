package Class.Concepts.OOP.Inheritance;

public class BoxWeight extends Box {
    int w;
    int h;
    BoxWeight(int l, int h, int b, int w, int secret){
        super(l,h,b,secret);  // super is used to call parent class constructor
        System.out.println(this.h); // calls h from this object
        System.out.println(super.h); // calls h from parent class
        this.w = -1;

        // super()   we cannot use super after the local var init as child class must have info about base class first
    }

    BoxWeight(BoxWeight other, int w){  // we can pass child class to parent class constructor
        super(other);
        this.w = w;
    }
}
