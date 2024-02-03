package Class.Examples.Recursion.MazeProblems;

public class MazewithRestrictions {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,false},
                {true,true,true}
        };
        Restrictedpath("",board,0,0);
    }

    static void Restrictedpath(String path, boolean[][] maze,int row, int col){
        // check for false condition
        if(!maze[row][col]){
            return;
        }
        if(row == maze.length-1 || col == maze[0].length-1 ){
            System.out.println(path);
            return;
        }


        if(row < maze.length-1 && col < maze[0].length-1){
            Restrictedpath("Diagonal "+path,maze,row+1,col+1);
        }
        if(row < maze.length-1){
            Restrictedpath("Down "+path,maze,row+1,col);
        }
        if(col < maze[0].length-1){
            Restrictedpath("Right "+path,maze,row,col+1);
        }

    }
}
