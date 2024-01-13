package Class.Concepts.Maths;

public class NewtonSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5*(x+(n/x)); // newtons formula

            if(Math.abs(root-x)<0.1){  // error<1 for more accuracy reduce 1 (ex:- 0.5)
                break;
            }
            x = root;   // reassign x = root;
        }
        return root;
    }
}
