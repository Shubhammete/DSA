package Class.Concepts.Recursion.Pattern;

public class Triangle {
    public static void main(String[] args) {
        triangle(4,0);
        System.out.println();
        triangle2(4,0);
    }

    private static void triangle(int row, int col) {
        if(row == 0){
            return;
        }
        if(row>col){
            System.out.print("* ");
            triangle(row,++col);
        }else{
            System.out.println();
            triangle(--row,0);
        }
    }

    private static void triangle2(int row, int col) {
        if(row == 0){
            return;
        }
        if(row>col){
            triangle2(row,++col);
            System.out.print("* ");
        }else{
            triangle2(--row,0);
            System.out.println();
        }
    }
}
