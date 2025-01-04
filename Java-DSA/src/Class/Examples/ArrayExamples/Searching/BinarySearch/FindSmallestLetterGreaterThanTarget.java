package Class.Examples.ArrayExamples.Searching.BinarySearch;
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'c';
        System.out.println(find(letters,target));
    }

    static char find(char[] letters, char target){
        int start = 0;
        int end = letters.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(target >= letters[mid]){   // try to keep returning index not to change like this added condition of equal to check same element
               start = mid + 1;
            }else{
                end = mid - 1;
            }
            // this could be more presise as we are manipulating end and not required of = condition
//            if(target < letters[mid]){
//                end = mid - 1;
//            }else{
//                start = mid + 1;
//            }

        }
        return letters[start % letters.length]; // returns 0 in case of element is greater than last element of array

    }
}
