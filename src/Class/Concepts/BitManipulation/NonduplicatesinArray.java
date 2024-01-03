package Class.Concepts.BitManipulation;

public class NonduplicatesinArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        System.out.println(duplicate(arr));
    }

    private static int duplicate(int[] arr) {
        int unique = 0;
        for(int ele: arr){
            unique ^= ele;
        }
        return unique;
    }
}
