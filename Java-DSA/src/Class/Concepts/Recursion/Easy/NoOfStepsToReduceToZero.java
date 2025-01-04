package Class.Concepts.Recursion.Easy;
//1342 leetcode

public class NoOfStepsToReduceToZero {
    public static void main(String[] args) {
        System.out.println(Calc(14,0));
    }


    static int Calc(int no, int count){
        if(no == 0){
            // return count and not function
            return count;
        }
        if(no%2==0){
            return Calc(no/2,++count);
        }else{
            return Calc(no-1,++count);
        }
    }
}
