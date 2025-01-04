package Class.Examples.Recursion.MazeProblems;

import java.util.ArrayList;

public class DiagonalpathIncluded {
    public static void main(String[] args) {
        System.out.println(digonalpath(3,3));
        System.out.println(paths("",3,3));
    }

    static int digonalpath(int r, int c){
        if(r ==1 || c == 1){
            return 1;
        }

        int left=0,right=0,dia = 0;


            dia += digonalpath(r - 1, c - 1);
            left += digonalpath(r - 1, c);
            right += digonalpath(r, c - 1);


        return left+right+dia;
    }

    static ArrayList<String> paths(String path,int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if(row>1 && col>1){
            list.addAll(paths(path+"Diagonal ",row-1,col-1));
        }
        if(row>1){
            list.addAll(paths(path+"Down ",row-1,col));
        }
        if(col>1){
            list.addAll(paths(path+"Right ",row,col-1));
        }

        return list;
    }
}
