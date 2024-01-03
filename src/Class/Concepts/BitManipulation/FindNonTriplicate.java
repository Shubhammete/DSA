package Class.Concepts.BitManipulation;

public class FindNonTriplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 2, 7, 8, 7, 8, 7, 8};
       String num = "";
        int n = 0;
        while(n<8) {
            int unique = 0;
            for (int i = 0;i<arr.length;i++) {
                unique += arr[i]&1;
                arr[i] = arr[i] >> 1;
            }
            num +=unique;
            n++;
            System.out.println(num);
        }

    }


}
