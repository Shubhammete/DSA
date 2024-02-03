package Class.Examples.Recursion.MazeProblems;

import java.util.Arrays;

public class PrintallPaths {
    public static void main(String[] args) {
        boolean[][] board = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] patharr = new int[board.length][board[0].length];
        allpaths("",board,0,0,patharr,1);
    }

    private static void allpaths(String path, boolean[][] maze, int row, int col,int[][] paths, int step) {
        if(row == maze.length -1 && col == maze[0].length-1){
            // add step to location
            paths[row][col] = step;
            // print paths
            for(int[] patharr: paths){
                System.out.println(Arrays.toString(patharr));
            }
            System.out.println(path);
            System.out.println(step);
            return;
        }

        // check for false condition
        if(!maze[row][col]){
            return;
        }

        // consider this block in the current path
        maze[row][col] = false;
        paths[row][col] = step;

        if(row < maze.length-1 && col < maze[0].length-1){
            allpaths("Diagonal "+path,maze,row+1,col+1,paths,step+1);
        }
        if(row < maze.length-1){
            allpaths("Down "+path,maze,row+1,col,paths,step+1);
        }
        if(col < maze[0].length-1 ){
            allpaths("Right "+path,maze,row,col+1,paths,step+1);
        }

        if(row>0){
            allpaths("Up "+path,maze,row-1,col,paths,step+1);
        }

        if(col>0){
            allpaths("left "+path,maze,row,col-1,paths,step+1);
        }
        // here function call is over so remove the false
        maze[row][col] = true;
        paths[row][col] = 0;
    }
}
