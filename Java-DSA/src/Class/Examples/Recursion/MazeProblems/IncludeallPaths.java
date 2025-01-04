package Class.Examples.Recursion.MazeProblems;

public class IncludeallPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        alldir("",board,0,0);
    }

    static void alldir(String path, boolean[][] maze,int row, int col){

        if(row == maze.length-1 && col == maze[0].length-1 ){
            System.out.println(path);
            return;
        }

        // check for false condition
        if(!maze[row][col]){
            return;
        }

        // consider this block in the current path
        maze[row][col] = false;

        if(row < maze.length-1 && col < maze[0].length-1){
            alldir("Diagonal "+path,maze,row+1,col+1);
        }
        if(row < maze.length-1){
            alldir("Down "+path,maze,row+1,col);
        }
        if(col < maze[0].length-1 ){
            alldir("Right "+path,maze,row,col+1);
        }

        if(row>0){
            alldir("Up "+path,maze,row-1,col);
        }

        if(col>0){
            alldir("Right "+path,maze,row,col-1);
        }
        // here function call is over so remove the false
        maze[row][col] = true;
    }
}
