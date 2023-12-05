package Class.Examples.ArrayExamples.Searching.LinearSearch;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNoitems {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,33,455};
        System.out.println(count(nums));
    }

    private static int count(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        if(noOfDigits(num)%2==0){
            return true;
        }
        return false;
    }

    private static int noOfDigits(int num) {
        if(num<0){
            num *= -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    // optimised solution for such
    private static int opnoOfDigits(int num) {
        if(num<0){
            num *= -1;
        }
        if(num == 0){
            return 1;
        }
        // shortcut to get no of digits
        return (int)(Math.log10(num)) + 1;
        // to get no digits in binary
        // (int)(Math.log2(num)) + 1;

    }
}





// code by converting into string and then finding length
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            int length = Integer.toString(i).length();
            if(length%2 == 0){
                count++;
            }
        }
        return count;
    }
}