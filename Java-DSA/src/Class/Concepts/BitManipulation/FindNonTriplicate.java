package Class.Concepts.BitManipulation;

import java.util.Arrays;

public class FindNonTriplicate {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 2, 3, 2, 7, 8, 7, 8, 7, 8};
       String num = "";
       String revno = "";
        int n = 0;
        // here 8 because each byte has 8 bits
        while(n<8) {
            int unique = 0;
            for (int i = 0;i<arr.length;i++) {
                // adding last bit of each element
               unique += (arr[i]&1);
                // reducing last bit by right shift
                arr[i] = arr[i] >> 1;
            }
            num +=unique;
            n++;
        }

        for(int i = num.length()-1;i>=0;i--) {
            revno += num.charAt(i);
        }

    }


}
