package Class.Concepts.Arrays.Searching;

import java.util.Arrays;

public class BinarySearchinSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println(Arrays.toString(search(arr, 17)));
    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        // check for single array direct apply binary search
        if (rows == 1) {
            return BS(arr, target, rows - 1, 0, cols - 1);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols  / 2;

        // run while loop until two rows are remaining
        while (rowStart < (rowEnd - 1)  ) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (arr[mid][colMid] == target) {
                return new int[]{mid, colMid};
            }
            if (arr[mid][colMid] < target) {
                rowStart = mid ; // mid+1 and mid-1 will equate to each other so only mid
            } else {
                rowEnd = mid ;
            }
        }

        // check for elements in midCol
        if (arr[rowStart][colMid] == target) {
            return new int[]{rowStart, colMid};
        }
        if (arr[rowStart + 1][colMid] == target) {
            return new int[]{rowStart + 1, colMid};
        }
        // check for 1st half
        if (arr[rowStart][colMid - 1] >= target) {
            return BS(arr, target, rowStart, 0, colMid-1);
        }
        // 2nd half
        if (arr[rowStart][colMid + 1] <= target  && target <= arr[rowStart][cols-1]) {
            return BS(arr, target, rowStart , colMid + 1, cols - 1);
        }
        // 3rd half
        if (arr[rowStart+1][colMid - 1] >= target ) {
            return BS(arr, target, rowStart+1, 0, colMid-1);
        }else {
            return BS(arr, target, rowStart + 1, colMid + 1, cols - 1);
        }

//        return new int[]{};
    }



//
static int[] BS(int[][] matrix, int target, int row, int colStart,int colEnd){
    boolean isAsc = colStart < colEnd;
    while(colStart<=colEnd){
        int mid = colStart + (colEnd - colStart) /2;
        if(matrix[row][mid] == target){
            return new int[]{row,mid};
        }

            if(matrix[row][mid]<target){
                colStart = mid +1;
            }else{
                colEnd = mid - 1;

        }

    }
    return new int[]{-1,-1};
}

    }



