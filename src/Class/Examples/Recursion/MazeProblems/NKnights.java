package Class.Examples.Recursion.MazeProblems;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        Nknights(board,0,0,4);
    }

    static void Nknights(boolean[][] board, int row, int col, int knights){

        // check if knights are over
        if(knights == 0){
            display(board);
            System.out.println();
            return;
        }
        // if row are out of bound then return
        if(row == board.length-1 && col == board.length){
            return;
        }

        // check for end of column if it is at end start from row 2
        if(col == board.length){
            Nknights(board,row+1,0,knights);
            return;
        }

        // check if we can put it or not
        if(isSafe(board,row,col)){
            board[row][col] = true;
            Nknights(board,row,col+1,knights-1);
            // backtrack
            board[row][col] = false;
        }
            // if not safe keep it as it is, do not increase knights
            Nknights(board, row, col + 1, knights);


    }

    static boolean isValid(boolean[][] board, int row, int col){
        if(row>=0 && row < board.length && col>=0 && col< board.length) {
            return true;
        }
        return false;
    }
    static boolean isSafe(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }
        return true;
    }


    static void display(boolean[][] board){
        for(boolean[] arr : board){
            for(boolean elem : arr){
                if(elem){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
