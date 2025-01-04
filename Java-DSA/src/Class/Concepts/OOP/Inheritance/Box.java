package Class.Concepts.OOP.Inheritance;

public class Box {
    int l;
    int b;
    int h;

    private int secret;  // only used within this class and not outside even in child class even we cannot print it with class object

    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    Box(int side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(int l,int b, int h,int secret){
        this.l = l;
        this.b = b;
        this.h = h;
        this.secret = secret;  // we can initialize the private var
    }

    Box(Box another){
        this.l = another.l;
        this.b = another.b;
        this.h = another.h;
    }
}
