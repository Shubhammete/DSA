package Class.Concepts.BitManipulation;

public class Calapowb {
    public static void main(String[] args) {
        int base = 2;
        int ans = 1;
        int power = 6;

        while(power>0){
            int lastdigit = power&1;
            if(lastdigit == 1) {
                ans *= base;
            }
            power>>=1;
            base *=base;
        }
        System.out.println(ans);
    }
}
