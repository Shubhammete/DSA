package Class.Concepts.BitManipulation;

public class Calapowb {
    public static void main(String[] args) {
        int base = 2;
        int ans = 1;
        int power = 6;

        while(power>0){
            // last bit of number
            int lastdigit = power&1;
            // if set bit then multiply answer with base
            if(lastdigit == 1) {
                ans *= base;
            }
            // remove last bit
            power>>=1;
            // increase base in it
            base *=base;
        }
        System.out.println(ans);
    }
}
