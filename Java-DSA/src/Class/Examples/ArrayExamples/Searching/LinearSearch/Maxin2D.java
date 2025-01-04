package Class.Examples.ArrayExamples.Searching.LinearSearch;

public class Maxin2D {
    public static void main(String[] args) {
        int[][] arr = {
                {23,55,67},
                {22,5},
                {34,55,22,57}
        };
        System.out.println(max(arr));
    }

    private static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}
