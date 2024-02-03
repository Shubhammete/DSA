package Class.Examples.Recursion.Permutations;

public class diceroll {
    public static void main(String[] args) {
        dice("",4);
        // custom faced dice
        dicecustom("",4,8);
    }

    private static void dicecustom(String p, int target, int faces) {
        if(target==0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i<= faces && i<= target;i++){
            dicecustom(p+i,target-i,faces);
        }

    }

    static void dice(String p,int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target;i++){
            dice(p+i,target-i);
        }
    }
}
