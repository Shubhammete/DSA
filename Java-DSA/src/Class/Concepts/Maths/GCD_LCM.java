package Class.Concepts.Maths;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(GCD(18,27));
        System.out.println(LCM(3,5));
    }

    static int GCD(int a, int b){
        if(a==0){
            return b;
        }
        return GCD(b%a,a);
    }

    static int LCM(int a, int b){
        return a*b/GCD(a,b);
    }
}
