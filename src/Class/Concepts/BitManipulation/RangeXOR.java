package Class.Concepts.BitManipulation;

public class RangeXOR {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(XOR(a));
        // XOR in range
        int x = 3;
        int y = 9;
        int ans = XOR(y)^XOR(x-1);
        System.out.println(ans);
    }

    static int XOR(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        if(a%4==3){
            return 0;
        }
        return -1;
    }
}
