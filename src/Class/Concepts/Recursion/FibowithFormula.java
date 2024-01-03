package Class.Concepts.Recursion;

public class FibowithFormula {
    public static void main(String[] args) {
        System.out.println(findFibo(50));
        System.out.println(findFiboOptimised(50));
    }

    static long findFiboOptimised(int n){
        return (long)(Math.pow((1+Math.sqrt(5))/2,n)/Math.sqrt(5));
    }
    static long findFibo(int n){
        return (long)((Math.pow((1+Math.sqrt(5))/2,n)-Math.pow((1-Math.sqrt(5))/2,n))/Math.sqrt(5));
    }

}
