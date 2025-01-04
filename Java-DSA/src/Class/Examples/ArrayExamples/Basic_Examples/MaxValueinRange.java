package Class.Examples.ArrayExamples.Basic_Examples;

import java.util.Scanner;

public class MaxValueinRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {2,4,36,57,68,6,6,43};
        System.out.println("Enter Range from which to find value ");
        int start = in.nextInt() - 1;
        int end = in.nextInt() - 1;
        System.out.println("The Max element from position "+start+ " to "+end+" is "+maxRange(arr,start,end));
    }

    private static int maxRange(int[] arr, int start, int end) {
        int max = arr[start-1];
        if(end>start){
            return -1;
        }
        if(arr.length ==0){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        for(int i = start-1;i<=end;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
