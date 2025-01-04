package Class.Examples.ArrayExamples.Searching.LinearSearch;

public class SumEachRow2D {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5}
                ,{7,3},
                {3,5}
    };
        System.out.println(maximumWealth(accounts));
        }
    public static int maximumWealth(int[][] accounts) {
        int maxSum = 0;  // global var to store maxSum

        for(int person = 0; person<accounts.length;person++){
            int sum = 0; // stores sum of each row and sets to zero after every loop executed
            for(int account = 0; account<accounts[person].length;account++){
                sum += accounts[person][account];
            }
            // if loop sum is max store in global max var
            if(maxSum < sum ){
                maxSum = sum;
            }
        }
        return maxSum;
    }

}
