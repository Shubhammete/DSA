package Class.Concepts.Recursion.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{2,4,6,8,9},0));
    }

    private static boolean isSorted(int[] ints,int index) {
        if(index== ints.length-1){
            return true;
        }
        return ints[index]<ints[index+1] && isSorted(ints,index+1);
    }

}
