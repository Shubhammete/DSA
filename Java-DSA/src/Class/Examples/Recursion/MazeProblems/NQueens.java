package Class.Examples.Recursion.MazeProblems;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board,0));
    }

    static int queens(boolean[][] board, int row){
        if(row == board.length){
            display(board);
            return 1;
        }
        int count = 0;
        // placing queen by checking each row and col in specific level
        for(int col = 0; col< board.length;col++){
            // place queen if safe
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count += queens(board,row+1);
                // backtracking -> when we come out of fxn call change it to normal
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for(int i = 0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        // diagonal left
        int maxleft = Math.min(row,col);
        for(int i = 1;i<=maxleft;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // diagonal right
        int maxright = Math.min(row,board.length-col-1);
        for(int i = 1;i<=maxright;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] arr : board){
            for(boolean elem : arr){
                if(elem){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
