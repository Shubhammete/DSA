package Class.Examples.Recursion.MazeProblems;

import java.util.ArrayList;

public class Printpaths {
    public static void main(String[] args) {
        printPaths("",3,3);
        System.out.println(retprintPaths("",3,3));
    }

    private static void printPaths(String paths, int row, int col) {

        if(row == 1 && col == 1){
            System.out.println(paths);
            return;
        }

        if(row>1) {
            printPaths(paths + 'D', row-1, col);
        }
        if(col>1) {
            printPaths(paths + 'R', row, col-1);
        }

    }

    private static ArrayList<String> retprintPaths(String paths, int row, int col) {

        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(paths);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row>1) {
            list.addAll(retprintPaths(paths + 'D', row-1, col));
        }
        if(col>1) {
            list.addAll(retprintPaths(paths + 'R', row, col-1));
        }

        return list;
    }
}
