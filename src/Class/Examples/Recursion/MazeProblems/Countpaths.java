package Class.Examples.Recursion.MazeProblems;

public class Countpaths {
    public static void main(String[] args) {
        System.out.println(count(0,3,3));
        System.out.println(printPaths(3,3));
    }

    static int count(int count, int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }

        count += count(count,--row,col);
        count += count(count,row,--col);

        return count;
    }
    private static int printPaths(int row, int col) {

        if(row == 1 && col == 1){
            return 1;
        }
        int left = 0, right = 0;
        if(row>1) {
            left += printPaths( row-1, col);
        }
        if(col>1) {
           right+= printPaths( row, col-1);
        }
        return right+left;
    }

}
